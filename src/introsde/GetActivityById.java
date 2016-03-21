
package introsde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getActivityById complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getActivityById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idActivity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getActivityById", propOrder = {
    "idActivity"
})
public class GetActivityById {

    protected Long idActivity;

    /**
     * Recupera il valore della proprietà idActivity.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdActivity() {
        return idActivity;
    }

    /**
     * Imposta il valore della proprietà idActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdActivity(Long value) {
        this.idActivity = value;
    }

}
