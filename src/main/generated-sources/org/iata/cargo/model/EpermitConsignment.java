
package org.iata.cargo.model;

import java.io.Serializable;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Details of the pieces (Live animals) of the permit and specific information such as quantity measured and used to date quota
 * 
 * This class was generated by OWL2Java 0.18.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_EpermitConsignment)
public class EpermitConsignment
    extends LogisticsObject
    implements Serializable
{

    /**
     * Reference to te pieces (Live Animals) of the permit
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_consignmentItems)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected PieceLiveAnimals consignmentItems;
    /**
     * Quatity measured by the examining authority (box 14)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_examiningQuantity)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Value examiningQuantity;
    /**
     * total number of specimens exported in the current calendar year and the current annuela quota for the species concerned (box 11a)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_usedToDateQuotaQuantity)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1)
    })
    protected Integer usedToDateQuotaQuantity;

    public void setConsignmentItems(PieceLiveAnimals consignmentItems) {
        this.consignmentItems = consignmentItems;
    }

    public PieceLiveAnimals getConsignmentItems() {
        return consignmentItems;
    }

    public void setExaminingQuantity(Value examiningQuantity) {
        this.examiningQuantity = examiningQuantity;
    }

    public Value getExaminingQuantity() {
        return examiningQuantity;
    }

    public void setUsedToDateQuotaQuantity(Integer usedToDateQuotaQuantity) {
        this.usedToDateQuotaQuantity = usedToDateQuotaQuantity;
    }

    public Integer getUsedToDateQuotaQuantity() {
        return usedToDateQuotaQuantity;
    }

}
