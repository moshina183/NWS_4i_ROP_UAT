
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Name complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Name"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="title_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_1_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_1_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_2_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_2_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_3_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_3_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_4_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_4_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_5_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_5_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_6_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name_6_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Name", propOrder = {
    "titleEn",
    "titleAr",
    "name1En",
    "name1Ar",
    "name2En",
    "name2Ar",
    "name3En",
    "name3Ar",
    "name4En",
    "name4Ar",
    "name5En",
    "name5Ar",
    "name6En",
    "name6Ar"
})
public class Name {

    @XmlElement(name = "title_en", required = true, nillable = true)
    protected String titleEn;
    @XmlElement(name = "title_ar", required = true, nillable = true)
    protected String titleAr;
    @XmlElement(name = "name_1_en", required = true, nillable = true)
    protected String name1En;
    @XmlElement(name = "name_1_ar", required = true, nillable = true)
    protected String name1Ar;
    @XmlElement(name = "name_2_en", required = true, nillable = true)
    protected String name2En;
    @XmlElement(name = "name_2_ar", required = true, nillable = true)
    protected String name2Ar;
    @XmlElement(name = "name_3_en", required = true, nillable = true)
    protected String name3En;
    @XmlElement(name = "name_3_ar", required = true, nillable = true)
    protected String name3Ar;
    @XmlElement(name = "name_4_en", required = true, nillable = true)
    protected String name4En;
    @XmlElement(name = "name_4_ar", required = true, nillable = true)
    protected String name4Ar;
    @XmlElement(name = "name_5_en", required = true, nillable = true)
    protected String name5En;
    @XmlElement(name = "name_5_ar", required = true, nillable = true)
    protected String name5Ar;
    @XmlElement(name = "name_6_en", required = true, nillable = true)
    protected String name6En;
    @XmlElement(name = "name_6_ar", required = true, nillable = true)
    protected String name6Ar;

    /**
     * Gets the value of the titleEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleEn() {
        return titleEn;
    }

    /**
     * Sets the value of the titleEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleEn(String value) {
        this.titleEn = value;
    }

    /**
     * Gets the value of the titleAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleAr() {
        return titleAr;
    }

    /**
     * Sets the value of the titleAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAr(String value) {
        this.titleAr = value;
    }

    /**
     * Gets the value of the name1En property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1En() {
        return name1En;
    }

    /**
     * Sets the value of the name1En property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1En(String value) {
        this.name1En = value;
    }

    /**
     * Gets the value of the name1Ar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1Ar() {
        return name1Ar;
    }

    /**
     * Sets the value of the name1Ar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1Ar(String value) {
        this.name1Ar = value;
    }

    /**
     * Gets the value of the name2En property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2En() {
        return name2En;
    }

    /**
     * Sets the value of the name2En property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2En(String value) {
        this.name2En = value;
    }

    /**
     * Gets the value of the name2Ar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2Ar() {
        return name2Ar;
    }

    /**
     * Sets the value of the name2Ar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2Ar(String value) {
        this.name2Ar = value;
    }

    /**
     * Gets the value of the name3En property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName3En() {
        return name3En;
    }

    /**
     * Sets the value of the name3En property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName3En(String value) {
        this.name3En = value;
    }

    /**
     * Gets the value of the name3Ar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName3Ar() {
        return name3Ar;
    }

    /**
     * Sets the value of the name3Ar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName3Ar(String value) {
        this.name3Ar = value;
    }

    /**
     * Gets the value of the name4En property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName4En() {
        return name4En;
    }

    /**
     * Sets the value of the name4En property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName4En(String value) {
        this.name4En = value;
    }

    /**
     * Gets the value of the name4Ar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName4Ar() {
        return name4Ar;
    }

    /**
     * Sets the value of the name4Ar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName4Ar(String value) {
        this.name4Ar = value;
    }

    /**
     * Gets the value of the name5En property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName5En() {
        return name5En;
    }

    /**
     * Sets the value of the name5En property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName5En(String value) {
        this.name5En = value;
    }

    /**
     * Gets the value of the name5Ar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName5Ar() {
        return name5Ar;
    }

    /**
     * Sets the value of the name5Ar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName5Ar(String value) {
        this.name5Ar = value;
    }

    /**
     * Gets the value of the name6En property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName6En() {
        return name6En;
    }

    /**
     * Sets the value of the name6En property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName6En(String value) {
        this.name6En = value;
    }

    /**
     * Gets the value of the name6Ar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName6Ar() {
        return name6Ar;
    }

    /**
     * Sets the value of the name6Ar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName6Ar(String value) {
        this.name6Ar = value;
    }

}
