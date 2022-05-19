
package org.iata.cargo.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Routing details
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Routing)
public class Routing
    extends LogisticsObject
    implements Serializable
{

    /**
     * Reference to the BookingOption where the Routing is used
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_bookingOption_A_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected BookingOption bookingOption;
    /**
     * Scheduled Legs class to be used to identify legs. Can be used with Booking Option Request as an indicator of preferred Routing or with Booking Option when a carrier proposes a specific Routing.
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_scheduledLegs)
    protected Set<ScheduledLegs> scheduledLegs;
    /**
     * Aircraft possibility code
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_aircraftPossibilityCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String aircraftPossibilityCode;
    /**
     * Latest Arrival date time (requested or proposed)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_latestArrivalDateTime)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    protected OffsetDateTime latestArrivalDateTime;
    /**
     * Maximum number of connections of the transport movement (requested or proposed)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_maxConnections)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1)
    })
    protected Integer maxConnections;
    /**
     * Indicates interlining (requested or proposed)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_onlineInd)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    protected Boolean onlineInd;
    /**
     * Indicates if RFS (Road Feeder Services) is included (requested or proposed)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_rfsInd)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    protected Boolean rfsInd;

    public void setBookingOption(BookingOption bookingOption) {
        this.bookingOption = bookingOption;
    }

    public BookingOption getBookingOption() {
        return bookingOption;
    }

    public void setScheduledLegs(Set<ScheduledLegs> scheduledLegs) {
        this.scheduledLegs = scheduledLegs;
    }

    public Set<ScheduledLegs> getScheduledLegs() {
        return scheduledLegs;
    }

    public void setAircraftPossibilityCode(String aircraftPossibilityCode) {
        this.aircraftPossibilityCode = aircraftPossibilityCode;
    }

    public String getAircraftPossibilityCode() {
        return aircraftPossibilityCode;
    }

    public void setLatestArrivalDateTime(OffsetDateTime latestArrivalDateTime) {
        this.latestArrivalDateTime = latestArrivalDateTime;
    }

    public OffsetDateTime getLatestArrivalDateTime() {
        return latestArrivalDateTime;
    }

    public void setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    public Integer getMaxConnections() {
        return maxConnections;
    }

    public void setOnlineInd(Boolean onlineInd) {
        this.onlineInd = onlineInd;
    }

    public Boolean getOnlineInd() {
        return onlineInd;
    }

    public void setRfsInd(Boolean rfsInd) {
        this.rfsInd = rfsInd;
    }

    public Boolean getRfsInd() {
        return rfsInd;
    }

}
