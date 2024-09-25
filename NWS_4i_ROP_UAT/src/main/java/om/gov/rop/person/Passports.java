
package om.gov.rop.person;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Passports complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Passports"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="civilNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Passport" type="{urn:rop-gov-om:person}PassportType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Passports", propOrder = {
    "civilNumber",
    "passport"
})
public class Passports {

    @XmlElement(required = true, nillable = true)
    protected String civilNumber;
    @XmlElement(name = "Passport", required = true, nillable = true)
    protected List<PassportType> passport;

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
     * Gets the value of the passport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassportType }
     * 
     * 
     */
    public List<PassportType> getPassport() {
        if (passport == null) {
            passport = new ArrayList<PassportType>();
        }
        return this.passport;
    }

}
