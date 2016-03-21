
package introsde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per goal complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="idGoal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idUser" type="{http://soap.document.introsde/}user" minOccurs="0"/>
 *         &lt;element name="initialValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="isAchieved" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="progress" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="startAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goal", namespace = "http://soap.document.introsde/", propOrder = {
    "description",
    "endAt",
    "endValue",
    "idGoal",
    "idUser",
    "initialValue",
    "isAchieved",
    "name",
    "progress",
    "startAt",
    "type"
})
public class Goal {

    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endAt;
    protected double endValue;
    protected long idGoal;
    protected User idUser;
    protected double initialValue;
    protected int isAchieved;
    protected String name;
    protected double progress;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startAt;
    protected String type;

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
     * Recupera il valore della proprietà endAt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndAt() {
        return endAt;
    }

    /**
     * Imposta il valore della proprietà endAt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndAt(XMLGregorianCalendar value) {
        this.endAt = value;
    }

    /**
     * Recupera il valore della proprietà endValue.
     * 
     */
    public double getEndValue() {
        return endValue;
    }

    /**
     * Imposta il valore della proprietà endValue.
     * 
     */
    public void setEndValue(double value) {
        this.endValue = value;
    }

    /**
     * Recupera il valore della proprietà idGoal.
     * 
     */
    public long getIdGoal() {
        return idGoal;
    }

    /**
     * Imposta il valore della proprietà idGoal.
     * 
     */
    public void setIdGoal(long value) {
        this.idGoal = value;
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
     * Recupera il valore della proprietà initialValue.
     * 
     */
    public double getInitialValue() {
        return initialValue;
    }

    /**
     * Imposta il valore della proprietà initialValue.
     * 
     */
    public void setInitialValue(double value) {
        this.initialValue = value;
    }

    /**
     * Recupera il valore della proprietà isAchieved.
     * 
     */
    public int getIsAchieved() {
        return isAchieved;
    }

    /**
     * Imposta il valore della proprietà isAchieved.
     * 
     */
    public void setIsAchieved(int value) {
        this.isAchieved = value;
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
     * Recupera il valore della proprietà progress.
     * 
     */
    public double getProgress() {
        return progress;
    }

    /**
     * Imposta il valore della proprietà progress.
     * 
     */
    public void setProgress(double value) {
        this.progress = value;
    }

    /**
     * Recupera il valore della proprietà startAt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartAt() {
        return startAt;
    }

    /**
     * Imposta il valore della proprietà startAt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartAt(XMLGregorianCalendar value) {
        this.startAt = value;
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

}
