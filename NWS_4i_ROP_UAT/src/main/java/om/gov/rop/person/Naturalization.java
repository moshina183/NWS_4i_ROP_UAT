
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Naturalization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Naturalization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="naturalizationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfNaturalization" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Naturalization", propOrder = {
    "naturalizationNumber",
    "dateOfNaturalization"
})
public class Naturalization {

    @XmlElement(required = true, nillable = true)
    protected String naturalizationNumber;
    @XmlElement(required = true, nillable = true)
    protected String dateOfNaturalization;

    /**
     * Gets the value of the naturalizationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalizationNumber() {
        return naturalizationNumber;
    }

    /**
     * Sets the value of the naturalizationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalizationNumber(String value) {
        this.naturalizationNumber = value;
    }

    /**
     * Gets the value of the dateOfNaturalization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfNaturalization() {
        return dateOfNaturalization;
    }

    /**
     * Sets the value of the dateOfNaturalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfNaturalization(String value) {
        this.dateOfNaturalization = value;
    }

}
