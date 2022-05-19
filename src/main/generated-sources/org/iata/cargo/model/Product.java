
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Product details
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Product)
public class Product
    extends LogisticsObject
    implements Serializable
{

    /**
     * Charateristics of the product
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_characteristics)
    protected Set<Characteristics> characteristics;
    /**
     * Reference to the Items in which the product can be found.
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_isInItems)
    protected Set<Item> isInItems;
    /**
     * Reference to the pieces where the product can be found. This needs to be filled in case there is no Item
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_isInPieces)
    protected Set<Piece> isInPieces;
    /**
     * Manufacturing company details and contacts
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_manufacturer)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Company manufacturer;
    /**
     * Other product identifier (e.g. Bar code, UPC, EAN, Amazon)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_otherIdentifier_A)
    protected Set<OtherIdentifier> otherIdentifier;
    /**
     * Indicates the specific commodity on which the rate class code is applied
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_commodityItemNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String commodityItemNumber;
    /**
     * Harmonized Commodity code, refer to hsType used. 6 minimum digits are expected.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_hsCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String hsCode;
    /**
     * Commodity description
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_hsCommodityDescription)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String hsCommodityDescription;
    /**
     * If no Code provided, name of commodity
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_hsCommodityName)
    protected Set<String> hsCommodityName;
    /**
     * Reference identifying the type of standard code to be used for the Commodity Classification (Brussels Tariff Nomenclature, EU Harmonized System Code, UN Standard International Trade Classification). Mandatory if the commodity code is more than 6 digits
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_hsType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String hsType;
    /**
     * Product description
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_productDescription_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String productDescription;
    /**
     * Manufacturer's unique product identifier
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_productIdentifier)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String productIdentifier;

    public void setCharacteristics(Set<Characteristics> characteristics) {
        this.characteristics = characteristics;
    }

    public Set<Characteristics> getCharacteristics() {
        return characteristics;
    }

    public void setIsInItems(Set<Item> isInItems) {
        this.isInItems = isInItems;
    }

    public Set<Item> getIsInItems() {
        return isInItems;
    }

    public void setIsInPieces(Set<Piece> isInPieces) {
        this.isInPieces = isInPieces;
    }

    public Set<Piece> getIsInPieces() {
        return isInPieces;
    }

    public void setManufacturer(Company manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Company getManufacturer() {
        return manufacturer;
    }

    public void setOtherIdentifier(Set<OtherIdentifier> otherIdentifier) {
        this.otherIdentifier = otherIdentifier;
    }

    public Set<OtherIdentifier> getOtherIdentifier() {
        return otherIdentifier;
    }

    public void setCommodityItemNumber(String commodityItemNumber) {
        this.commodityItemNumber = commodityItemNumber;
    }

    public String getCommodityItemNumber() {
        return commodityItemNumber;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    public String getHsCode() {
        return hsCode;
    }

    public void setHsCommodityDescription(String hsCommodityDescription) {
        this.hsCommodityDescription = hsCommodityDescription;
    }

    public String getHsCommodityDescription() {
        return hsCommodityDescription;
    }

    public void setHsCommodityName(Set<String> hsCommodityName) {
        this.hsCommodityName = hsCommodityName;
    }

    public Set<String> getHsCommodityName() {
        return hsCommodityName;
    }

    public void setHsType(String hsType) {
        this.hsType = hsType;
    }

    public String getHsType() {
        return hsType;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    public String getProductIdentifier() {
        return productIdentifier;
    }

}
