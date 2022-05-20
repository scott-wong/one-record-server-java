
package org.iata.cargo.model;

import java.io.Serializable;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Service request details
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_ServiceRequest)
public class ServiceRequest
    extends LogisticsObject
    implements Serializable
{

    /**
     * Service request code
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_code_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String code;
    /**
     * Service request description
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_serviceRequestDescription)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String serviceRequestDescription;
    /**
     * Service request statement text
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_statementText)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String statementText;
    /**
     * Service request statement type - e.g. Dangerous Goods, Lithium Ion Battery, Live Animal Certificate
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_statementType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String statementType;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setServiceRequestDescription(String serviceRequestDescription) {
        this.serviceRequestDescription = serviceRequestDescription;
    }

    public String getServiceRequestDescription() {
        return serviceRequestDescription;
    }

    public void setStatementText(String statementText) {
        this.statementText = statementText;
    }

    public String getStatementText() {
        return statementText;
    }

    public void setStatementType(String statementType) {
        this.statementType = statementType;
    }

    public String getStatementType() {
        return statementType;
    }

}
