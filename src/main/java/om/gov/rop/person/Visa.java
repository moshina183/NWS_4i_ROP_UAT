
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Visa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="civilNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="visaNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfIssue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfExpiry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cancellationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{urn:rop-gov-om:person}CodeDesc"/&gt;
 *         &lt;element name="Sponsor" type="{urn:rop-gov-om:person}Sponsor2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Visa", propOrder = {
    "civilNumber",
    "visaNumber",
    "dateOfIssue",
    "dateOfExpiry",
    "cancellationDate",
    "type",
    "sponsor"
})
public class Visa {

    @XmlElement(required = true, nillable = true)
    protected String civilNumber;
    @XmlElement(required = true, nillable = true)
    protected String visaNumber;
    @XmlElement(required = true, nillable = true)
    protected String dateOfIssue;
    @XmlElement(required = true, nillable = true)
    protected String dateOfExpiry;
    @XmlElement(required = true, nillable = true)
    protected String cancellationDate;
    @XmlElement(name = "Type", required = true, nillable = true)
    protected CodeDesc type;
    @XmlElement(name = "Sponsor", required = true, nillable = true)
    protected Sponsor2 sponsor;

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
     * Gets the value of the visaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNumber() {
        return visaNumber;
    }

    /**
     * Sets the value of the visaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNumber(String value) {
        this.visaNumber = value;
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
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationDate(String value) {
        this.cancellationDate = value;
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

    /**
     * Gets the value of the sponsor property.
     * 
     * @return
     *     possible object is
     *     {@link Sponsor2 }
     *     
     */
    public Sponsor2 getSponsor() {
        return sponsor;
    }

    /**
     * Sets the value of the sponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sponsor2 }
     *     
     */
    public void setSponsor(Sponsor2 value) {
        this.sponsor = value;
    }

}
