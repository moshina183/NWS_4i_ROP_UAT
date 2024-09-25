
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_Card complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_Card"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="civilNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfExpiry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfIssue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardSubStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nationality" type="{urn:rop-gov-om:person}Nationality"/&gt;
 *         &lt;element name="Birth" type="{urn:rop-gov-om:person}Birth"/&gt;
 *         &lt;element name="Gender" type="{urn:rop-gov-om:person}CodeDesc"/&gt;
 *         &lt;element name="Name" type="{urn:rop-gov-om:person}Name"/&gt;
 *         &lt;element name="Occupation" type="{urn:rop-gov-om:person}CodeDesc"/&gt;
 *         &lt;element name="Sponsor" type="{urn:rop-gov-om:person}Sponsor"/&gt;
 *         &lt;element name="Address" type="{urn:rop-gov-om:person}Address"/&gt;
 *         &lt;element name="Photo" type="{urn:rop-gov-om:person}Photo"/&gt;
 *         &lt;element name="Signature" type="{urn:rop-gov-om:person}Signature"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_Card", propOrder = {
    "civilNumber",
    "dateOfExpiry",
    "cardType",
    "dateOfIssue",
    "cardSerialNumber",
    "cardStatus",
    "cardSubStatus",
    "nationality",
    "birth",
    "gender",
    "name",
    "occupation",
    "sponsor",
    "address",
    "photo",
    "signature"
})
public class IDCard {

    @XmlElement(required = true, nillable = true)
    protected String civilNumber;
    @XmlElement(required = true, nillable = true)
    protected String dateOfExpiry;
    @XmlElement(required = true, nillable = true)
    protected String cardType;
    @XmlElement(required = true, nillable = true)
    protected String dateOfIssue;
    @XmlElement(required = true, nillable = true)
    protected String cardSerialNumber;
    @XmlElement(required = true, nillable = true)
    protected String cardStatus;
    @XmlElement(required = true, nillable = true)
    protected String cardSubStatus;
    @XmlElement(name = "Nationality", required = true, nillable = true)
    protected Nationality nationality;
    @XmlElement(name = "Birth", required = true, nillable = true)
    protected Birth birth;
    @XmlElement(name = "Gender", required = true, nillable = true)
    protected CodeDesc gender;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected Name name;
    @XmlElement(name = "Occupation", required = true, nillable = true)
    protected CodeDesc occupation;
    @XmlElement(name = "Sponsor", required = true, nillable = true)
    protected Sponsor sponsor;
    @XmlElement(name = "Address", required = true, nillable = true)
    protected Address address;
    @XmlElement(name = "Photo", required = true, nillable = true)
    protected Photo photo;
    @XmlElement(name = "Signature", required = true, nillable = true)
    protected Signature signature;

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
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
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
     * Gets the value of the cardSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSerialNumber() {
        return cardSerialNumber;
    }

    /**
     * Sets the value of the cardSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSerialNumber(String value) {
        this.cardSerialNumber = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatus(String value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the cardSubStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSubStatus() {
        return cardSubStatus;
    }

    /**
     * Sets the value of the cardSubStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSubStatus(String value) {
        this.cardSubStatus = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link Nationality }
     *     
     */
    public Nationality getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nationality }
     *     
     */
    public void setNationality(Nationality value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the birth property.
     * 
     * @return
     *     possible object is
     *     {@link Birth }
     *     
     */
    public Birth getBirth() {
        return birth;
    }

    /**
     * Sets the value of the birth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Birth }
     *     
     */
    public void setBirth(Birth value) {
        this.birth = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setGender(CodeDesc value) {
        this.gender = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setOccupation(CodeDesc value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the sponsor property.
     * 
     * @return
     *     possible object is
     *     {@link Sponsor }
     *     
     */
    public Sponsor getSponsor() {
        return sponsor;
    }

    /**
     * Sets the value of the sponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sponsor }
     *     
     */
    public void setSponsor(Sponsor value) {
        this.sponsor = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     {@link Photo }
     *     
     */
    public Photo getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Photo }
     *     
     */
    public void setPhoto(Photo value) {
        this.photo = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setSignature(Signature value) {
        this.signature = value;
    }

}
