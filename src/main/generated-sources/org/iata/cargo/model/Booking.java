
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Booking details - Deprecated, BookingOption should be used instead
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Booking)
public class Booking
    extends LogisticsObject
    implements Serializable
{

    /**
     * Carrier details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_carrier)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Set<Company> carrier;
    /**
     * Reference to the Carrier products included in the offer
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_carrierProductInfo)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected CarrierProduct carrierProductInfo;
    /**
     * Consignee details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_consignee)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Company consignee;
    /**
     * Freight Forwarder details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_freightForwarder)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Set<Company> freightForwarder;
    /**
     * Other parties to be notified of the booking evolution
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_notifyParty)
    protected Set<Company> notifyParty;
    /**
     * Price of the Booking (if different from the offer)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_price)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Price price;
    /**
     * Reference to the Request
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_requestRef)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Request requestRef;
    /**
     * Routing details of the offer, to be compared with routing preferences of the quote request
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_routing)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Routing routing;
    /**
     * Details of the shipement that is to be shipped
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_shipmentDetails)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Shipment shipmentDetails;
    /**
     * Shipper information
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_shipper)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Company shipper;
    /**
     * Transport segment linked to the offer, including the Departure and Arrival locations
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportMovement)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected TransportSegment transportMovement;
    /**
     * House or Master Waybill unique identifier
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_waybillNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Waybill waybillNumber;

    public void setCarrier(Set<Company> carrier) {
        this.carrier = carrier;
    }

    public Set<Company> getCarrier() {
        return carrier;
    }

    public void setCarrierProductInfo(CarrierProduct carrierProductInfo) {
        this.carrierProductInfo = carrierProductInfo;
    }

    public CarrierProduct getCarrierProductInfo() {
        return carrierProductInfo;
    }

    public void setConsignee(Company consignee) {
        this.consignee = consignee;
    }

    public Company getConsignee() {
        return consignee;
    }

    public void setFreightForwarder(Set<Company> freightForwarder) {
        this.freightForwarder = freightForwarder;
    }

    public Set<Company> getFreightForwarder() {
        return freightForwarder;
    }

    public void setNotifyParty(Set<Company> notifyParty) {
        this.notifyParty = notifyParty;
    }

    public Set<Company> getNotifyParty() {
        return notifyParty;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }

    public void setRequestRef(Request requestRef) {
        this.requestRef = requestRef;
    }

    public Request getRequestRef() {
        return requestRef;
    }

    public void setRouting(Routing routing) {
        this.routing = routing;
    }

    public Routing getRouting() {
        return routing;
    }

    public void setShipmentDetails(Shipment shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    public Shipment getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipper(Company shipper) {
        this.shipper = shipper;
    }

    public Company getShipper() {
        return shipper;
    }

    public void setTransportMovement(TransportSegment transportMovement) {
        this.transportMovement = transportMovement;
    }

    public TransportSegment getTransportMovement() {
        return transportMovement;
    }

    public void setWaybillNumber(Waybill waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public Waybill getWaybillNumber() {
        return waybillNumber;
    }

}
