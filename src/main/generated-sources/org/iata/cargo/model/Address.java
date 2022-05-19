
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
 * Address details
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Address)
public class Address
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
     * Country details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_country)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Country country;
    /**
     * Address identifier using special coding systems e.g. US CBP FIRMS code
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_addressCode)
    protected Set<String> addressCode;
    /**
     * UN/LOCODE city code (5 letter) or IATA city code (3 letter)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_cityCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String cityCode;
    /**
     * If no CityCode provided, full name of the city 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_cityName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String cityName;
    /**
     * Post Office box number / code
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_poBox)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String poBox;
    /**
     * Postal / ZIP code
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_postalCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String postalCode;
    /**
     * Region/ State / Department. Refer ISO 3166-2
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_regionCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String regionCode;
    /**
     * If no StateCode provided, full name of the region / state / province / canton
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_regionName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String regionName;
    /**
     * Street address including street name, street number, building number, apartment etc
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_street)
    protected Set<String> street;

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
        return ((((("Address {"+ name)+"<")+ id)+">")+"}");
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setAddressCode(Set<String> addressCode) {
        this.addressCode = addressCode;
    }

    public Set<String> getAddressCode() {
        return addressCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setStreet(Set<String> street) {
        this.street = street;
    }

    public Set<String> getStreet() {
        return street;
    }

}
