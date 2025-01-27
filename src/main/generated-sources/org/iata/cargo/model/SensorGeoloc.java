
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import org.iata.cargo.Vocabulary;


/**
 * Sensor measurements details for Geolocation sensors (sensorType = "Geolocation")
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_SensorGeoloc)
public class SensorGeoloc
    extends Sensor
    implements Serializable
{

    /**
     * Reference to the measurements recorded by the geolocation sensor
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_val)
    protected Set<MeasurementsGeoloc> val;

    public void setVal(Set<MeasurementsGeoloc> val) {
        this.val = val;
    }

    public Set<MeasurementsGeoloc> getVal() {
        return val;
    }

}
