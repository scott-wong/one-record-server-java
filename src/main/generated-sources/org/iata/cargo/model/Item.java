
package org.iata.cargo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import java.util.Set;


/**
 * Item details
 * 
 * This class was generated by OWL2Java 0.14.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Item)
public class Item
    implements Serializable
{

    @Id(generated = true)
@JsonProperty("@id")
    protected String id;
    @JsonIgnore
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @JsonIgnore
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
@JsonProperty("@type")
    protected Set<String> types;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;
    /**
     * Dimensions of the item
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_dimensions)
    protected Set<Dimensions> dimensions;
    /**
     * Event details e.g. DEP, ARR, FOH, RCS, security screening, etc
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_event_A)
    protected Set<Event> event;
    /**
     * URI of the PIECE that contains the Item
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_isInPiece)
    protected Set<Piece> isInPiece;
    /**
     * Other identifier details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_otherIdentifier_A)
    protected Set<OtherIdentifier> otherIdentifier;
    /**
     * URI of the product
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_product)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Set<Product> product;
    /**
     * Production country details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_productionCountry)
    protected Set<Country> productionCountry;
    /**
     * Item target country
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_targetCountry)
    protected Set<Country> targetCountry;
    /**
     * Product price per unit in the base
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_unitPrice)
    protected Set<Value> unitPrice;
    /**
     * Weight of the item
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_weight)
    protected Set<Value> weight;
    /**
     * Production batch number / reference
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_batchNumber)
    protected Set<String> batchNumber;
    /**
     * Production lot number / reference
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_lotNumber)
    protected Set<String> lotNumber;
    /**
     * Product expiry date - e.g. for perishables goods or goods with programmed obsolescence
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_productExpiryDate)
    protected Set<Date> productExpiryDate;
    /**
     * Production date
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_productionDate)
    protected Set<Date> productionDate;
    /**
     * Product quantity for unit price - e.g. 12 (eggs for one USD 1)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_quantityForUnitPrice)
    protected Set<BigDecimal> quantityForUnitPrice;

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
        return ((((("Item {"+ name)+"<")+ id)+">")+"}");
    }

    public void setDimensions(Set<Dimensions> dimensions) {
        this.dimensions = dimensions;
    }

    public Set<Dimensions> getDimensions() {
        return dimensions;
    }

    public void setEvent(Set<Event> event) {
        this.event = event;
    }

    public Set<Event> getEvent() {
        return event;
    }

    public void setIsInPiece(Set<Piece> isInPiece) {
        this.isInPiece = isInPiece;
    }

    public Set<Piece> getIsInPiece() {
        return isInPiece;
    }

    public void setOtherIdentifier(Set<OtherIdentifier> otherIdentifier) {
        this.otherIdentifier = otherIdentifier;
    }

    public Set<OtherIdentifier> getOtherIdentifier() {
        return otherIdentifier;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProductionCountry(Set<Country> productionCountry) {
        this.productionCountry = productionCountry;
    }

    public Set<Country> getProductionCountry() {
        return productionCountry;
    }

    public void setTargetCountry(Set<Country> targetCountry) {
        this.targetCountry = targetCountry;
    }

    public Set<Country> getTargetCountry() {
        return targetCountry;
    }

    public void setUnitPrice(Set<Value> unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Set<Value> getUnitPrice() {
        return unitPrice;
    }

    public void setWeight(Set<Value> weight) {
        this.weight = weight;
    }

    public Set<Value> getWeight() {
        return weight;
    }

    public void setBatchNumber(Set<String> batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Set<String> getBatchNumber() {
        return batchNumber;
    }

    public void setLotNumber(Set<String> lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Set<String> getLotNumber() {
        return lotNumber;
    }

    public void setProductExpiryDate(Set<Date> productExpiryDate) {
        this.productExpiryDate = productExpiryDate;
    }

    public Set<Date> getProductExpiryDate() {
        return productExpiryDate;
    }

    public void setProductionDate(Set<Date> productionDate) {
        this.productionDate = productionDate;
    }

    public Set<Date> getProductionDate() {
        return productionDate;
    }

    public void setQuantityForUnitPrice(Set<BigDecimal> quantityForUnitPrice) {
        this.quantityForUnitPrice = quantityForUnitPrice;
    }

    public Set<BigDecimal> getQuantityForUnitPrice() {
        return quantityForUnitPrice;
    }

}
