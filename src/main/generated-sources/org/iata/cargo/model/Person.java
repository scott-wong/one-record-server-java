
package org.iata.cargo.model;

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
import org.iata.cargo.Vocabulary;


/**
 * Person details
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Person)
public class Person
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
     * Refers to the Branch the person is associated with
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_associatedBranch)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected CompanyBranch associatedBranch;
    /**
     * Contact details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_contact)
    protected Set<Contact> contact;
    /**
     * Linked documents to the person, e.g. driver's license, ID, etc.
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_documents)
    protected Set<ExternalReference> documents;
    /**
     * Contact type - e.g. Emergency contact, Customs contact, Customer contact
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_contactType_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String contactType;
    /**
     * Department / Division / Unit
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_department)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String department;
    /**
     * Employee ID
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_employeeId)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String employeeId;
    /**
     * First name / given name
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_firstName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String firstName;
    /**
     * Job title / position
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_jobTitle)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String jobTitle;
    /**
     * Last name / family name / surname
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_lastName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String lastName;
    /**
     * Middle name/ other name
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_middleName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String middleName;
    /**
     * Salutation 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_salutation)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String salutation;

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
        return ((((("Person {"+ name)+"<")+ id)+">")+"}");
    }

    public void setAssociatedBranch(CompanyBranch associatedBranch) {
        this.associatedBranch = associatedBranch;
    }

    public CompanyBranch getAssociatedBranch() {
        return associatedBranch;
    }

    public void setContact(Set<Contact> contact) {
        this.contact = contact;
    }

    public Set<Contact> getContact() {
        return contact;
    }

    public void setDocuments(Set<ExternalReference> documents) {
        this.documents = documents;
    }

    public Set<ExternalReference> getDocuments() {
        return documents;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactType() {
        return contactType;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getSalutation() {
        return salutation;
    }

}
