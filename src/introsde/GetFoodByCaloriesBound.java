
package introsde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getFoodByCaloriesBound complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getFoodByCaloriesBound">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calories" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFoodByCaloriesBound", propOrder = {
    "calories"
})
public class GetFoodByCaloriesBound {

    protected double calories;

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

}
