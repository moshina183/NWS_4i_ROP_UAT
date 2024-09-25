
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fingerprint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fingerprint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WSQ" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fingerprint", propOrder = {
    "wsq",
    "index"
})
public class Fingerprint {

    @XmlElement(name = "WSQ", required = true, nillable = true)
    protected Object wsq;
    @XmlElement(required = true, nillable = true)
    protected String index;

    /**
     * Gets the value of the wsq property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWSQ() {
        return wsq;
    }

    /**
     * Sets the value of the wsq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWSQ(Object value) {
        this.wsq = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

}
