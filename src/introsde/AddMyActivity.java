
package introsde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addMyActivity complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addMyActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activityIn" type="{http://soap.document.introsde/}activity" minOccurs="0"/>
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
@XmlType(name = "addMyActivity", propOrder = {
    "activityIn",
    "idUser"
})
public class AddMyActivity {

    protected Activity activityIn;
    protected long idUser;

    /**
     * Recupera il valore della proprietà activityIn.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getActivityIn() {
        return activityIn;
    }

    /**
     * Imposta il valore della proprietà activityIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setActivityIn(Activity value) {
        this.activityIn = value;
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
