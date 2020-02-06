
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
 * This class was generated by OWL2Java 0.13.3
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
    protected Set<Country> country;
    /**
     * Address identifier using special coding systems e.g. US CBP FIRMS code
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_addressCode)
    protected Set<String> addressCode;
    /**
     * Type of address code e.g. US CBP FIRMS
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_addressCodeType)
    protected Set<String> addressCodeType;
    /**
     * UN/LOCODE city code (5 letter) or IATA city code (3 letter)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_cityCode)
    protected Set<String> cityCode;
    /**
     * If no CityCode provided, full name of the city 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_cityName)
    protected Set<String> cityName;
    /**
     * Post Office box number / code
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_pOBox)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String pOBox;
    /**
     * Postal / ZIP code
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_postalCode)
    protected Set<String> postalCode;
    /**
     * Region/ State / Department. Refer ISO 3166-2  
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_regionCode)
    protected Set<String> regionCode;
    /**
     * If no StateCode provided, full name of the region / state / province / canton
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_regionName)
    protected Set<String> regionName;
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

    public void setCountry(Set<Country> country) {
        this.country = country;
    }

    public Set<Country> getCountry() {
        return country;
    }

    public void setAddressCode(Set<String> addressCode) {
        this.addressCode = addressCode;
    }

    public Set<String> getAddressCode() {
        return addressCode;
    }

    public void setAddressCodeType(Set<String> addressCodeType) {
        this.addressCodeType = addressCodeType;
    }

    public Set<String> getAddressCodeType() {
        return addressCodeType;
    }

    public void setCityCode(Set<String> cityCode) {
        this.cityCode = cityCode;
    }

    public Set<String> getCityCode() {
        return cityCode;
    }

    public void setCityName(Set<String> cityName) {
        this.cityName = cityName;
    }

    public Set<String> getCityName() {
        return cityName;
    }

    public void setPOBox(String pOBox) {
        this.pOBox = pOBox;
    }

    public String getPOBox() {
        return pOBox;
    }

    public void setPostalCode(Set<String> postalCode) {
        this.postalCode = postalCode;
    }

    public Set<String> getPostalCode() {
        return postalCode;
    }

    public void setRegionCode(Set<String> regionCode) {
        this.regionCode = regionCode;
    }

    public Set<String> getRegionCode() {
        return regionCode;
    }

    public void setRegionName(Set<String> regionName) {
        this.regionName = regionName;
    }

    public Set<String> getRegionName() {
        return regionName;
    }

    public void setStreet(Set<String> street) {
        this.street = street;
    }

    public Set<String> getStreet() {
        return street;
    }

}