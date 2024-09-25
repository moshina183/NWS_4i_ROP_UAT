
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passportNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfIssue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfExpiry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Country" type="{urn:rop-gov-om:person}Country2"/&gt;
 *         &lt;element name="Type" type="{urn:rop-gov-om:person}CodeDesc"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassportType", propOrder = {
    "passportNumber",
    "dateOfIssue",
    "dateOfExpiry",
    "country",
    "type"
})
public class PassportType {

    @XmlElement(required = true, nillable = true)
    protected String passportNumber;
    @XmlElement(required = true, nillable = true)
    protected String dateOfIssue;
    @XmlElement(required = true, nillable = true)
    protected String dateOfExpiry;
    @XmlElement(name = "Country", required = true, nillable = true)
    protected Country2 country;
    @XmlElement(name = "Type", required = true, nillable = true)
    protected CodeDesc type;

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
     * Gets the value of the dateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Sets the value of the dateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfIssue(String value) {
        this.dateOfIssue = value;
    }

    /**
     * Gets the value of the dateOfExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    /**
     * Sets the value of the dateOfExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfExpiry(String value) {
        this.dateOfExpiry = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country2 }
     *     
     */
    public Country2 getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country2 }
     *     
     */
    public void setCountry(Country2 value) {
        this.country = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setType(CodeDesc value) {
        this.type = value;
    }

}
