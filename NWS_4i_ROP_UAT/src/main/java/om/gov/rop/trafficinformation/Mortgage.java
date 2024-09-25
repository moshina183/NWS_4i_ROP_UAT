
package om.gov.rop.trafficinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mortgage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mortgage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mortgageeCompanyCode_crn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mortgageeCompanyCode_org" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mortgageeCompanyName_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mortgageeCompanyName_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mortgageStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mortgage", propOrder = {
    "mortgageeCompanyCodeCrn",
    "mortgageeCompanyCodeOrg",
    "mortgageeCompanyNameAr",
    "mortgageeCompanyNameEn",
    "mortgageStartDate"
})
public class Mortgage {

    @XmlElement(name = "mortgageeCompanyCode_crn", required = true, nillable = true)
    protected String mortgageeCompanyCodeCrn;
    @XmlElement(name = "mortgageeCompanyCode_org", required = true, nillable = true)
    protected String mortgageeCompanyCodeOrg;
    @XmlElement(name = "mortgageeCompanyName_ar", required = true, nillable = true)
    protected String mortgageeCompanyNameAr;
    @XmlElement(name = "mortgageeCompanyName_en", required = true, nillable = true)
    protected String mortgageeCompanyNameEn;
    @XmlElement(required = true, nillable = true)
    protected String mortgageStartDate;

    /**
     * Gets the value of the mortgageeCompanyCodeCrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageeCompanyCodeCrn() {
        return mortgageeCompanyCodeCrn;
    }

    /**
     * Sets the value of the mortgageeCompanyCodeCrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageeCompanyCodeCrn(String value) {
        this.mortgageeCompanyCodeCrn = value;
    }

    /**
     * Gets the value of the mortgageeCompanyCodeOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageeCompanyCodeOrg() {
        return mortgageeCompanyCodeOrg;
    }

    /**
     * Sets the value of the mortgageeCompanyCodeOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageeCompanyCodeOrg(String value) {
        this.mortgageeCompanyCodeOrg = value;
    }

    /**
     * Gets the value of the mortgageeCompanyNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageeCompanyNameAr() {
        return mortgageeCompanyNameAr;
    }

    /**
     * Sets the value of the mortgageeCompanyNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageeCompanyNameAr(String value) {
        this.mortgageeCompanyNameAr = value;
    }

    /**
     * Gets the value of the mortgageeCompanyNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageeCompanyNameEn() {
        return mortgageeCompanyNameEn;
    }

    /**
     * Sets the value of the mortgageeCompanyNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageeCompanyNameEn(String value) {
        this.mortgageeCompanyNameEn = value;
    }

    /**
     * Gets the value of the mortgageStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageStartDate() {
        return mortgageStartDate;
    }

    /**
     * Sets the value of the mortgageStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageStartDate(String value) {
        this.mortgageStartDate = value;
    }

}
