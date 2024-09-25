
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
 * <p>Java class for DrivingLicense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrivingLicense"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="drivingLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tempLicenseFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fistIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PlaceIssued" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deathDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LicenseClass" type="{urn:rop-gov-om:TrafficInformation}LicenseClass" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LicenseSubClass" type="{urn:rop-gov-om:TrafficInformation}LicenseSubClass" maxOccurs="unbounded"/&gt;
 *         &lt;element name="plantDesc_ar" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="plantDesc_en" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="currentSuspended" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="previousSuspended" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="suspendedEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="driverName_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="driverName_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nationality" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="BloodGroup" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
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
@XmlType(name = "DrivingLicense", propOrder = {
    "drivingLicenseNumber",
    "tempLicenseFlag",
    "fistIssueDate",
    "expiryDate",
    "placeIssued",
    "birthDate",
    "deathDate",
    "licenseClass",
    "licenseSubClass",
    "plantDescAr",
    "plantDescEn",
    "currentSuspended",
    "previousSuspended",
    "suspendedEndDate",
    "driverNameAr",
    "driverNameEn",
    "nationality",
    "bloodGroup",
    "status"
})
public class DrivingLicense {

    @XmlElement(required = true, nillable = true)
    protected String drivingLicenseNumber;
    @XmlElement(required = true, nillable = true)
    protected String tempLicenseFlag;
    @XmlElement(required = true, nillable = true)
    protected String fistIssueDate;
    @XmlElement(required = true, nillable = true)
    protected String expiryDate;
    @XmlElement(name = "PlaceIssued", required = true, nillable = true)
    protected CodeDesc placeIssued;
    @XmlElement(required = true, nillable = true)
    protected String birthDate;
    @XmlElement(required = true, nillable = true)
    protected String deathDate;
    @XmlElement(name = "LicenseClass", required = true, nillable = true)
    protected List<LicenseClass> licenseClass;
    @XmlElement(name = "LicenseSubClass", required = true, nillable = true)
    protected List<LicenseSubClass> licenseSubClass;
    @XmlElement(name = "plantDesc_ar", required = true, nillable = true)
    protected List<String> plantDescAr;
    @XmlElement(name = "plantDesc_en", required = true, nillable = true)
    protected List<String> plantDescEn;
    @XmlElement(required = true, nillable = true)
    protected String currentSuspended;
    @XmlElement(required = true, nillable = true)
    protected String previousSuspended;
    @XmlElement(required = true, nillable = true)
    protected String suspendedEndDate;
    @XmlElement(name = "driverName_ar", required = true, nillable = true)
    protected String driverNameAr;
    @XmlElement(name = "driverName_en", required = true, nillable = true)
    protected String driverNameEn;
    @XmlElement(name = "Nationality", required = true, nillable = true)
    protected CodeDesc nationality;
    @XmlElement(name = "BloodGroup", required = true, nillable = true)
    protected CodeDesc bloodGroup;
    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    protected JAXBElement<StatusLng> status;

    /**
     * Gets the value of the drivingLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    /**
     * Sets the value of the drivingLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivingLicenseNumber(String value) {
        this.drivingLicenseNumber = value;
    }

    /**
     * Gets the value of the tempLicenseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempLicenseFlag() {
        return tempLicenseFlag;
    }

    /**
     * Sets the value of the tempLicenseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempLicenseFlag(String value) {
        this.tempLicenseFlag = value;
    }

    /**
     * Gets the value of the fistIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFistIssueDate() {
        return fistIssueDate;
    }

    /**
     * Sets the value of the fistIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFistIssueDate(String value) {
        this.fistIssueDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the placeIssued property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getPlaceIssued() {
        return placeIssued;
    }

    /**
     * Sets the value of the placeIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setPlaceIssued(CodeDesc value) {
        this.placeIssued = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the deathDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathDate() {
        return deathDate;
    }

    /**
     * Sets the value of the deathDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathDate(String value) {
        this.deathDate = value;
    }

    /**
     * Gets the value of the licenseClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseClass }
     * 
     * 
     */
    public List<LicenseClass> getLicenseClass() {
        if (licenseClass == null) {
            licenseClass = new ArrayList<LicenseClass>();
        }
        return this.licenseClass;
    }

    /**
     * Gets the value of the licenseSubClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseSubClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseSubClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseSubClass }
     * 
     * 
     */
    public List<LicenseSubClass> getLicenseSubClass() {
        if (licenseSubClass == null) {
            licenseSubClass = new ArrayList<LicenseSubClass>();
        }
        return this.licenseSubClass;
    }

    /**
     * Gets the value of the plantDescAr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plantDescAr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlantDescAr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlantDescAr() {
        if (plantDescAr == null) {
            plantDescAr = new ArrayList<String>();
        }
        return this.plantDescAr;
    }

    /**
     * Gets the value of the plantDescEn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plantDescEn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlantDescEn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlantDescEn() {
        if (plantDescEn == null) {
            plantDescEn = new ArrayList<String>();
        }
        return this.plantDescEn;
    }

    /**
     * Gets the value of the currentSuspended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentSuspended() {
        return currentSuspended;
    }

    /**
     * Sets the value of the currentSuspended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentSuspended(String value) {
        this.currentSuspended = value;
    }

    /**
     * Gets the value of the previousSuspended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSuspended() {
        return previousSuspended;
    }

    /**
     * Sets the value of the previousSuspended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSuspended(String value) {
        this.previousSuspended = value;
    }

    /**
     * Gets the value of the suspendedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendedEndDate() {
        return suspendedEndDate;
    }

    /**
     * Sets the value of the suspendedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendedEndDate(String value) {
        this.suspendedEndDate = value;
    }

    /**
     * Gets the value of the driverNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverNameAr() {
        return driverNameAr;
    }

    /**
     * Sets the value of the driverNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverNameAr(String value) {
        this.driverNameAr = value;
    }

    /**
     * Gets the value of the driverNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverNameEn() {
        return driverNameEn;
    }

    /**
     * Sets the value of the driverNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverNameEn(String value) {
        this.driverNameEn = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setNationality(CodeDesc value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the bloodGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getBloodGroup() {
        return bloodGroup;
    }

    /**
     * Sets the value of the bloodGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setBloodGroup(CodeDesc value) {
        this.bloodGroup = value;
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
