
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Photo2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Photo2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hiRes" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
@XmlType(name = "Photo2", propOrder = {
    "hiRes",
    "loRes"
})
public class Photo2 {

    @XmlElement(required = true, nillable = true)
    protected Object hiRes;
    @XmlElement(required = true, nillable = true)
    protected Object loRes;

    /**
     * Gets the value of the hiRes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHiRes() {
        return hiRes;
    }

    /**
     * Sets the value of the hiRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHiRes(Object value) {
        this.hiRes = value;
    }

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
