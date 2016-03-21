
package introsde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createFood complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createFood">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foodIn" type="{http://soap.document.introsde/}food" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createFood", propOrder = {
    "foodIn"
})
public class CreateFood {

    protected Food foodIn;

    /**
     * Recupera il valore della proprietà foodIn.
     * 
     * @return
     *     possible object is
     *     {@link Food }
     *     
     */
    public Food getFoodIn() {
        return foodIn;
    }

    /**
     * Imposta il valore della proprietà foodIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Food }
     *     
     */
    public void setFoodIn(Food value) {
        this.foodIn = value;
    }

}
