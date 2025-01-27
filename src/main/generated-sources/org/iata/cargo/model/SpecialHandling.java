
package org.iata.cargo.model;

import java.io.Serializable;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Special handling details
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_SpecialHandling)
public class SpecialHandling
    extends LogisticsObject
    implements Serializable
{

    /**
     * Special handling code following IATA standards. Refer CXML1.16,  e.g. PEP - Fruits and Vegetables
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_code_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String code;
    /**
     * Special handling text
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_handlingText)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String handlingText;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setHandlingText(String handlingText) {
        this.handlingText = handlingText;
    }

    public String getHandlingText() {
        return handlingText;
    }

}
