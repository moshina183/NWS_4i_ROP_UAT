
package om.gov.rop.person;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="crn" type="{urn:rop-gov-om:person}crn" minOccurs="0"/&gt;
 *         &lt;element name="cardSN" type="{urn:rop-gov-om:person}cardSN" minOccurs="0"/&gt;
 *         &lt;element name="cardExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="visa" type="{urn:rop-gov-om:person}visa" minOccurs="0"/&gt;
 *         &lt;element name="passportNumber" type="{urn:rop-gov-om:person}passportNumber" minOccurs="0"/&gt;
 *         &lt;element name="passportIssuedCountry" type="{urn:rop-gov-om:person}passportIssuedCountry" minOccurs="0"/&gt;
 *         &lt;element name="passportExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="crnOfRequest" type="{urn:rop-gov-om:person}crnOfRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonRequest", propOrder = {
    "crn",
    "cardSN",
    "cardExpiryDate",
    "birthDate",
    "visa",
    "passportNumber",
    "passportIssuedCountry",
    "passportExpiryDate",
    "crnOfRequest"
})
public class PersonRequest {

    @XmlElementRef(name = "crn", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> crn;
    @XmlElementRef(name = "cardSN", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardSN;
    @XmlElementRef(name = "cardExpiryDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> cardExpiryDate;
    @XmlElementRef(name = "birthDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> birthDate;
    @XmlElementRef(name = "visa", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> visa;
    @XmlElementRef(name = "passportNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportNumber;
    @XmlElementRef(name = "passportIssuedCountry", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> passportIssuedCountry;
    @XmlElementRef(name = "passportExpiryDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> passportExpiryDate;
    @XmlElementRef(name = "crnOfRequest", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> crnOfRequest;

    /**
     * Gets the value of the crn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCrn() {
        return crn;
    }

    /**
     * Sets the value of the crn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCrn(JAXBElement<BigDecimal> value) {
        this.crn = value;
    }

    /**
     * Gets the value of the cardSN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardSN() {
        return cardSN;
    }

    /**
     * Sets the value of the cardSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardSN(JAXBElement<String> value) {
        this.cardSN = value;
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
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBirthDate(JAXBElement<XMLGregorianCalendar> value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the visa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVisa() {
        return visa;
    }

    /**
     * Sets the value of the visa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVisa(JAXBElement<BigDecimal> value) {
        this.visa = value;
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
     * Gets the value of the passportIssuedCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPassportIssuedCountry() {
        return passportIssuedCountry;
    }

    /**
     * Sets the value of the passportIssuedCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPassportIssuedCountry(JAXBElement<BigDecimal> value) {
        this.passportIssuedCountry = value;
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
     * Gets the value of the crnOfRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCrnOfRequest() {
        return crnOfRequest;
    }

    /**
     * Sets the value of the crnOfRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCrnOfRequest(JAXBElement<BigDecimal> value) {
        this.crnOfRequest = value;
    }

}
