
package introsde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getRelatedActivityToHealthType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getRelatedActivityToHealthType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="healthMeasureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getRelatedActivityToHealthType", propOrder = {
    "healthMeasureType",
    "idUser"
})
public class GetRelatedActivityToHealthType {

    protected String healthMeasureType;
    protected long idUser;

    /**
     * Recupera il valore della proprietà healthMeasureType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthMeasureType() {
        return healthMeasureType;
    }

    /**
     * Imposta il valore della proprietà healthMeasureType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthMeasureType(String value) {
        this.healthMeasureType = value;
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
