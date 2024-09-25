
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
 * <p>Java class for Offences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Offences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offenderName_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="offenderName_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="batchNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registrationEnd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vehicleMake" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vehicleColour" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="engineCapacity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="engineCylinderQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Offence" type="{urn:rop-gov-om:TrafficInformation}Offence" maxOccurs="unbounded"/&gt;
 *         &lt;element name="offenceFineTotal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="offencesCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="offencesTotalCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tors200Flag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fineTotal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gccOffencesFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="municipalityOffencesFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "Offences", propOrder = {
    "offenderNameAr",
    "offenderNameEn",
    "batchNumber",
    "registrationEnd",
    "vehicleType",
    "vehicleMake",
    "vehicleColour",
    "engineCapacity",
    "engineCylinderQuantity",
    "offence",
    "offenceFineTotal",
    "offencesCount",
    "offencesTotalCount",
    "tors200Flag",
    "fineTotal",
    "gccOffencesFlag",
    "municipalityOffencesFlag",
    "status"
})
public class Offences {

    @XmlElement(name = "offenderName_ar", required = true, nillable = true)
    protected String offenderNameAr;
    @XmlElement(name = "offenderName_en", required = true, nillable = true)
    protected String offenderNameEn;
    @XmlElement(required = true, nillable = true)
    protected String batchNumber;
    @XmlElement(required = true, nillable = true)
    protected String registrationEnd;
    @XmlElement(required = true, nillable = true)
    protected String vehicleType;
    @XmlElement(required = true, nillable = true)
    protected String vehicleMake;
    @XmlElement(required = true, nillable = true)
    protected List<String> vehicleColour;
    @XmlElement(required = true, nillable = true)
    protected String engineCapacity;
    @XmlElement(required = true, nillable = true)
    protected String engineCylinderQuantity;
    @XmlElement(name = "Offence", required = true, nillable = true)
    protected List<Offence> offence;
    @XmlElement(required = true, nillable = true)
    protected String offenceFineTotal;
    @XmlElement(required = true, nillable = true)
    protected String offencesCount;
    @XmlElement(required = true, nillable = true)
    protected String offencesTotalCount;
    @XmlElement(required = true, nillable = true)
    protected String tors200Flag;
    @XmlElement(required = true, nillable = true)
    protected String fineTotal;
    @XmlElement(required = true, nillable = true)
    protected String gccOffencesFlag;
    @XmlElement(required = true, nillable = true)
    protected String municipalityOffencesFlag;
    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    protected JAXBElement<StatusLng> status;

    /**
     * Gets the value of the offenderNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenderNameAr() {
        return offenderNameAr;
    }

    /**
     * Sets the value of the offenderNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenderNameAr(String value) {
        this.offenderNameAr = value;
    }

    /**
     * Gets the value of the offenderNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenderNameEn() {
        return offenderNameEn;
    }

    /**
     * Sets the value of the offenderNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenderNameEn(String value) {
        this.offenderNameEn = value;
    }

    /**
     * Gets the value of the batchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the value of the batchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNumber(String value) {
        this.batchNumber = value;
    }

    /**
     * Gets the value of the registrationEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationEnd() {
        return registrationEnd;
    }

    /**
     * Sets the value of the registrationEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationEnd(String value) {
        this.registrationEnd = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the vehicleMake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleMake() {
        return vehicleMake;
    }

    /**
     * Sets the value of the vehicleMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleMake(String value) {
        this.vehicleMake = value;
    }

    /**
     * Gets the value of the vehicleColour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleColour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleColour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVehicleColour() {
        if (vehicleColour == null) {
            vehicleColour = new ArrayList<String>();
        }
        return this.vehicleColour;
    }

    /**
     * Gets the value of the engineCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineCapacity() {
        return engineCapacity;
    }

    /**
     * Sets the value of the engineCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineCapacity(String value) {
        this.engineCapacity = value;
    }

    /**
     * Gets the value of the engineCylinderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineCylinderQuantity() {
        return engineCylinderQuantity;
    }

    /**
     * Sets the value of the engineCylinderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineCylinderQuantity(String value) {
        this.engineCylinderQuantity = value;
    }

    /**
     * Gets the value of the offence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Offence }
     * 
     * 
     */
    public List<Offence> getOffence() {
        if (offence == null) {
            offence = new ArrayList<Offence>();
        }
        return this.offence;
    }

    /**
     * Gets the value of the offenceFineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenceFineTotal() {
        return offenceFineTotal;
    }

    /**
     * Sets the value of the offenceFineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenceFineTotal(String value) {
        this.offenceFineTotal = value;
    }

    /**
     * Gets the value of the offencesCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffencesCount() {
        return offencesCount;
    }

    /**
     * Sets the value of the offencesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffencesCount(String value) {
        this.offencesCount = value;
    }

    /**
     * Gets the value of the offencesTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffencesTotalCount() {
        return offencesTotalCount;
    }

    /**
     * Sets the value of the offencesTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffencesTotalCount(String value) {
        this.offencesTotalCount = value;
    }

    /**
     * Gets the value of the tors200Flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTors200Flag() {
        return tors200Flag;
    }

    /**
     * Sets the value of the tors200Flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTors200Flag(String value) {
        this.tors200Flag = value;
    }

    /**
     * Gets the value of the fineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFineTotal() {
        return fineTotal;
    }

    /**
     * Sets the value of the fineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFineTotal(String value) {
        this.fineTotal = value;
    }

    /**
     * Gets the value of the gccOffencesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGccOffencesFlag() {
        return gccOffencesFlag;
    }

    /**
     * Sets the value of the gccOffencesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGccOffencesFlag(String value) {
        this.gccOffencesFlag = value;
    }

    /**
     * Gets the value of the municipalityOffencesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityOffencesFlag() {
        return municipalityOffencesFlag;
    }

    /**
     * Sets the value of the municipalityOffencesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityOffencesFlag(String value) {
        this.municipalityOffencesFlag = value;
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
