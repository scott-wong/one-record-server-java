
package org.iata.cargo.model;

import java.io.Serializable;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Insurance details
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Insurance)
public class Insurance
    extends LogisticsObject
    implements Serializable
{

    /**
     * Party covering the insurance 
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_coveringParty)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Company coveringParty;
    /**
     * Insured amount - amount covered by the insurance policy
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_insuranceAmount)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Value insuranceAmount;
    /**
     * Reference to the shipment insured
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_insuranceShipment)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Shipment insuranceShipment;
    /**
     * When no value is declared for Insurance this field should be completed with the value TRUE otherwise FALSE
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_nvdIndicator)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    protected Boolean nvdIndicator;

    public void setCoveringParty(Company coveringParty) {
        this.coveringParty = coveringParty;
    }

    public Company getCoveringParty() {
        return coveringParty;
    }

    public void setInsuranceAmount(Value insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public Value getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceShipment(Shipment insuranceShipment) {
        this.insuranceShipment = insuranceShipment;
    }

    public Shipment getInsuranceShipment() {
        return insuranceShipment;
    }

    public void setNvdIndicator(Boolean nvdIndicator) {
        this.nvdIndicator = nvdIndicator;
    }

    public Boolean getNvdIndicator() {
        return nvdIndicator;
    }

}
