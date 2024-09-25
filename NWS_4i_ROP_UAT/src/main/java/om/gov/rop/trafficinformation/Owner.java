
package om.gov.rop.trafficinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Owner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Owner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="civilNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="passportNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PassportCountry" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="CompanyRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrganizationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="firstOwnerName_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="firstOwnerName_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="secondOwnerName_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="secondOwnerName_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="postBoxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PostOffice" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="WilayatTown" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="AddressBlockNumber" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nationality" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="BlacklistFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Owner", propOrder = {
    "civilNumber",
    "personNumber",
    "passportNumber",
    "passportCountry",
    "companyRegistrationNumber",
    "organizationNumber",
    "firstOwnerNameAr",
    "firstOwnerNameEn",
    "secondOwnerNameAr",
    "secondOwnerNameEn",
    "postBoxNumber",
    "postOffice",
    "wilayatTown",
    "addressBlockNumber",
    "street",
    "telephone",
    "nationality",
    "blacklistFlag"
})
public class Owner {

    @XmlElement(required = true, nillable = true)
    protected String civilNumber;
    @XmlElement(required = true, nillable = true)
    protected String personNumber;
    @XmlElement(required = true, nillable = true)
    protected String passportNumber;
    @XmlElement(name = "PassportCountry", required = true, nillable = true)
    protected CodeDesc passportCountry;
    @XmlElement(name = "CompanyRegistrationNumber", required = true, nillable = true)
    protected String companyRegistrationNumber;
    @XmlElement(name = "OrganizationNumber", required = true, nillable = true)
    protected String organizationNumber;
    @XmlElement(name = "firstOwnerName_ar", required = true, nillable = true)
    protected String firstOwnerNameAr;
    @XmlElement(name = "firstOwnerName_en", required = true, nillable = true)
    protected String firstOwnerNameEn;
    @XmlElement(name = "secondOwnerName_ar", required = true, nillable = true)
    protected String secondOwnerNameAr;
    @XmlElement(name = "secondOwnerName_en", required = true, nillable = true)
    protected String secondOwnerNameEn;
    @XmlElement(required = true, nillable = true)
    protected String postBoxNumber;
    @XmlElement(name = "PostOffice", required = true, nillable = true)
    protected CodeDesc postOffice;
    @XmlElement(name = "WilayatTown", required = true, nillable = true)
    protected CodeDesc wilayatTown;
    @XmlElement(name = "AddressBlockNumber", required = true, nillable = true)
    protected CodeDesc addressBlockNumber;
    @XmlElement(required = true, nillable = true)
    protected String street;
    @XmlElement(required = true, nillable = true)
    protected String telephone;
    @XmlElement(name = "Nationality", required = true, nillable = true)
    protected CodeDesc nationality;
    @XmlElement(name = "BlacklistFlag", required = true, nillable = true)
    protected String blacklistFlag;

    /**
     * Gets the value of the civilNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilNumber() {
        return civilNumber;
    }

    /**
     * Sets the value of the civilNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilNumber(String value) {
        this.civilNumber = value;
    }

    /**
     * Gets the value of the personNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonNumber() {
        return personNumber;
    }

    /**
     * Sets the value of the personNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonNumber(String value) {
        this.personNumber = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the passportCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getPassportCountry() {
        return passportCountry;
    }

    /**
     * Sets the value of the passportCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setPassportCountry(CodeDesc value) {
        this.passportCountry = value;
    }

    /**
     * Gets the value of the companyRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    /**
     * Sets the value of the companyRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegistrationNumber(String value) {
        this.companyRegistrationNumber = value;
    }

    /**
     * Gets the value of the organizationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationNumber() {
        return organizationNumber;
    }

    /**
     * Sets the value of the organizationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationNumber(String value) {
        this.organizationNumber = value;
    }

    /**
     * Gets the value of the firstOwnerNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstOwnerNameAr() {
        return firstOwnerNameAr;
    }

    /**
     * Sets the value of the firstOwnerNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstOwnerNameAr(String value) {
        this.firstOwnerNameAr = value;
    }

    /**
     * Gets the value of the firstOwnerNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstOwnerNameEn() {
        return firstOwnerNameEn;
    }

    /**
     * Sets the value of the firstOwnerNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstOwnerNameEn(String value) {
        this.firstOwnerNameEn = value;
    }

    /**
     * Gets the value of the secondOwnerNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondOwnerNameAr() {
        return secondOwnerNameAr;
    }

    /**
     * Sets the value of the secondOwnerNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondOwnerNameAr(String value) {
        this.secondOwnerNameAr = value;
    }

    /**
     * Gets the value of the secondOwnerNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondOwnerNameEn() {
        return secondOwnerNameEn;
    }

    /**
     * Sets the value of the secondOwnerNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondOwnerNameEn(String value) {
        this.secondOwnerNameEn = value;
    }

    /**
     * Gets the value of the postBoxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBoxNumber() {
        return postBoxNumber;
    }

    /**
     * Sets the value of the postBoxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBoxNumber(String value) {
        this.postBoxNumber = value;
    }

    /**
     * Gets the value of the postOffice property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getPostOffice() {
        return postOffice;
    }

    /**
     * Sets the value of the postOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setPostOffice(CodeDesc value) {
        this.postOffice = value;
    }

    /**
     * Gets the value of the wilayatTown property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getWilayatTown() {
        return wilayatTown;
    }

    /**
     * Sets the value of the wilayatTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setWilayatTown(CodeDesc value) {
        this.wilayatTown = value;
    }

    /**
     * Gets the value of the addressBlockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getAddressBlockNumber() {
        return addressBlockNumber;
    }

    /**
     * Sets the value of the addressBlockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setAddressBlockNumber(CodeDesc value) {
        this.addressBlockNumber = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
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
     * Gets the value of the blacklistFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlacklistFlag() {
        return blacklistFlag;
    }

    /**
     * Sets the value of the blacklistFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlacklistFlag(String value) {
        this.blacklistFlag = value;
    }

}
