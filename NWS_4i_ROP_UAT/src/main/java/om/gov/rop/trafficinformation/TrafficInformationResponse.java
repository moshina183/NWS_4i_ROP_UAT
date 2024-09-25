
package om.gov.rop.trafficinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficInformationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficInformationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Response" type="{urn:rop-gov-om:TrafficInformation}TrafficInformationResponse2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficInformationResponse", propOrder = {
    "response"
})
public class TrafficInformationResponse {

    @XmlElement(name = "Response", required = true, nillable = true)
    protected TrafficInformationResponse2 response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficInformationResponse2 }
     *     
     */
    public TrafficInformationResponse2 getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficInformationResponse2 }
     *     
     */
    public void setResponse(TrafficInformationResponse2 value) {
        this.response = value;
    }

}
