
package om.gov.rop.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_Card" type="{urn:rop-gov-om:person}ID_Card"/&gt;
 *         &lt;element name="Passports" type="{urn:rop-gov-om:person}Passports"/&gt;
 *         &lt;element name="Visa" type="{urn:rop-gov-om:person}Visa"/&gt;
 *         &lt;element name="Death" type="{urn:rop-gov-om:person}Death"/&gt;
 *         &lt;element name="Relations" type="{urn:rop-gov-om:person}Relations"/&gt;
 *         &lt;element name="Address" type="{urn:rop-gov-om:person}Address2"/&gt;
 *         &lt;element name="Biometrics" type="{urn:rop-gov-om:person}Biometrics"/&gt;
 *         &lt;element name="Naturalization" type="{urn:rop-gov-om:person}Naturalization"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "idCard",
    "passports",
    "visa",
    "death",
    "relations",
    "address",
    "biometrics",
    "naturalization"
})
public class Person {

    @XmlElement(name = "ID_Card", required = true, nillable = true)
    protected IDCard idCard;
    @XmlElement(name = "Passports", required = true, nillable = true)
    protected Passports passports;
    @XmlElement(name = "Visa", required = true, nillable = true)
    protected Visa visa;
    @XmlElement(name = "Death", required = true, nillable = true)
    protected Death death;
    @XmlElement(name = "Relations", required = true, nillable = true)
    protected Relations relations;
    @XmlElement(name = "Address", required = true, nillable = true)
    protected Address2 address;
    @XmlElement(name = "Biometrics", required = true, nillable = true)
    protected Biometrics biometrics;
    @XmlElement(name = "Naturalization", required = true, nillable = true)
    protected Naturalization naturalization;

    /**
     * Gets the value of the idCard property.
     * 
     * @return
     *     possible object is
     *     {@link IDCard }
     *     
     */
    public IDCard getIDCard() {
        return idCard;
    }

    /**
     * Sets the value of the idCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDCard }
     *     
     */
    public void setIDCard(IDCard value) {
        this.idCard = value;
    }

    /**
     * Gets the value of the passports property.
     * 
     * @return
     *     possible object is
     *     {@link Passports }
     *     
     */
    public Passports getPassports() {
        return passports;
    }

    /**
     * Sets the value of the passports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passports }
     *     
     */
    public void setPassports(Passports value) {
        this.passports = value;
    }

    /**
     * Gets the value of the visa property.
     * 
     * @return
     *     possible object is
     *     {@link Visa }
     *     
     */
    public Visa getVisa() {
        return visa;
    }

    /**
     * Sets the value of the visa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visa }
     *     
     */
    public void setVisa(Visa value) {
        this.visa = value;
    }

    /**
     * Gets the value of the death property.
     * 
     * @return
     *     possible object is
     *     {@link Death }
     *     
     */
    public Death getDeath() {
        return death;
    }

    /**
     * Sets the value of the death property.
     * 
     * @param value
     *     allowed object is
     *     {@link Death }
     *     
     */
    public void setDeath(Death value) {
        this.death = value;
    }

    /**
     * Gets the value of the relations property.
     * 
     * @return
     *     possible object is
     *     {@link Relations }
     *     
     */
    public Relations getRelations() {
        return relations;
    }

    /**
     * Sets the value of the relations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relations }
     *     
     */
    public void setRelations(Relations value) {
        this.relations = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setAddress(Address2 value) {
        this.address = value;
    }

    /**
     * Gets the value of the biometrics property.
     * 
     * @return
     *     possible object is
     *     {@link Biometrics }
     *     
     */
    public Biometrics getBiometrics() {
        return biometrics;
    }

    /**
     * Sets the value of the biometrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Biometrics }
     *     
     */
    public void setBiometrics(Biometrics value) {
        this.biometrics = value;
    }

    /**
     * Gets the value of the naturalization property.
     * 
     * @return
     *     possible object is
     *     {@link Naturalization }
     *     
     */
    public Naturalization getNaturalization() {
        return naturalization;
    }

    /**
     * Sets the value of the naturalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Naturalization }
     *     
     */
    public void setNaturalization(Naturalization value) {
        this.naturalization = value;
    }

}
