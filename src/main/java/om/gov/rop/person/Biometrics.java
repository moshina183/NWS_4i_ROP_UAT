
package om.gov.rop.person;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Biometrics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Biometrics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateOfCapture" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Fingerprint" type="{urn:rop-gov-om:person}Fingerprint" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Photo" type="{urn:rop-gov-om:person}Photo2"/&gt;
 *         &lt;element name="Signature" type="{urn:rop-gov-om:person}Signature2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Biometrics", propOrder = {
    "dateOfCapture",
    "fingerprint",
    "photo",
    "signature"
})
public class Biometrics {

    @XmlElement(required = true, nillable = true)
    protected String dateOfCapture;
    @XmlElement(name = "Fingerprint", required = true, nillable = true)
    protected List<Fingerprint> fingerprint;
    @XmlElement(name = "Photo", required = true, nillable = true)
    protected Photo2 photo;
    @XmlElement(name = "Signature", required = true, nillable = true)
    protected Signature2 signature;

    /**
     * Gets the value of the dateOfCapture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfCapture() {
        return dateOfCapture;
    }

    /**
     * Sets the value of the dateOfCapture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfCapture(String value) {
        this.dateOfCapture = value;
    }

    /**
     * Gets the value of the fingerprint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fingerprint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFingerprint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fingerprint }
     * 
     * 
     */
    public List<Fingerprint> getFingerprint() {
        if (fingerprint == null) {
            fingerprint = new ArrayList<Fingerprint>();
        }
        return this.fingerprint;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     {@link Photo2 }
     *     
     */
    public Photo2 getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Photo2 }
     *     
     */
    public void setPhoto(Photo2 value) {
        this.photo = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link Signature2 }
     *     
     */
    public Signature2 getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature2 }
     *     
     */
    public void setSignature(Signature2 value) {
        this.signature = value;
    }

}
