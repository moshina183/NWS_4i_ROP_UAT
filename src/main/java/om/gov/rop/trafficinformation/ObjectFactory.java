
package om.gov.rop.trafficinformation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the om.gov.rop.trafficinformation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TrafficInformation_QNAME = new QName("urn:rop-gov-om:TrafficInformation", "TrafficInformation");
    private final static QName _TrafficInformationResponse_QNAME = new QName("urn:rop-gov-om:TrafficInformation", "TrafficInformationResponse");
    private final static QName _OffencesStatus_QNAME = new QName("", "Status");
    private final static QName _VehicleDetails_QNAME = new QName("", "Details");
    private final static QName _VehicleRegistration_QNAME = new QName("", "Registration");
    private final static QName _VehicleInsurance_QNAME = new QName("", "Insurance");
    private final static QName _VehicleMortgage_QNAME = new QName("", "Mortgage");
    private final static QName _VehicleOwner_QNAME = new QName("", "Owner");
    private final static QName _TrafficInformationResponse2DrivingLicense_QNAME = new QName("", "DrivingLicense");
    private final static QName _TrafficInformationResponse2Offences_QNAME = new QName("", "Offences");
    private final static QName _TrafficInformationRequestPersonNumber_QNAME = new QName("", "personNumber");
    private final static QName _TrafficInformationRequestCivilNumber_QNAME = new QName("", "civilNumber");
    private final static QName _TrafficInformationRequestCardExpiryDate_QNAME = new QName("", "cardExpiryDate");
    private final static QName _TrafficInformationRequestPassportNumber_QNAME = new QName("", "passportNumber");
    private final static QName _TrafficInformationRequestPassportCountryCode_QNAME = new QName("", "passportCountryCode");
    private final static QName _TrafficInformationRequestPassportExpiryDate_QNAME = new QName("", "passportExpiryDate");
    private final static QName _TrafficInformationRequestVisaNumber_QNAME = new QName("", "visaNumber");
    private final static QName _TrafficInformationRequestDrivingLicenseNumber_QNAME = new QName("", "drivingLicenseNumber");
    private final static QName _TrafficInformationRequestFirstIssueDate_QNAME = new QName("", "firstIssueDate");
    private final static QName _TrafficInformationRequestCompanyRegistrationNumber_QNAME = new QName("", "companyRegistrationNumber");
    private final static QName _TrafficInformationRequestInternalOrganizationNumber_QNAME = new QName("", "internalOrganizationNumber");
    private final static QName _TrafficInformationRequestRegistrationCode_QNAME = new QName("", "registrationCode");
    private final static QName _TrafficInformationRequestRegistrationNumber_QNAME = new QName("", "registrationNumber");
    private final static QName _TrafficInformationRequestRegistrationRegion_QNAME = new QName("", "registrationRegion");
    private final static QName _TrafficInformationRequestForeignCountryCode_QNAME = new QName("", "foreignCountryCode");
    private final static QName _TrafficInformationRequestForeignStateCode_QNAME = new QName("", "foreignStateCode");
    private final static QName _TrafficInformationRequestChassisNumber_QNAME = new QName("", "chassisNumber");
    private final static QName _TrafficInformationRequestEngineNumber_QNAME = new QName("", "engineNumber");
    private final static QName _TrafficInformationRequestVehiclePK_QNAME = new QName("", "vehiclePK");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: om.gov.rop.trafficinformation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrafficInformation }
     * 
     */
    public TrafficInformation createTrafficInformation() {
        return new TrafficInformation();
    }

    /**
     * Create an instance of {@link TrafficInformationResponse }
     * 
     */
    public TrafficInformationResponse createTrafficInformationResponse() {
        return new TrafficInformationResponse();
    }

    /**
     * Create an instance of {@link TrafficInformationRequest }
     * 
     */
    public TrafficInformationRequest createTrafficInformationRequest() {
        return new TrafficInformationRequest();
    }

    /**
     * Create an instance of {@link TrafficInformationResponse2 }
     * 
     */
    public TrafficInformationResponse2 createTrafficInformationResponse2() {
        return new TrafficInformationResponse2();
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link Vehicle2 }
     * 
     */
    public Vehicle2 createVehicle2() {
        return new Vehicle2();
    }

    /**
     * Create an instance of {@link CodeDesc }
     * 
     */
    public CodeDesc createCodeDesc() {
        return new CodeDesc();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link Insurance }
     * 
     */
    public Insurance createInsurance() {
        return new Insurance();
    }

    /**
     * Create an instance of {@link Mortgage }
     * 
     */
    public Mortgage createMortgage() {
        return new Mortgage();
    }

    /**
     * Create an instance of {@link Owner }
     * 
     */
    public Owner createOwner() {
        return new Owner();
    }

    /**
     * Create an instance of {@link StatusLng }
     * 
     */
    public StatusLng createStatusLng() {
        return new StatusLng();
    }

    /**
     * Create an instance of {@link DrivingLicense }
     * 
     */
    public DrivingLicense createDrivingLicense() {
        return new DrivingLicense();
    }

    /**
     * Create an instance of {@link LicenseClass }
     * 
     */
    public LicenseClass createLicenseClass() {
        return new LicenseClass();
    }

    /**
     * Create an instance of {@link LicenseSubClass }
     * 
     */
    public LicenseSubClass createLicenseSubClass() {
        return new LicenseSubClass();
    }

    /**
     * Create an instance of {@link Offences }
     * 
     */
    public Offences createOffences() {
        return new Offences();
    }

    /**
     * Create an instance of {@link Offence }
     * 
     */
    public Offence createOffence() {
        return new Offence();
    }

    /**
     * Create an instance of {@link Plate }
     * 
     */
    public Plate createPlate() {
        return new Plate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficInformation }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rop-gov-om:TrafficInformation", name = "TrafficInformation")
    public JAXBElement<TrafficInformation> createTrafficInformation(TrafficInformation value) {
        return new JAXBElement<TrafficInformation>(_TrafficInformation_QNAME, TrafficInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficInformationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficInformationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rop-gov-om:TrafficInformation", name = "TrafficInformationResponse")
    public JAXBElement<TrafficInformationResponse> createTrafficInformationResponse(TrafficInformationResponse value) {
        return new JAXBElement<TrafficInformationResponse>(_TrafficInformationResponse_QNAME, TrafficInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusLng }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusLng }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Status", scope = Offences.class)
    public JAXBElement<StatusLng> createOffencesStatus(StatusLng value) {
        return new JAXBElement<StatusLng>(_OffencesStatus_QNAME, StatusLng.class, Offences.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusLng }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusLng }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Status", scope = DrivingLicense.class)
    public JAXBElement<StatusLng> createDrivingLicenseStatus(StatusLng value) {
        return new JAXBElement<StatusLng>(_OffencesStatus_QNAME, StatusLng.class, DrivingLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vehicle2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Vehicle2 }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Details", scope = Vehicle.class)
    public JAXBElement<Vehicle2> createVehicleDetails(Vehicle2 value) {
        return new JAXBElement<Vehicle2>(_VehicleDetails_QNAME, Vehicle2 .class, Vehicle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Registration }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Registration", scope = Vehicle.class)
    public JAXBElement<Registration> createVehicleRegistration(Registration value) {
        return new JAXBElement<Registration>(_VehicleRegistration_QNAME, Registration.class, Vehicle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insurance }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Insurance }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Insurance", scope = Vehicle.class)
    public JAXBElement<Insurance> createVehicleInsurance(Insurance value) {
        return new JAXBElement<Insurance>(_VehicleInsurance_QNAME, Insurance.class, Vehicle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Mortgage", scope = Vehicle.class)
    public JAXBElement<Mortgage> createVehicleMortgage(Mortgage value) {
        return new JAXBElement<Mortgage>(_VehicleMortgage_QNAME, Mortgage.class, Vehicle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Owner }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Owner }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Owner", scope = Vehicle.class)
    public JAXBElement<Owner> createVehicleOwner(Owner value) {
        return new JAXBElement<Owner>(_VehicleOwner_QNAME, Owner.class, Vehicle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusLng }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusLng }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Status", scope = Vehicle.class)
    public JAXBElement<StatusLng> createVehicleStatus(StatusLng value) {
        return new JAXBElement<StatusLng>(_OffencesStatus_QNAME, StatusLng.class, Vehicle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DrivingLicense }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DrivingLicense }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "DrivingLicense", scope = TrafficInformationResponse2 .class)
    public JAXBElement<DrivingLicense> createTrafficInformationResponse2DrivingLicense(DrivingLicense value) {
        return new JAXBElement<DrivingLicense>(_TrafficInformationResponse2DrivingLicense_QNAME, DrivingLicense.class, TrafficInformationResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Offences }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Offences }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Offences", scope = TrafficInformationResponse2 .class)
    public JAXBElement<Offences> createTrafficInformationResponse2Offences(Offences value) {
        return new JAXBElement<Offences>(_TrafficInformationResponse2Offences_QNAME, Offences.class, TrafficInformationResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusLng }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusLng }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Status", scope = TrafficInformationResponse2 .class)
    public JAXBElement<StatusLng> createTrafficInformationResponse2Status(StatusLng value) {
        return new JAXBElement<StatusLng>(_OffencesStatus_QNAME, StatusLng.class, TrafficInformationResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "personNumber", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestPersonNumber(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestPersonNumber_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "civilNumber", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestCivilNumber(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestCivilNumber_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "cardExpiryDate", scope = TrafficInformationRequest.class)
    public JAXBElement<XMLGregorianCalendar> createTrafficInformationRequestCardExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrafficInformationRequestCardExpiryDate_QNAME, XMLGregorianCalendar.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "passportNumber", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestPassportNumber(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestPassportNumber_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "passportCountryCode", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestPassportCountryCode(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestPassportCountryCode_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "passportExpiryDate", scope = TrafficInformationRequest.class)
    public JAXBElement<XMLGregorianCalendar> createTrafficInformationRequestPassportExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrafficInformationRequestPassportExpiryDate_QNAME, XMLGregorianCalendar.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "visaNumber", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestVisaNumber(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestVisaNumber_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "drivingLicenseNumber", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestDrivingLicenseNumber(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestDrivingLicenseNumber_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "firstIssueDate", scope = TrafficInformationRequest.class)
    public JAXBElement<XMLGregorianCalendar> createTrafficInformationRequestFirstIssueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrafficInformationRequestFirstIssueDate_QNAME, XMLGregorianCalendar.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "companyRegistrationNumber", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestCompanyRegistrationNumber(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestCompanyRegistrationNumber_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "internalOrganizationNumber", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestInternalOrganizationNumber(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestInternalOrganizationNumber_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "registrationCode", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestRegistrationCode(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestRegistrationCode_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "registrationNumber", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestRegistrationNumber(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestRegistrationNumber_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationRegion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrationRegion }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "registrationRegion", scope = TrafficInformationRequest.class)
    public JAXBElement<RegistrationRegion> createTrafficInformationRequestRegistrationRegion(RegistrationRegion value) {
        return new JAXBElement<RegistrationRegion>(_TrafficInformationRequestRegistrationRegion_QNAME, RegistrationRegion.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "foreignCountryCode", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestForeignCountryCode(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestForeignCountryCode_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "foreignStateCode", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestForeignStateCode(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestForeignStateCode_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "chassisNumber", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestChassisNumber(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestChassisNumber_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "engineNumber", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestEngineNumber(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestEngineNumber_QNAME, String.class, TrafficInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "vehiclePK", scope = TrafficInformationRequest.class)
    public JAXBElement<String> createTrafficInformationRequestVehiclePK(String value) {
        return new JAXBElement<String>(_TrafficInformationRequestVehiclePK_QNAME, String.class, TrafficInformationRequest.class, value);
    }

}
