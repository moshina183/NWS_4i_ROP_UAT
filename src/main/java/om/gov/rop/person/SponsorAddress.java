
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SponsorAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SponsorAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Country" type="{urn:rop-gov-om:person}Country3"/&gt;
 *         &lt;element name="Wilayat" type="{urn:rop-gov-om:person}CodeDesc"/&gt;
 *         &lt;element name="Town" type="{urn:rop-gov-om:person}CodeDesc"/&gt;
 *         &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buildingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="wayNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="blockNumber_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="blockNumber_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="laneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="streetName_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="streetName_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="poBox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PostalOffice" type="{urn:rop-gov-om:person}CodeDesc"/&gt;
 *         &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SponsorAddress", propOrder = {
    "country",
    "wilayat",
    "town",
    "stateProvince",
    "city",
    "buildingNumber",
    "wayNumber",
    "blockNumberEn",
    "blockNumberAr",
    "laneNumber",
    "streetNameEn",
    "streetNameAr",
    "poBox",
    "postalCode",
    "postalOffice",
    "telephoneNumber",
    "mobileNumber",
    "emailAddress"
})
public class SponsorAddress {

    @XmlElement(name = "Country", required = true, nillable = true)
    protected Country3 country;
    @XmlElement(name = "Wilayat", required = true, nillable = true)
    protected CodeDesc wilayat;
    @XmlElement(name = "Town", required = true, nillable = true)
    protected CodeDesc town;
    @XmlElement(required = true, nillable = true)
    protected String stateProvince;
    @XmlElement(required = true, nillable = true)
    protected String city;
    @XmlElement(required = true, nillable = true)
    protected String buildingNumber;
    @XmlElement(required = true, nillable = true)
    protected String wayNumber;
    @XmlElement(name = "blockNumber_en", required = true, nillable = true)
    protected String blockNumberEn;
    @XmlElement(name = "blockNumber_ar", required = true, nillable = true)
    protected String blockNumberAr;
    @XmlElement(required = true, nillable = true)
    protected String laneNumber;
    @XmlElement(name = "streetName_en", required = true, nillable = true)
    protected String streetNameEn;
    @XmlElement(name = "streetName_ar", required = true, nillable = true)
    protected String streetNameAr;
    @XmlElement(required = true, nillable = true)
    protected String poBox;
    @XmlElement(required = true, nillable = true)
    protected String postalCode;
    @XmlElement(name = "PostalOffice", required = true, nillable = true)
    protected CodeDesc postalOffice;
    @XmlElement(required = true, nillable = true)
    protected String telephoneNumber;
    @XmlElement(required = true, nillable = true)
    protected String mobileNumber;
    @XmlElement(required = true, nillable = true)
    protected String emailAddress;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country3 }
     *     
     */
    public Country3 getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country3 }
     *     
     */
    public void setCountry(Country3 value) {
        this.country = value;
    }

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

    /**
     * Gets the value of the stateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvince() {
        return stateProvince;
    }

    /**
     * Sets the value of the stateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvince(String value) {
        this.stateProvince = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNumber(String value) {
        this.buildingNumber = value;
    }

    /**
     * Gets the value of the wayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWayNumber() {
        return wayNumber;
    }

    /**
     * Sets the value of the wayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWayNumber(String value) {
        this.wayNumber = value;
    }

    /**
     * Gets the value of the blockNumberEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockNumberEn() {
        return blockNumberEn;
    }

    /**
     * Sets the value of the blockNumberEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockNumberEn(String value) {
        this.blockNumberEn = value;
    }

    /**
     * Gets the value of the blockNumberAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockNumberAr() {
        return blockNumberAr;
    }

    /**
     * Sets the value of the blockNumberAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockNumberAr(String value) {
        this.blockNumberAr = value;
    }

    /**
     * Gets the value of the laneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaneNumber() {
        return laneNumber;
    }

    /**
     * Sets the value of the laneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaneNumber(String value) {
        this.laneNumber = value;
    }

    /**
     * Gets the value of the streetNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNameEn() {
        return streetNameEn;
    }

    /**
     * Sets the value of the streetNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNameEn(String value) {
        this.streetNameEn = value;
    }

    /**
     * Gets the value of the streetNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNameAr() {
        return streetNameAr;
    }

    /**
     * Sets the value of the streetNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNameAr(String value) {
        this.streetNameAr = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoBox(String value) {
        this.poBox = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postalOffice property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getPostalOffice() {
        return postalOffice;
    }

    /**
     * Sets the value of the postalOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setPostalOffice(CodeDesc value) {
        this.postalOffice = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

}
