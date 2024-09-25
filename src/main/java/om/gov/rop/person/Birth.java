
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Birth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Birth"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Country" type="{urn:rop-gov-om:person}Country"/&gt;
 *         &lt;element name="Wilayat" type="{urn:rop-gov-om:person}CodeDesc"/&gt;
 *         &lt;element name="Town" type="{urn:rop-gov-om:person}Town"/&gt;
 *         &lt;element name="Governorate" type="{urn:rop-gov-om:person}CodeDesc"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Birth", propOrder = {
    "dateOfBirth",
    "country",
    "wilayat",
    "town",
    "governorate"
})
public class Birth {

    @XmlElement(required = true, nillable = true)
    protected String dateOfBirth;
    @XmlElement(name = "Country", required = true, nillable = true)
    protected Country country;
    @XmlElement(name = "Wilayat", required = true, nillable = true)
    protected CodeDesc wilayat;
    @XmlElement(name = "Town", required = true, nillable = true)
    protected Town town;
    @XmlElement(name = "Governorate", required = true, nillable = true)
    protected CodeDesc governorate;

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
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
     *     {@link Town }
     *     
     */
    public Town getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link Town }
     *     
     */
    public void setTown(Town value) {
        this.town = value;
    }

    /**
     * Gets the value of the governorate property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getGovernorate() {
        return governorate;
    }

    /**
     * Sets the value of the governorate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setGovernorate(CodeDesc value) {
        this.governorate = value;
    }

}
