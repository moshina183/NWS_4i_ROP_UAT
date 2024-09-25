
package om.gov.rop.trafficinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vehicle2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vehicle2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehiclePK" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="chassisNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="engineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registrationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="foreignCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="foreignCountryDesc_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="foreignCountryDesc_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="foreignStateCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="foreignStateDesc_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="foreignStateDesc_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VehicleType" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="VehicleMake" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="VehicleModel" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="vehicleModelYear" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ManufacturedCountry" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="manufacturedYear" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="colourCode_1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="colourCode_2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="colourCode_3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="coloursDesc_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="coloursDesc_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tareMass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cargoMass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="passengerMaxQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="engineCapacity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="engineCylinderQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FuelType" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="axleQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Usage" type="{urn:rop-gov-om:TrafficInformation}CodeDesc"/&gt;
 *         &lt;element name="vehicleBlacklistFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vehicleBlacklistReasonDesc_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vehicleBlacklistReasonDesc_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vehicleBlacklistActionDesc_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vehicleBlacklistActionDesc_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exporterName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exportCountryDesc_ar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exportCountryDesc_en" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle2", propOrder = {
    "vehiclePK",
    "chassisNumber",
    "engineNumber",
    "registrationCode",
    "registrationNumber",
    "foreignCountryCode",
    "foreignCountryDescAr",
    "foreignCountryDescEn",
    "foreignStateCode",
    "foreignStateDescEn",
    "foreignStateDescAr",
    "vehicleType",
    "vehicleMake",
    "vehicleModel",
    "vehicleModelYear",
    "manufacturedCountry",
    "manufacturedYear",
    "colourCode1",
    "colourCode2",
    "colourCode3",
    "coloursDescAr",
    "coloursDescEn",
    "tareMass",
    "cargoMass",
    "passengerMaxQuantity",
    "engineCapacity",
    "engineCylinderQuantity",
    "fuelType",
    "axleQuantity",
    "usage",
    "vehicleBlacklistFlag",
    "vehicleBlacklistReasonDescAr",
    "vehicleBlacklistReasonDescEn",
    "vehicleBlacklistActionDescAr",
    "vehicleBlacklistActionDescEn",
    "exporterName",
    "exportCountryDescAr",
    "exportCountryDescEn"
})
public class Vehicle2 {

    @XmlElement(required = true, nillable = true)
    protected String vehiclePK;
    @XmlElement(required = true, nillable = true)
    protected String chassisNumber;
    @XmlElement(required = true, nillable = true)
    protected String engineNumber;
    @XmlElement(required = true, nillable = true)
    protected String registrationCode;
    @XmlElement(required = true, nillable = true)
    protected String registrationNumber;
    @XmlElement(required = true, nillable = true)
    protected String foreignCountryCode;
    @XmlElement(name = "foreignCountryDesc_ar", required = true, nillable = true)
    protected String foreignCountryDescAr;
    @XmlElement(name = "foreignCountryDesc_en", required = true, nillable = true)
    protected String foreignCountryDescEn;
    @XmlElement(required = true, nillable = true)
    protected String foreignStateCode;
    @XmlElement(name = "foreignStateDesc_en", required = true, nillable = true)
    protected String foreignStateDescEn;
    @XmlElement(name = "foreignStateDesc_ar", required = true, nillable = true)
    protected String foreignStateDescAr;
    @XmlElement(name = "VehicleType", required = true, nillable = true)
    protected CodeDesc vehicleType;
    @XmlElement(name = "VehicleMake", required = true, nillable = true)
    protected CodeDesc vehicleMake;
    @XmlElement(name = "VehicleModel", required = true, nillable = true)
    protected CodeDesc vehicleModel;
    @XmlElement(required = true, nillable = true)
    protected String vehicleModelYear;
    @XmlElement(name = "ManufacturedCountry", required = true, nillable = true)
    protected CodeDesc manufacturedCountry;
    @XmlElement(required = true, nillable = true)
    protected String manufacturedYear;
    @XmlElement(name = "colourCode_1", required = true, nillable = true)
    protected String colourCode1;
    @XmlElement(name = "colourCode_2", required = true, nillable = true)
    protected String colourCode2;
    @XmlElement(name = "colourCode_3", required = true, nillable = true)
    protected String colourCode3;
    @XmlElement(name = "coloursDesc_ar", required = true, nillable = true)
    protected String coloursDescAr;
    @XmlElement(name = "coloursDesc_en", required = true, nillable = true)
    protected String coloursDescEn;
    @XmlElement(required = true, nillable = true)
    protected String tareMass;
    @XmlElement(required = true, nillable = true)
    protected String cargoMass;
    @XmlElement(required = true, nillable = true)
    protected String passengerMaxQuantity;
    @XmlElement(required = true, nillable = true)
    protected String engineCapacity;
    @XmlElement(required = true, nillable = true)
    protected String engineCylinderQuantity;
    @XmlElement(name = "FuelType", required = true, nillable = true)
    protected CodeDesc fuelType;
    @XmlElement(required = true, nillable = true)
    protected String axleQuantity;
    @XmlElement(name = "Usage", required = true, nillable = true)
    protected CodeDesc usage;
    @XmlElement(required = true, nillable = true)
    protected String vehicleBlacklistFlag;
    @XmlElement(name = "vehicleBlacklistReasonDesc_ar", required = true, nillable = true)
    protected String vehicleBlacklistReasonDescAr;
    @XmlElement(name = "vehicleBlacklistReasonDesc_en", required = true, nillable = true)
    protected String vehicleBlacklistReasonDescEn;
    @XmlElement(name = "vehicleBlacklistActionDesc_ar", required = true, nillable = true)
    protected String vehicleBlacklistActionDescAr;
    @XmlElement(name = "vehicleBlacklistActionDesc_en", required = true, nillable = true)
    protected String vehicleBlacklistActionDescEn;
    @XmlElement(required = true, nillable = true)
    protected String exporterName;
    @XmlElement(name = "exportCountryDesc_ar", required = true, nillable = true)
    protected String exportCountryDescAr;
    @XmlElement(name = "exportCountryDesc_en", required = true, nillable = true)
    protected String exportCountryDescEn;

    /**
     * Gets the value of the vehiclePK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehiclePK() {
        return vehiclePK;
    }

    /**
     * Sets the value of the vehiclePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehiclePK(String value) {
        this.vehiclePK = value;
    }

    /**
     * Gets the value of the chassisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisNumber() {
        return chassisNumber;
    }

    /**
     * Sets the value of the chassisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisNumber(String value) {
        this.chassisNumber = value;
    }

    /**
     * Gets the value of the engineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /**
     * Sets the value of the engineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNumber(String value) {
        this.engineNumber = value;
    }

    /**
     * Gets the value of the registrationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationCode() {
        return registrationCode;
    }

    /**
     * Sets the value of the registrationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationCode(String value) {
        this.registrationCode = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the foreignCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignCountryCode() {
        return foreignCountryCode;
    }

    /**
     * Sets the value of the foreignCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignCountryCode(String value) {
        this.foreignCountryCode = value;
    }

    /**
     * Gets the value of the foreignCountryDescAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignCountryDescAr() {
        return foreignCountryDescAr;
    }

    /**
     * Sets the value of the foreignCountryDescAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignCountryDescAr(String value) {
        this.foreignCountryDescAr = value;
    }

    /**
     * Gets the value of the foreignCountryDescEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignCountryDescEn() {
        return foreignCountryDescEn;
    }

    /**
     * Sets the value of the foreignCountryDescEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignCountryDescEn(String value) {
        this.foreignCountryDescEn = value;
    }

    /**
     * Gets the value of the foreignStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStateCode() {
        return foreignStateCode;
    }

    /**
     * Sets the value of the foreignStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStateCode(String value) {
        this.foreignStateCode = value;
    }

    /**
     * Gets the value of the foreignStateDescEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStateDescEn() {
        return foreignStateDescEn;
    }

    /**
     * Sets the value of the foreignStateDescEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStateDescEn(String value) {
        this.foreignStateDescEn = value;
    }

    /**
     * Gets the value of the foreignStateDescAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStateDescAr() {
        return foreignStateDescAr;
    }

    /**
     * Sets the value of the foreignStateDescAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStateDescAr(String value) {
        this.foreignStateDescAr = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setVehicleType(CodeDesc value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the vehicleMake property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getVehicleMake() {
        return vehicleMake;
    }

    /**
     * Sets the value of the vehicleMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setVehicleMake(CodeDesc value) {
        this.vehicleMake = value;
    }

    /**
     * Gets the value of the vehicleModel property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getVehicleModel() {
        return vehicleModel;
    }

    /**
     * Sets the value of the vehicleModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setVehicleModel(CodeDesc value) {
        this.vehicleModel = value;
    }

    /**
     * Gets the value of the vehicleModelYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModelYear() {
        return vehicleModelYear;
    }

    /**
     * Sets the value of the vehicleModelYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModelYear(String value) {
        this.vehicleModelYear = value;
    }

    /**
     * Gets the value of the manufacturedCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getManufacturedCountry() {
        return manufacturedCountry;
    }

    /**
     * Sets the value of the manufacturedCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setManufacturedCountry(CodeDesc value) {
        this.manufacturedCountry = value;
    }

    /**
     * Gets the value of the manufacturedYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturedYear() {
        return manufacturedYear;
    }

    /**
     * Sets the value of the manufacturedYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturedYear(String value) {
        this.manufacturedYear = value;
    }

    /**
     * Gets the value of the colourCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColourCode1() {
        return colourCode1;
    }

    /**
     * Sets the value of the colourCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColourCode1(String value) {
        this.colourCode1 = value;
    }

    /**
     * Gets the value of the colourCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColourCode2() {
        return colourCode2;
    }

    /**
     * Sets the value of the colourCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColourCode2(String value) {
        this.colourCode2 = value;
    }

    /**
     * Gets the value of the colourCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColourCode3() {
        return colourCode3;
    }

    /**
     * Sets the value of the colourCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColourCode3(String value) {
        this.colourCode3 = value;
    }

    /**
     * Gets the value of the coloursDescAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColoursDescAr() {
        return coloursDescAr;
    }

    /**
     * Sets the value of the coloursDescAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColoursDescAr(String value) {
        this.coloursDescAr = value;
    }

    /**
     * Gets the value of the coloursDescEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColoursDescEn() {
        return coloursDescEn;
    }

    /**
     * Sets the value of the coloursDescEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColoursDescEn(String value) {
        this.coloursDescEn = value;
    }

    /**
     * Gets the value of the tareMass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTareMass() {
        return tareMass;
    }

    /**
     * Sets the value of the tareMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTareMass(String value) {
        this.tareMass = value;
    }

    /**
     * Gets the value of the cargoMass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoMass() {
        return cargoMass;
    }

    /**
     * Sets the value of the cargoMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoMass(String value) {
        this.cargoMass = value;
    }

    /**
     * Gets the value of the passengerMaxQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerMaxQuantity() {
        return passengerMaxQuantity;
    }

    /**
     * Sets the value of the passengerMaxQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerMaxQuantity(String value) {
        this.passengerMaxQuantity = value;
    }

    /**
     * Gets the value of the engineCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineCapacity() {
        return engineCapacity;
    }

    /**
     * Sets the value of the engineCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineCapacity(String value) {
        this.engineCapacity = value;
    }

    /**
     * Gets the value of the engineCylinderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineCylinderQuantity() {
        return engineCylinderQuantity;
    }

    /**
     * Sets the value of the engineCylinderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineCylinderQuantity(String value) {
        this.engineCylinderQuantity = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setFuelType(CodeDesc value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the axleQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxleQuantity() {
        return axleQuantity;
    }

    /**
     * Sets the value of the axleQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxleQuantity(String value) {
        this.axleQuantity = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDesc }
     *     
     */
    public CodeDesc getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDesc }
     *     
     */
    public void setUsage(CodeDesc value) {
        this.usage = value;
    }

    /**
     * Gets the value of the vehicleBlacklistFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleBlacklistFlag() {
        return vehicleBlacklistFlag;
    }

    /**
     * Sets the value of the vehicleBlacklistFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleBlacklistFlag(String value) {
        this.vehicleBlacklistFlag = value;
    }

    /**
     * Gets the value of the vehicleBlacklistReasonDescAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleBlacklistReasonDescAr() {
        return vehicleBlacklistReasonDescAr;
    }

    /**
     * Sets the value of the vehicleBlacklistReasonDescAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleBlacklistReasonDescAr(String value) {
        this.vehicleBlacklistReasonDescAr = value;
    }

    /**
     * Gets the value of the vehicleBlacklistReasonDescEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleBlacklistReasonDescEn() {
        return vehicleBlacklistReasonDescEn;
    }

    /**
     * Sets the value of the vehicleBlacklistReasonDescEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleBlacklistReasonDescEn(String value) {
        this.vehicleBlacklistReasonDescEn = value;
    }

    /**
     * Gets the value of the vehicleBlacklistActionDescAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleBlacklistActionDescAr() {
        return vehicleBlacklistActionDescAr;
    }

    /**
     * Sets the value of the vehicleBlacklistActionDescAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleBlacklistActionDescAr(String value) {
        this.vehicleBlacklistActionDescAr = value;
    }

    /**
     * Gets the value of the vehicleBlacklistActionDescEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleBlacklistActionDescEn() {
        return vehicleBlacklistActionDescEn;
    }

    /**
     * Sets the value of the vehicleBlacklistActionDescEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleBlacklistActionDescEn(String value) {
        this.vehicleBlacklistActionDescEn = value;
    }

    /**
     * Gets the value of the exporterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExporterName() {
        return exporterName;
    }

    /**
     * Sets the value of the exporterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExporterName(String value) {
        this.exporterName = value;
    }

    /**
     * Gets the value of the exportCountryDescAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportCountryDescAr() {
        return exportCountryDescAr;
    }

    /**
     * Sets the value of the exportCountryDescAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportCountryDescAr(String value) {
        this.exportCountryDescAr = value;
    }

    /**
     * Gets the value of the exportCountryDescEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportCountryDescEn() {
        return exportCountryDescEn;
    }

    /**
     * Sets the value of the exportCountryDescEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportCountryDescEn(String value) {
        this.exportCountryDescEn = value;
    }

}
