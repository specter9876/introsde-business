
package introsde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per controlGoalActivity complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="controlGoalActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activity" type="{http://soap.document.introsde/}activity" minOccurs="0"/>
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
@XmlType(name = "controlGoalActivity", propOrder = {
    "activity",
    "idUser"
})
public class ControlGoalActivity {

    protected Activity activity;
    protected long idUser;

    /**
     * Recupera il valore della proprietà activity.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getActivity() {
        return activity;
    }

    /**
     * Imposta il valore della proprietà activity.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setActivity(Activity value) {
        this.activity = value;
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
