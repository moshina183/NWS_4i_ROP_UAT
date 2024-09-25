
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Work" type="{urn:rop-gov-om:person}AddressType"/&gt;
 *         &lt;element name="Current" type="{urn:rop-gov-om:person}AddressType"/&gt;
 *         &lt;element name="Permanent" type="{urn:rop-gov-om:person}AddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address2", propOrder = {
    "work",
    "current",
    "permanent"
})
public class Address2 {

    @XmlElement(name = "Work", required = true, nillable = true)
    protected AddressType work;
    @XmlElement(name = "Current", required = true, nillable = true)
    protected AddressType current;
    @XmlElement(name = "Permanent", required = true, nillable = true)
    protected AddressType permanent;

    /**
     * Gets the value of the work property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getWork() {
        return work;
    }

    /**
     * Sets the value of the work property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setWork(AddressType value) {
        this.work = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setCurrent(AddressType value) {
        this.current = value;
    }

    /**
     * Gets the value of the permanent property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPermanent() {
        return permanent;
    }

    /**
     * Sets the value of the permanent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPermanent(AddressType value) {
        this.permanent = value;
    }

}
