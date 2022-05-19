
package org.iata.cargo.model;

import java.io.Serializable;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Carrier product details
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_CarrierProduct)
public class CarrierProduct
    extends LogisticsObject
    implements Serializable
{

    /**
     * Reference to the BookingOption where the carrier product is used
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_bookingOption_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected BookingOption bookingOption;
    /**
     * Carrier's product code
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_productCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String productCode;
    /**
     * Carrier's product description
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_productDescription)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String productDescription;

    public void setBookingOption(BookingOption bookingOption) {
        this.bookingOption = bookingOption;
    }

    public BookingOption getBookingOption() {
        return bookingOption;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductDescription() {
        return productDescription;
    }

}
