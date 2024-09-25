
package om.gov.rop.trafficinformation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficInformationResponse2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficInformationResponse2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vehicle" type="{urn:rop-gov-om:TrafficInformation}Vehicle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DrivingLicense" type="{urn:rop-gov-om:TrafficInformation}DrivingLicense" minOccurs="0"/&gt;
 *         &lt;element name="Offences" type="{urn:rop-gov-om:TrafficInformation}Offences" minOccurs="0"/&gt;
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
@XmlType(name = "TrafficInformationResponse2", propOrder = {
    "vehicle",
    "drivingLicense",
    "offences",
    "status"
})
public class TrafficInformationResponse2 {

    @XmlElement(name = "Vehicle", nillable = true)
    protected List<Vehicle> vehicle;
    @XmlElementRef(name = "DrivingLicense", type = JAXBElement.class, required = false)
    protected JAXBElement<DrivingLicense> drivingLicense;
    @XmlElementRef(name = "Offences", type = JAXBElement.class, required = false)
    protected JAXBElement<Offences> offences;
    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    protected JAXBElement<StatusLng> status;

    /**
     * Gets the value of the vehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle }
     * 
     * 
     */
    public List<Vehicle> getVehicle() {
        if (vehicle == null) {
            vehicle = new ArrayList<Vehicle>();
        }
        return this.vehicle;
    }

    /**
     * Gets the value of the drivingLicense property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DrivingLicense }{@code >}
     *     
     */
    public JAXBElement<DrivingLicense> getDrivingLicense() {
        return drivingLicense;
    }

    /**
     * Sets the value of the drivingLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DrivingLicense }{@code >}
     *     
     */
    public void setDrivingLicense(JAXBElement<DrivingLicense> value) {
        this.drivingLicense = value;
    }

    /**
     * Gets the value of the offences property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Offences }{@code >}
     *     
     */
    public JAXBElement<Offences> getOffences() {
        return offences;
    }

    /**
     * Sets the value of the offences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Offences }{@code >}
     *     
     */
    public void setOffences(JAXBElement<Offences> value) {
        this.offences = value;
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
