
package om.gov.rop.trafficinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status_Lng complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Status_Lng"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{urn:rop-gov-om:TrafficInformation}code2"/&gt;
 *         &lt;element name="message_en" type="{urn:rop-gov-om:TrafficInformation}message_en"/&gt;
 *         &lt;element name="message_ar" type="{urn:rop-gov-om:TrafficInformation}message_ar"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status_Lng", propOrder = {
    "code",
    "messageEn",
    "messageAr"
})
public class StatusLng {

    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(name = "message_en", required = true, nillable = true)
    protected String messageEn;
    @XmlElement(name = "message_ar", required = true, nillable = true)
    protected String messageAr;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the messageEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageEn() {
        return messageEn;
    }

    /**
     * Sets the value of the messageEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageEn(String value) {
        this.messageEn = value;
    }

    /**
     * Gets the value of the messageAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageAr() {
        return messageAr;
    }

    /**
     * Sets the value of the messageAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageAr(String value) {
        this.messageAr = value;
    }

}
