
package om.gov.rop.trafficinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Registration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Registration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistrationType" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="registrationIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registrationExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registrationFirstIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="previousRegistrationCode_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="previousRegistrationCode_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="previousRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="previousRegistrationFornMiss" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="previousRegistrationTypeDesc_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="previousRegistrationTypeDesc_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registration", propOrder = {
    "registrationType",
    "registrationIssueDate",
    "registrationExpiryDate",
    "registrationFirstIssueDate",
    "previousRegistrationCodeAr",
    "previousRegistrationCodeEn",
    "previousRegistrationNumber",
    "previousRegistrationFornMiss",
    "previousRegistrationTypeDescAr",
    "previousRegistrationTypeDescEn"
})
public class Registration {

    @XmlElement(name = "RegistrationType", required = true, nillable = true)
    protected CodeDesc registrationType;
    @XmlElement(required = true, nillable = true)
    protected String registrationIssueDate;
    @XmlElement(required = true, nillable = true)
    protected String registrationExpiryDate;
    @XmlElement(required = true, nillable = true)
    protected String registrationFirstIssueDate;
    @XmlElement(name = "previousRegistrationCode_ar", required = true, nillable = true)
    protected String previousRegistrationCodeAr;
    @XmlElement(name = "previousRegistrationCode_en", required = true, nillable = true)
    protected String previousRegistrationCodeEn;
    @XmlElement(required = true, nillable = true)
    protected String previousRegistrationNumber;
    @XmlElement(required = true, nillable = true)
    protected String previousRegistrationFornMiss;
    @XmlElement(name = "previousRegistrationTypeDesc_ar", required = true, nillable = true)
    protected String previousRegistrationTypeDescAr;
    @XmlElement(name = "previousRegistrationTypeDesc_en", required = true, nillable = true)
    protected String previousRegistrationTypeDescEn;

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setRegistrationType(CodeDesc value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the registrationIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationIssueDate() {
        return registrationIssueDate;
    }

    /**
     * Sets the value of the registrationIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationIssueDate(String value) {
        this.registrationIssueDate = value;
    }

    /**
     * Gets the value of the registrationExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationExpiryDate() {
        return registrationExpiryDate;
    }

    /**
     * Sets the value of the registrationExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationExpiryDate(String value) {
        this.registrationExpiryDate = value;
    }

    /**
     * Gets the value of the registrationFirstIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationFirstIssueDate() {
        return registrationFirstIssueDate;
    }

    /**
     * Sets the value of the registrationFirstIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationFirstIssueDate(String value) {
        this.registrationFirstIssueDate = value;
    }

    /**
     * Gets the value of the previousRegistrationCodeAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousRegistrationCodeAr() {
        return previousRegistrationCodeAr;
    }

    /**
     * Sets the value of the previousRegistrationCodeAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousRegistrationCodeAr(String value) {
        this.previousRegistrationCodeAr = value;
    }

    /**
     * Gets the value of the previousRegistrationCodeEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousRegistrationCodeEn() {
        return previousRegistrationCodeEn;
    }

    /**
     * Sets the value of the previousRegistrationCodeEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousRegistrationCodeEn(String value) {
        this.previousRegistrationCodeEn = value;
    }

    /**
     * Gets the value of the previousRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousRegistrationNumber() {
        return previousRegistrationNumber;
    }

    /**
     * Sets the value of the previousRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousRegistrationNumber(String value) {
        this.previousRegistrationNumber = value;
    }

    /**
     * Gets the value of the previousRegistrationFornMiss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousRegistrationFornMiss() {
        return previousRegistrationFornMiss;
    }

    /**
     * Sets the value of the previousRegistrationFornMiss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousRegistrationFornMiss(String value) {
        this.previousRegistrationFornMiss = value;
    }

    /**
     * Gets the value of the previousRegistrationTypeDescAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousRegistrationTypeDescAr() {
        return previousRegistrationTypeDescAr;
    }

    /**
     * Sets the value of the previousRegistrationTypeDescAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousRegistrationTypeDescAr(String value) {
        this.previousRegistrationTypeDescAr = value;
    }

    /**
     * Gets the value of the previousRegistrationTypeDescEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousRegistrationTypeDescEn() {
        return previousRegistrationTypeDescEn;
    }

    /**
     * Sets the value of the previousRegistrationTypeDescEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousRegistrationTypeDescEn(String value) {
        this.previousRegistrationTypeDescEn = value;
    }

}
