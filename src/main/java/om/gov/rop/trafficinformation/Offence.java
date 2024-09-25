
package om.gov.rop.trafficinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Offence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Offence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="torNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="torDesc_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="torDesc_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="torGCCNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="torType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="occuranceDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="occuranceTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="occuranceCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OccurancePlace" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="OccuranceSubPlace" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="Plate" type="{urn:rop-gov-om:TrafficInformation}Plate"/&gt;
 *         &lt;element name="torFineMinimum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="torImage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isPaid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Offence", propOrder = {
    "torNumber",
    "torDescAr",
    "torDescEn",
    "torGCCNumber",
    "torType",
    "occuranceDate",
    "occuranceTime",
    "occuranceCountryCode",
    "occurancePlace",
    "occuranceSubPlace",
    "plate",
    "torFineMinimum",
    "torImage",
    "isPaid"
})
public class Offence {

    @XmlElement(required = true, nillable = true)
    protected String torNumber;
    @XmlElement(name = "torDesc_ar", required = true, nillable = true)
    protected String torDescAr;
    @XmlElement(name = "torDesc_en", required = true, nillable = true)
    protected String torDescEn;
    @XmlElement(required = true, nillable = true)
    protected String torGCCNumber;
    @XmlElement(required = true, nillable = true)
    protected String torType;
    @XmlElement(required = true, nillable = true)
    protected String occuranceDate;
    @XmlElement(required = true, nillable = true)
    protected String occuranceTime;
    @XmlElement(required = true, nillable = true)
    protected String occuranceCountryCode;
    @XmlElement(name = "OccurancePlace", required = true, nillable = true)
    protected CodeDesc occurancePlace;
    @XmlElement(name = "OccuranceSubPlace", required = true, nillable = true)
    protected CodeDesc occuranceSubPlace;
    @XmlElement(name = "Plate", required = true, nillable = true)
    protected Plate plate;
    @XmlElement(required = true, nillable = true)
    protected String torFineMinimum;
    @XmlElement(required = true, nillable = true)
    protected String torImage;
    @XmlElement(required = true, nillable = true)
    protected String isPaid;

    /**
     * Gets the value of the torNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTorNumber() {
        return torNumber;
    }

    /**
     * Sets the value of the torNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTorNumber(String value) {
        this.torNumber = value;
    }

    /**
     * Gets the value of the torDescAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTorDescAr() {
        return torDescAr;
    }

    /**
     * Sets the value of the torDescAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTorDescAr(String value) {
        this.torDescAr = value;
    }

    /**
     * Gets the value of the torDescEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTorDescEn() {
        return torDescEn;
    }

    /**
     * Sets the value of the torDescEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTorDescEn(String value) {
        this.torDescEn = value;
    }

    /**
     * Gets the value of the torGCCNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTorGCCNumber() {
        return torGCCNumber;
    }

    /**
     * Sets the value of the torGCCNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTorGCCNumber(String value) {
        this.torGCCNumber = value;
    }

    /**
     * Gets the value of the torType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTorType() {
        return torType;
    }

    /**
     * Sets the value of the torType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTorType(String value) {
        this.torType = value;
    }

    /**
     * Gets the value of the occuranceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccuranceDate() {
        return occuranceDate;
    }

    /**
     * Sets the value of the occuranceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccuranceDate(String value) {
        this.occuranceDate = value;
    }

    /**
     * Gets the value of the occuranceTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccuranceTime() {
        return occuranceTime;
    }

    /**
     * Sets the value of the occuranceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccuranceTime(String value) {
        this.occuranceTime = value;
    }

    /**
     * Gets the value of the occuranceCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccuranceCountryCode() {
        return occuranceCountryCode;
    }

    /**
     * Sets the value of the occuranceCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccuranceCountryCode(String value) {
        this.occuranceCountryCode = value;
    }

    /**
     * Gets the value of the occurancePlace property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getOccurancePlace() {
        return occurancePlace;
    }

    /**
     * Sets the value of the occurancePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setOccurancePlace(CodeDesc value) {
        this.occurancePlace = value;
    }

    /**
     * Gets the value of the occuranceSubPlace property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getOccuranceSubPlace() {
        return occuranceSubPlace;
    }

    /**
     * Sets the value of the occuranceSubPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setOccuranceSubPlace(CodeDesc value) {
        this.occuranceSubPlace = value;
    }

    /**
     * Gets the value of the plate property.
     * 
     * @return
     *     possible object is
     *     {@link Plate }
     *     
     */
    public Plate getPlate() {
        return plate;
    }

    /**
     * Sets the value of the plate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Plate }
     *     
     */
    public void setPlate(Plate value) {
        this.plate = value;
    }

    /**
     * Gets the value of the torFineMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTorFineMinimum() {
        return torFineMinimum;
    }

    /**
     * Sets the value of the torFineMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTorFineMinimum(String value) {
        this.torFineMinimum = value;
    }

    /**
     * Gets the value of the torImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTorImage() {
        return torImage;
    }

    /**
     * Sets the value of the torImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTorImage(String value) {
        this.torImage = value;
    }

    /**
     * Gets the value of the isPaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPaid() {
        return isPaid;
    }

    /**
     * Sets the value of the isPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPaid(String value) {
        this.isPaid = value;
    }

}
