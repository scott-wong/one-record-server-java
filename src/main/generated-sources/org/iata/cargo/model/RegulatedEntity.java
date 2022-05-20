
package org.iata.cargo.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
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
import org.iata.cargo.Vocabulary;


/**
 * Regulated Entity
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_RegulatedEntity)
public class RegulatedEntity
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
     * Branch/Company
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_entity)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Branch entity;
    /**
     * Regulated entity identifier (e.g. Regulated Agent Identifier) is mandatory
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_regulatedEntityIdentifier)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Company regulatedEntityIdentifier;
    /**
     * Expiry date 4 digits month/year
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_expiryDate_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    protected OffsetDateTime expiryDate;
    /**
     * Party type - e.g. RA - Regulated Agent, KC - Known Consignor, AO - Aircraft Operator, RC - Regulated Carrier
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_regulatedEntityCategory)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String regulatedEntityCategory;

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
        return ((((("RegulatedEntity {"+ name)+"<")+ id)+">")+"}");
    }

    public void setEntity(Branch entity) {
        this.entity = entity;
    }

    public Branch getEntity() {
        return entity;
    }

    public void setRegulatedEntityIdentifier(Company regulatedEntityIdentifier) {
        this.regulatedEntityIdentifier = regulatedEntityIdentifier;
    }

    public Company getRegulatedEntityIdentifier() {
        return regulatedEntityIdentifier;
    }

    public void setExpiryDate(OffsetDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public OffsetDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setRegulatedEntityCategory(String regulatedEntityCategory) {
        this.regulatedEntityCategory = regulatedEntityCategory;
    }

    public String getRegulatedEntityCategory() {
        return regulatedEntityCategory;
    }

}
