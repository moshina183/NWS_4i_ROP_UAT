
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Photo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Photo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loRes" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Photo", propOrder = {
    "loRes"
})
public class Photo {

    @XmlElement(required = true, nillable = true)
    protected Object loRes;

    /**
     * Gets the value of the loRes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLoRes() {
        return loRes;
    }

    /**
     * Sets the value of the loRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLoRes(Object value) {
        this.loRes = value;
    }

}
