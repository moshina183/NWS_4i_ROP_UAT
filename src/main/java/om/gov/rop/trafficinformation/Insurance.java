
package om.gov.rop.trafficinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Insurance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Insurance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insuranceCompanyCode_crn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insuranceCompanyCode_org" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insuranceCompanyName_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insuranceCompanyName_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insurancePolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InsuranceType" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="insuranceStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insuranceEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Insurance", propOrder = {
    "insuranceCompanyCodeCrn",
    "insuranceCompanyCodeOrg",
    "insuranceCompanyNameAr",
    "insuranceCompanyNameEn",
    "insurancePolicyNumber",
    "insuranceType",
    "insuranceStartDate",
    "insuranceEndDate"
})
public class Insurance {

    @XmlElement(name = "insuranceCompanyCode_crn", required = true, nillable = true)
    protected String insuranceCompanyCodeCrn;
    @XmlElement(name = "insuranceCompanyCode_org", required = true, nillable = true)
    protected String insuranceCompanyCodeOrg;
    @XmlElement(name = "insuranceCompanyName_ar", required = true, nillable = true)
    protected String insuranceCompanyNameAr;
    @XmlElement(name = "insuranceCompanyName_en", required = true, nillable = true)
    protected String insuranceCompanyNameEn;
    @XmlElement(required = true, nillable = true)
    protected String insurancePolicyNumber;
    @XmlElement(name = "InsuranceType", required = true, nillable = true)
    protected CodeDesc insuranceType;
    @XmlElement(required = true, nillable = true)
    protected String insuranceStartDate;
    @XmlElement(required = true, nillable = true)
    protected String insuranceEndDate;

    /**
     * Gets the value of the insuranceCompanyCodeCrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCompanyCodeCrn() {
        return insuranceCompanyCodeCrn;
    }

    /**
     * Sets the value of the insuranceCompanyCodeCrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCompanyCodeCrn(String value) {
        this.insuranceCompanyCodeCrn = value;
    }

    /**
     * Gets the value of the insuranceCompanyCodeOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCompanyCodeOrg() {
        return insuranceCompanyCodeOrg;
    }

    /**
     * Sets the value of the insuranceCompanyCodeOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCompanyCodeOrg(String value) {
        this.insuranceCompanyCodeOrg = value;
    }

    /**
     * Gets the value of the insuranceCompanyNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCompanyNameAr() {
        return insuranceCompanyNameAr;
    }

    /**
     * Sets the value of the insuranceCompanyNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCompanyNameAr(String value) {
        this.insuranceCompanyNameAr = value;
    }

    /**
     * Gets the value of the insuranceCompanyNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCompanyNameEn() {
        return insuranceCompanyNameEn;
    }

    /**
     * Sets the value of the insuranceCompanyNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCompanyNameEn(String value) {
        this.insuranceCompanyNameEn = value;
    }

    /**
     * Gets the value of the insurancePolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    /**
     * Sets the value of the insurancePolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurancePolicyNumber(String value) {
        this.insurancePolicyNumber = value;
    }

    /**
     * Gets the value of the insuranceType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getInsuranceType() {
        return insuranceType;
    }

    /**
     * Sets the value of the insuranceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setInsuranceType(CodeDesc value) {
        this.insuranceType = value;
    }

    /**
     * Gets the value of the insuranceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceStartDate() {
        return insuranceStartDate;
    }

    /**
     * Sets the value of the insuranceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceStartDate(String value) {
        this.insuranceStartDate = value;
    }

    /**
     * Gets the value of the insuranceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceEndDate() {
        return insuranceEndDate;
    }

    /**
     * Sets the value of the insuranceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceEndDate(String value) {
        this.insuranceEndDate = value;
    }

}
