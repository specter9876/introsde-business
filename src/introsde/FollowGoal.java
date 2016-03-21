
package introsde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per followGoal complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="followGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="goalIn" type="{http://soap.document.introsde/}goal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "followGoal", propOrder = {
    "idUser",
    "goalIn"
})
public class FollowGoal {

    protected long idUser;
    protected Goal goalIn;

    /**
     * Recupera il valore della proprietà idUser.
     * 
     */
    public long getIdUser() {
        return idUser;
    }

    /**
     * Imposta il valore della proprietà idUser.
     * 
     */
    public void setIdUser(long value) {
        this.idUser = value;
    }

    /**
     * Recupera il valore della proprietà goalIn.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getGoalIn() {
        return goalIn;
    }

    /**
     * Imposta il valore della proprietà goalIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setGoalIn(Goal value) {
        this.goalIn = value;
    }

}
