
package om.gov.rop.trafficinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Plate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Plate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="code_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="code_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desc_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Plate", propOrder = {
    "typeEn",
    "typeAr",
    "codeEn",
    "codeAr",
    "number",
    "descEn",
    "descAr"
})
public class Plate {

    @XmlElement(name = "type_en", required = true, nillable = true)
    protected String typeEn;
    @XmlElement(name = "type_ar", required = true, nillable = true)
    protected String typeAr;
    @XmlElement(name = "code_en", required = true, nillable = true)
    protected String codeEn;
    @XmlElement(name = "code_ar", required = true, nillable = true)
    protected String codeAr;
    @XmlElement(required = true, nillable = true)
    protected String number;
    @XmlElement(name = "desc_en", required = true, nillable = true)
    protected String descEn;
    @XmlElement(name = "desc_ar", required = true, nillable = true)
    protected String descAr;

    /**
     * Gets the value of the typeEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeEn() {
        return typeEn;
    }

    /**
     * Sets the value of the typeEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeEn(String value) {
        this.typeEn = value;
    }

    /**
     * Gets the value of the typeAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAr() {
        return typeAr;
    }

    /**
     * Sets the value of the typeAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAr(String value) {
        this.typeAr = value;
    }

    /**
     * Gets the value of the codeEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeEn() {
        return codeEn;
    }

    /**
     * Sets the value of the codeEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeEn(String value) {
        this.codeEn = value;
    }

    /**
     * Gets the value of the codeAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeAr() {
        return codeAr;
    }

    /**
     * Sets the value of the codeAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeAr(String value) {
        this.codeAr = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the descEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEn() {
        return descEn;
    }

    /**
     * Sets the value of the descEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEn(String value) {
        this.descEn = value;
    }

    /**
     * Gets the value of the descAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescAr() {
        return descAr;
    }

    /**
     * Sets the value of the descAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescAr(String value) {
        this.descAr = value;
    }

}
