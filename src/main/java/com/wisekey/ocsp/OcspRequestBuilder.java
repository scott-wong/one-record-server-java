package com.wisekey.ocsp;

import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.ocsp.CertificateID;
import org.bouncycastle.cert.ocsp.OCSPException;
import org.bouncycastle.cert.ocsp.OCSPReq;
import org.bouncycastle.cert.ocsp.OCSPReqBuilder;
import org.bouncycastle.operator.DigestCalculator;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

class OcspRequestBuilder {
  private static final SecureRandom GENERATOR = new SecureRandom();

  private SecureRandom generator = GENERATOR;

  private DigestCalculator calculator = Digester.sha1();

  private X509Certificate certificate;

  private X509Certificate issuer;

  OcspRequestBuilder certificate(X509Certificate certificate) {
    this.certificate = certificate;
    return this;
  }

  OcspRequestBuilder issuer(X509Certificate issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * ATTENTION: The returned {@link OCSPReq} is not re-usable/cacheable! It
   * contains a one-time nonce and CA's will (should) reject subsequent requests
   * that have the same nonce value.
   */
  OCSPReq build() throws OCSPException, IOException, CertificateEncodingException {
    SecureRandom generator = this.generator;
    DigestCalculator calculator = this.calculator;
    X509Certificate certificate = this.certificate;
    X509Certificate issuer = this.issuer;

    BigInteger serial = certificate.getSerialNumber();

    CertificateID certId = new CertificateID(calculator, new X509CertificateHolder(issuer.getEncoded()), serial);

    OCSPReqBuilder builder = new OCSPReqBuilder();
    builder.addRequest(certId);

    byte[] nonce = new byte[8];
    generator.nextBytes(nonce);

    Extension[] extensions = new Extension[] {new Extension(OCSPObjectIdentifiers.id_pkix_ocsp_nonce, false, new DEROctetString(nonce)) };

    builder.setRequestExtensions(new Extensions(extensions));

    return builder.build();
  }

}
