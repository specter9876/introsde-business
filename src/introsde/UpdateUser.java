
package introsde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updateUser complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updateUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userIn" type="{http://soap.document.introsde/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateUser", propOrder = {
    "userIn"
})
public class UpdateUser {

    protected User userIn;

    /**
     * Recupera il valore della proprietà userIn.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserIn() {
        return userIn;
    }

    /**
     * Imposta il valore della proprietà userIn.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserIn(User value) {
        this.userIn = value;
    }

}
