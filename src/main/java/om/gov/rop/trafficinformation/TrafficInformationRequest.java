
package om.gov.rop.trafficinformation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrafficInformationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficInformationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personNumber" type="{urn:rop-gov-om:TrafficInformation}personNumber" minOccurs="0"/&gt;
 *         &lt;element name="civilNumber" type="{urn:rop-gov-om:TrafficInformation}civilNumber" minOccurs="0"/&gt;
 *         &lt;element name="cardExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="passportNumber" type="{urn:rop-gov-om:TrafficInformation}passportNumber" minOccurs="0"/&gt;
 *         &lt;element name="passportCountryCode" type="{urn:rop-gov-om:TrafficInformation}passportCountryCode" minOccurs="0"/&gt;
 *         &lt;element name="passportExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="visaNumber" type="{urn:rop-gov-om:TrafficInformation}visaNumber" minOccurs="0"/&gt;
 *         &lt;element name="drivingLicenseNumber" type="{urn:rop-gov-om:TrafficInformation}drivingLicenseNumber" minOccurs="0"/&gt;
 *         &lt;element name="firstIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="companyRegistrationNumber" type="{urn:rop-gov-om:TrafficInformation}companyRegistrationNumber" minOccurs="0"/&gt;
 *         &lt;element name="internalOrganizationNumber" type="{urn:rop-gov-om:TrafficInformation}internalOrganizationNumber" minOccurs="0"/&gt;
 *         &lt;element name="registrationCode" type="{urn:rop-gov-om:TrafficInformation}registrationCode" minOccurs="0"/&gt;
 *         &lt;element name="registrationNumber" type="{urn:rop-gov-om:TrafficInformation}registrationNumber" minOccurs="0"/&gt;
 *         &lt;element name="registrationRegion" type="{urn:rop-gov-om:TrafficInformation}registrationRegion" minOccurs="0"/&gt;
 *         &lt;element name="foreignCountryCode" type="{urn:rop-gov-om:TrafficInformation}foreignCountryCode" minOccurs="0"/&gt;
 *         &lt;element name="foreignStateCode" type="{urn:rop-gov-om:TrafficInformation}foreignStateCode" minOccurs="0"/&gt;
 *         &lt;element name="chassisNumber" type="{urn:rop-gov-om:TrafficInformation}chassisNumber" minOccurs="0"/&gt;
 *         &lt;element name="engineNumber" type="{urn:rop-gov-om:TrafficInformation}engineNumber" minOccurs="0"/&gt;
 *         &lt;element name="vehiclePK" type="{urn:rop-gov-om:TrafficInformation}vehiclePK" minOccurs="0"/&gt;
 *         &lt;element name="requesterId" type="{urn:rop-gov-om:TrafficInformation}requesterId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficInformationRequest", propOrder = {
    "personNumber",
    "civilNumber",
    "cardExpiryDate",
    "passportNumber",
    "passportCountryCode",
    "passportExpiryDate",
    "visaNumber",
    "drivingLicenseNumber",
    "firstIssueDate",
    "companyRegistrationNumber",
    "internalOrganizationNumber",
    "registrationCode",
    "registrationNumber",
    "registrationRegion",
    "foreignCountryCode",
    "foreignStateCode",
    "chassisNumber",
    "engineNumber",
    "vehiclePK",
    "requesterId"
})
public class TrafficInformationRequest {

    @XmlElementRef(name = "personNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personNumber;
    @XmlElementRef(name = "civilNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> civilNumber;
    @XmlElementRef(name = "cardExpiryDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> cardExpiryDate;
    @XmlElementRef(name = "passportNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportNumber;
    @XmlElementRef(name = "passportCountryCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportCountryCode;
    @XmlElementRef(name = "passportExpiryDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> passportExpiryDate;
    @XmlElementRef(name = "visaNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visaNumber;
    @XmlElementRef(name = "drivingLicenseNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> drivingLicenseNumber;
    @XmlElementRef(name = "firstIssueDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> firstIssueDate;
    @XmlElementRef(name = "companyRegistrationNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyRegistrationNumber;
    @XmlElementRef(name = "internalOrganizationNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> internalOrganizationNumber;
    @XmlElementRef(name = "registrationCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationCode;
    @XmlElementRef(name = "registrationNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationNumber;
    @XmlElementRef(name = "registrationRegion", type = JAXBElement.class, required = false)
    protected JAXBElement<RegistrationRegion> registrationRegion;
    @XmlElementRef(name = "foreignCountryCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> foreignCountryCode;
    @XmlElementRef(name = "foreignStateCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> foreignStateCode;
    @XmlElementRef(name = "chassisNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chassisNumber;
    @XmlElementRef(name = "engineNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> engineNumber;
    @XmlElementRef(name = "vehiclePK", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehiclePK;
    @XmlElement(required = true, nillable = true)
    protected String requesterId;

    /**
     * Gets the value of the personNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonNumber() {
        return personNumber;
    }

    /**
     * Sets the value of the personNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonNumber(JAXBElement<String> value) {
        this.personNumber = value;
    }

    /**
     * Gets the value of the civilNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCivilNumber() {
        return civilNumber;
    }

    /**
     * Sets the value of the civilNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCivilNumber(JAXBElement<String> value) {
        this.civilNumber = value;
    }

    /**
     * Gets the value of the cardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCardExpiryDate() {
        return cardExpiryDate;
    }

    /**
     * Sets the value of the cardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCardExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.cardExpiryDate = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportNumber(JAXBElement<String> value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the passportCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportCountryCode() {
        return passportCountryCode;
    }

    /**
     * Sets the value of the passportCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportCountryCode(JAXBElement<String> value) {
        this.passportCountryCode = value;
    }

    /**
     * Gets the value of the passportExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPassportExpiryDate() {
        return passportExpiryDate;
    }

    /**
     * Sets the value of the passportExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPassportExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.passportExpiryDate = value;
    }

    /**
     * Gets the value of the visaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisaNumber() {
        return visaNumber;
    }

    /**
     * Sets the value of the visaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisaNumber(JAXBElement<String> value) {
        this.visaNumber = value;
    }

    /**
     * Gets the value of the drivingLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    /**
     * Sets the value of the drivingLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDrivingLicenseNumber(JAXBElement<String> value) {
        this.drivingLicenseNumber = value;
    }

    /**
     * Gets the value of the firstIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirstIssueDate() {
        return firstIssueDate;
    }

    /**
     * Sets the value of the firstIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirstIssueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.firstIssueDate = value;
    }

    /**
     * Gets the value of the companyRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    /**
     * Sets the value of the companyRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyRegistrationNumber(JAXBElement<String> value) {
        this.companyRegistrationNumber = value;
    }

    /**
     * Gets the value of the internalOrganizationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternalOrganizationNumber() {
        return internalOrganizationNumber;
    }

    /**
     * Sets the value of the internalOrganizationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternalOrganizationNumber(JAXBElement<String> value) {
        this.internalOrganizationNumber = value;
    }

    /**
     * Gets the value of the registrationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationCode() {
        return registrationCode;
    }

    /**
     * Sets the value of the registrationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationCode(JAXBElement<String> value) {
        this.registrationCode = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationNumber(JAXBElement<String> value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the registrationRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegistrationRegion }{@code >}
     *     
     */
    public JAXBElement<RegistrationRegion> getRegistrationRegion() {
        return registrationRegion;
    }

    /**
     * Sets the value of the registrationRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegistrationRegion }{@code >}
     *     
     */
    public void setRegistrationRegion(JAXBElement<RegistrationRegion> value) {
        this.registrationRegion = value;
    }

    /**
     * Gets the value of the foreignCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForeignCountryCode() {
        return foreignCountryCode;
    }

    /**
     * Sets the value of the foreignCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForeignCountryCode(JAXBElement<String> value) {
        this.foreignCountryCode = value;
    }

    /**
     * Gets the value of the foreignStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForeignStateCode() {
        return foreignStateCode;
    }

    /**
     * Sets the value of the foreignStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForeignStateCode(JAXBElement<String> value) {
        this.foreignStateCode = value;
    }

    /**
     * Gets the value of the chassisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChassisNumber() {
        return chassisNumber;
    }

    /**
     * Sets the value of the chassisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChassisNumber(JAXBElement<String> value) {
        this.chassisNumber = value;
    }

    /**
     * Gets the value of the engineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEngineNumber() {
        return engineNumber;
    }

    /**
     * Sets the value of the engineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEngineNumber(JAXBElement<String> value) {
        this.engineNumber = value;
    }

    /**
     * Gets the value of the vehiclePK property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehiclePK() {
        return vehiclePK;
    }

    /**
     * Sets the value of the vehiclePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehiclePK(JAXBElement<String> value) {
        this.vehiclePK = value;
    }

    /**
     * Gets the value of the requesterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterId() {
        return requesterId;
    }

    /**
     * Sets the value of the requesterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterId(String value) {
        this.requesterId = value;
    }

}
