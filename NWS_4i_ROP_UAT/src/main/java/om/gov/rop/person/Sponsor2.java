
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sponsor2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sponsor2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personName_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personName_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orgName_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orgName_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Address" type="{urn:rop-gov-om:person}SponsorAddress"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sponsor2", propOrder = {
    "id",
    "type",
    "personNameEn",
    "personNameAr",
    "orgNameEn",
    "orgNameAr",
    "address"
})
public class Sponsor2 {

    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(name = "personName_en", required = true, nillable = true)
    protected String personNameEn;
    @XmlElement(name = "personName_ar", required = true, nillable = true)
    protected String personNameAr;
    @XmlElement(name = "orgName_en", required = true, nillable = true)
    protected String orgNameEn;
    @XmlElement(name = "orgName_ar", required = true, nillable = true)
    protected String orgNameAr;
    @XmlElement(name = "Address", required = true, nillable = true)
    protected SponsorAddress address;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the personNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonNameEn() {
        return personNameEn;
    }

    /**
     * Sets the value of the personNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonNameEn(String value) {
        this.personNameEn = value;
    }

    /**
     * Gets the value of the personNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonNameAr() {
        return personNameAr;
    }

    /**
     * Sets the value of the personNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonNameAr(String value) {
        this.personNameAr = value;
    }

    /**
     * Gets the value of the orgNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgNameEn() {
        return orgNameEn;
    }

    /**
     * Sets the value of the orgNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgNameEn(String value) {
        this.orgNameEn = value;
    }

    /**
     * Gets the value of the orgNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgNameAr() {
        return orgNameAr;
    }

    /**
     * Sets the value of the orgNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgNameAr(String value) {
        this.orgNameAr = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link SponsorAddress }
     *     
     */
    public SponsorAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link SponsorAddress }
     *     
     */
    public void setAddress(SponsorAddress value) {
        this.address = value;
    }

}
