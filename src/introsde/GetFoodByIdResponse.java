
package introsde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getFoodByIdResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getFoodByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="food" type="{http://soap.document.introsde/}food" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFoodByIdResponse", propOrder = {
    "food"
})
public class GetFoodByIdResponse {

    protected Food food;

    /**
     * Recupera il valore della proprietà food.
     * 
     * @return
     *     possible object is
     *     {@link Food }
     *     
     */
    public Food getFood() {
        return food;
    }

    /**
     * Imposta il valore della proprietà food.
     * 
     * @param value
     *     allowed object is
     *     {@link Food }
     *     
     */
    public void setFood(Food value) {
        this.food = value;
    }

}
