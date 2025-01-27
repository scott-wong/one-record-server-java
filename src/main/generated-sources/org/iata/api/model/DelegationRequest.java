
package org.iata.api.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.api.Vocabulary;


/**
 * Delegation Request to 3rd parties
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_DelegationRequest)
public class DelegationRequest
    implements Serializable
{

    @Id(generated = true)
    protected String id;
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    protected Set<String> types;
    @Properties
    protected Map<String, Set<String>> properties;
    /**
     * Identifiers of the logistics objects to which the access is requested
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_targetLogisticsObjects)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Set<LogisticsObjectRef> targetLogisticsObjects;
    /**
     * REVOKE or DELEGATE
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_action)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected String action;
    /**
     * GET or PATCH
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_operations_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected Set<String> operations;
    /**
     * Parties that receive the delegated rights
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_targetCompanies)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected Set<String> targetCompanies;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return ((((("DelegationRequest {"+ name)+"<")+ id)+">")+"}");
    }

    public void setTargetLogisticsObjects(Set<LogisticsObjectRef> targetLogisticsObjects) {
        this.targetLogisticsObjects = targetLogisticsObjects;
    }

    public Set<LogisticsObjectRef> getTargetLogisticsObjects() {
        return targetLogisticsObjects;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setOperations(Set<String> operations) {
        this.operations = operations;
    }

    public Set<String> getOperations() {
        return operations;
    }

    public void setTargetCompanies(Set<String> targetCompanies) {
        this.targetCompanies = targetCompanies;
    }

    public Set<String> getTargetCompanies() {
        return targetCompanies;
    }

}
