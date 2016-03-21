
package introsde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per controlGoalHealth complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="controlGoalHealth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="healthMeasure" type="{http://soap.document.introsde/}healthMeasure" minOccurs="0"/>
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "controlGoalHealth", propOrder = {
    "healthMeasure",
    "idUser"
})
public class ControlGoalHealth {

    protected HealthMeasure healthMeasure;
    protected long idUser;

    /**
     * Recupera il valore della proprietà healthMeasure.
     * 
     * @return
     *     possible object is
     *     {@link HealthMeasure }
     *     
     */
    public HealthMeasure getHealthMeasure() {
        return healthMeasure;
    }

    /**
     * Imposta il valore della proprietà healthMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthMeasure }
     *     
     */
    public void setHealthMeasure(HealthMeasure value) {
        this.healthMeasure = value;
    }

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

}
