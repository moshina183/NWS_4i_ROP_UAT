
package om.gov.rop.trafficinformation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Details" type="{urn:rop-gov-om:TrafficInformation}Vehicle2" minOccurs="0"/&gt;
 *         &lt;element name="Registration" type="{urn:rop-gov-om:TrafficInformation}Registration" minOccurs="0"/&gt;
 *         &lt;element name="Insurance" type="{urn:rop-gov-om:TrafficInformation}Insurance" minOccurs="0"/&gt;
 *         &lt;element name="Mortgage" type="{urn:rop-gov-om:TrafficInformation}Mortgage" minOccurs="0"/&gt;
 *         &lt;element name="Owner" type="{urn:rop-gov-om:TrafficInformation}Owner" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{urn:rop-gov-om:TrafficInformation}Status_Lng" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {
    "details",
    "registration",
    "insurance",
    "mortgage",
    "owner",
    "status"
})
public class Vehicle {

    @XmlElementRef(name = "Details", type = JAXBElement.class, required = false)
    protected JAXBElement<Vehicle2> details;
    @XmlElementRef(name = "Registration", type = JAXBElement.class, required = false)
    protected JAXBElement<Registration> registration;
    @XmlElementRef(name = "Insurance", type = JAXBElement.class, required = false)
    protected JAXBElement<Insurance> insurance;
    @XmlElementRef(name = "Mortgage", type = JAXBElement.class, required = false)
    protected JAXBElement<Mortgage> mortgage;
    @XmlElementRef(name = "Owner", type = JAXBElement.class, required = false)
    protected JAXBElement<Owner> owner;
    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    protected JAXBElement<StatusLng> status;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Vehicle2 }{@code >}
     *     
     */
    public JAXBElement<Vehicle2> getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Vehicle2 }{@code >}
     *     
     */
    public void setDetails(JAXBElement<Vehicle2> value) {
        this.details = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Registration }{@code >}
     *     
     */
    public JAXBElement<Registration> getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Registration }{@code >}
     *     
     */
    public void setRegistration(JAXBElement<Registration> value) {
        this.registration = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Insurance }{@code >}
     *     
     */
    public JAXBElement<Insurance> getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Insurance }{@code >}
     *     
     */
    public void setInsurance(JAXBElement<Insurance> value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the mortgage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     *     
     */
    public JAXBElement<Mortgage> getMortgage() {
        return mortgage;
    }

    /**
     * Sets the value of the mortgage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     *     
     */
    public void setMortgage(JAXBElement<Mortgage> value) {
        this.mortgage = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Owner }{@code >}
     *     
     */
    public JAXBElement<Owner> getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Owner }{@code >}
     *     
     */
    public void setOwner(JAXBElement<Owner> value) {
        this.owner = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StatusLng }{@code >}
     *     
     */
    public JAXBElement<StatusLng> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StatusLng }{@code >}
     *     
     */
    public void setStatus(JAXBElement<StatusLng> value) {
        this.status = value;
    }

}
