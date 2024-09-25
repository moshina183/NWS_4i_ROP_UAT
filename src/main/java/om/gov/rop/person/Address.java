
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Wilayat" type="{urn:rop-gov-om:person}CodeDesc"/&gt;
 *         &lt;element name="Town" type="{urn:rop-gov-om:person}CodeDesc"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "wilayat",
    "town"
})
public class Address {

    @XmlElement(name = "Wilayat", required = true, nillable = true)
    protected CodeDesc wilayat;
    @XmlElement(name = "Town", required = true, nillable = true)
    protected CodeDesc town;

    /**
     * Gets the value of the wilayat property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getWilayat() {
        return wilayat;
    }

    /**
     * Sets the value of the wilayat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setWilayat(CodeDesc value) {
        this.wilayat = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setTown(CodeDesc value) {
        this.town = value;
    }

}
