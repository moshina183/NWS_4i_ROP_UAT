
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="civilNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reasonOfEnd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deathStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationType", propOrder = {
    "civilNumber",
    "type",
    "gender",
    "reasonOfEnd",
    "deathStatus",
    "nameEn",
    "nameAr"
})
public class RelationType {

    @XmlElement(required = true, nillable = true)
    protected String civilNumber;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String gender;
    @XmlElement(required = true, nillable = true)
    protected String reasonOfEnd;
    @XmlElement(required = true, nillable = true)
    protected String deathStatus;
    @XmlElement(name = "name_en", required = true, nillable = true)
    protected String nameEn;
    @XmlElement(name = "name_ar", required = true, nillable = true)
    protected String nameAr;

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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the reasonOfEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonOfEnd() {
        return reasonOfEnd;
    }

    /**
     * Sets the value of the reasonOfEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonOfEnd(String value) {
        this.reasonOfEnd = value;
    }

    /**
     * Gets the value of the deathStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathStatus() {
        return deathStatus;
    }

    /**
     * Sets the value of the deathStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathStatus(String value) {
        this.deathStatus = value;
    }

    /**
     * Gets the value of the nameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * Sets the value of the nameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEn(String value) {
        this.nameEn = value;
    }

    /**
     * Gets the value of the nameAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAr() {
        return nameAr;
    }

    /**
     * Sets the value of the nameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAr(String value) {
        this.nameAr = value;
    }

}
