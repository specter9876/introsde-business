
package introsde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per activity complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="activity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calories" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="idActivity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idUser" type="{http://soap.document.introsde/}user" minOccurs="0"/>
 *         &lt;element name="isMyActivity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activity", namespace = "http://soap.document.introsde/", propOrder = {
    "calories",
    "description",
    "duration",
    "idActivity",
    "idUser",
    "isMyActivity",
    "name",
    "type",
    "value"
})
public class Activity {

    protected double calories;
    protected String description;
    protected double duration;
    protected long idActivity;
    protected User idUser;
    protected int isMyActivity;
    protected String name;
    protected String type;
    protected double value;

    /**
     * Recupera il valore della proprietà calories.
     * 
     */
    public double getCalories() {
        return calories;
    }

    /**
     * Imposta il valore della proprietà calories.
     * 
     */
    public void setCalories(double value) {
        this.calories = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà duration.
     * 
     */
    public double getDuration() {
        return duration;
    }

    /**
     * Imposta il valore della proprietà duration.
     * 
     */
    public void setDuration(double value) {
        this.duration = value;
    }

    /**
     * Recupera il valore della proprietà idActivity.
     * 
     */
    public long getIdActivity() {
        return idActivity;
    }

    /**
     * Imposta il valore della proprietà idActivity.
     * 
     */
    public void setIdActivity(long value) {
        this.idActivity = value;
    }

    /**
     * Recupera il valore della proprietà idUser.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getIdUser() {
        return idUser;
    }

    /**
     * Imposta il valore della proprietà idUser.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setIdUser(User value) {
        this.idUser = value;
    }

    /**
     * Recupera il valore della proprietà isMyActivity.
     * 
     */
    public int getIsMyActivity() {
        return isMyActivity;
    }

    /**
     * Imposta il valore della proprietà isMyActivity.
     * 
     */
    public void setIsMyActivity(int value) {
        this.isMyActivity = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

}
