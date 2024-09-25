
package om.gov.rop.person;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Relations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maritalStatus_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="maritalStatus_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deathStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Relation" type="{urn:rop-gov-om:person}RelationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relations", propOrder = {
    "maritalStatusEn",
    "maritalStatusAr",
    "deathStatus",
    "relation"
})
public class Relations {

    @XmlElement(name = "maritalStatus_en", required = true, nillable = true)
    protected String maritalStatusEn;
    @XmlElement(name = "maritalStatus_ar", required = true, nillable = true)
    protected String maritalStatusAr;
    @XmlElement(required = true, nillable = true)
    protected String deathStatus;
    @XmlElement(name = "Relation", required = true, nillable = true)
    protected List<RelationType> relation;

    /**
     * Gets the value of the maritalStatusEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatusEn() {
        return maritalStatusEn;
    }

    /**
     * Sets the value of the maritalStatusEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatusEn(String value) {
        this.maritalStatusEn = value;
    }

    /**
     * Gets the value of the maritalStatusAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatusAr() {
        return maritalStatusAr;
    }

    /**
     * Sets the value of the maritalStatusAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatusAr(String value) {
        this.maritalStatusAr = value;
    }

    /**
     * Gets the value of the deathStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathStatus() {
        return deathStatus;
    }

    /**
     * Sets the value of the deathStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathStatus(String value) {
        this.deathStatus = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getRelation() {
        if (relation == null) {
            relation = new ArrayList<RelationType>();
        }
        return this.relation;
    }

}
