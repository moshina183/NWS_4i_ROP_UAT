
package om.gov.rop.person;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the om.gov.rop.person package. 
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

    private final static QName _PersonInformation_QNAME = new QName("urn:rop-gov-om:person", "PersonInformation");
    private final static QName _PersonInformationResponse_QNAME = new QName("urn:rop-gov-om:person", "PersonInformationResponse");
    private final static QName _PersonRequestCrn_QNAME = new QName("", "crn");
    private final static QName _PersonRequestCardSN_QNAME = new QName("", "cardSN");
    private final static QName _PersonRequestCardExpiryDate_QNAME = new QName("", "cardExpiryDate");
    private final static QName _PersonRequestBirthDate_QNAME = new QName("", "birthDate");
    private final static QName _PersonRequestVisa_QNAME = new QName("", "visa");
    private final static QName _PersonRequestPassportNumber_QNAME = new QName("", "passportNumber");
    private final static QName _PersonRequestPassportIssuedCountry_QNAME = new QName("", "passportIssuedCountry");
    private final static QName _PersonRequestPassportExpiryDate_QNAME = new QName("", "passportExpiryDate");
    private final static QName _PersonRequestCrnOfRequest_QNAME = new QName("", "crnOfRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: om.gov.rop.person
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonInformation }
     * 
     */
    public PersonInformation createPersonInformation() {
        return new PersonInformation();
    }

    /**
     * Create an instance of {@link PersonInformationResponse }
     * 
     */
    public PersonInformationResponse createPersonInformationResponse() {
        return new PersonInformationResponse();
    }

    /**
     * Create an instance of {@link PersonRequest }
     * 
     */
    public PersonRequest createPersonRequest() {
        return new PersonRequest();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link IDCard }
     * 
     */
    public IDCard createIDCard() {
        return new IDCard();
    }

    /**
     * Create an instance of {@link Nationality }
     * 
     */
    public Nationality createNationality() {
        return new Nationality();
    }

    /**
     * Create an instance of {@link Birth }
     * 
     */
    public Birth createBirth() {
        return new Birth();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link CodeDesc }
     * 
     */
    public CodeDesc createCodeDesc() {
        return new CodeDesc();
    }

    /**
     * Create an instance of {@link Town }
     * 
     */
    public Town createTown() {
        return new Town();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link Sponsor }
     * 
     */
    public Sponsor createSponsor() {
        return new Sponsor();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Photo }
     * 
     */
    public Photo createPhoto() {
        return new Photo();
    }

    /**
     * Create an instance of {@link Signature }
     * 
     */
    public Signature createSignature() {
        return new Signature();
    }

    /**
     * Create an instance of {@link Passports }
     * 
     */
    public Passports createPassports() {
        return new Passports();
    }

    /**
     * Create an instance of {@link PassportType }
     * 
     */
    public PassportType createPassportType() {
        return new PassportType();
    }

    /**
     * Create an instance of {@link Country2 }
     * 
     */
    public Country2 createCountry2() {
        return new Country2();
    }

    /**
     * Create an instance of {@link Visa }
     * 
     */
    public Visa createVisa() {
        return new Visa();
    }

    /**
     * Create an instance of {@link Sponsor2 }
     * 
     */
    public Sponsor2 createSponsor2() {
        return new Sponsor2();
    }

    /**
     * Create an instance of {@link SponsorAddress }
     * 
     */
    public SponsorAddress createSponsorAddress() {
        return new SponsorAddress();
    }

    /**
     * Create an instance of {@link Country3 }
     * 
     */
    public Country3 createCountry3() {
        return new Country3();
    }

    /**
     * Create an instance of {@link Death }
     * 
     */
    public Death createDeath() {
        return new Death();
    }

    /**
     * Create an instance of {@link Country4 }
     * 
     */
    public Country4 createCountry4() {
        return new Country4();
    }

    /**
     * Create an instance of {@link Town2 }
     * 
     */
    public Town2 createTown2() {
        return new Town2();
    }

    /**
     * Create an instance of {@link Relations }
     * 
     */
    public Relations createRelations() {
        return new Relations();
    }

    /**
     * Create an instance of {@link RelationType }
     * 
     */
    public RelationType createRelationType() {
        return new RelationType();
    }

    /**
     * Create an instance of {@link Address2 }
     * 
     */
    public Address2 createAddress2() {
        return new Address2();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link Country5 }
     * 
     */
    public Country5 createCountry5() {
        return new Country5();
    }

    /**
     * Create an instance of {@link Biometrics }
     * 
     */
    public Biometrics createBiometrics() {
        return new Biometrics();
    }

    /**
     * Create an instance of {@link Fingerprint }
     * 
     */
    public Fingerprint createFingerprint() {
        return new Fingerprint();
    }

    /**
     * Create an instance of {@link Photo2 }
     * 
     */
    public Photo2 createPhoto2() {
        return new Photo2();
    }

    /**
     * Create an instance of {@link Signature2 }
     * 
     */
    public Signature2 createSignature2() {
        return new Signature2();
    }

    /**
     * Create an instance of {@link Naturalization }
     * 
     */
    public Naturalization createNaturalization() {
        return new Naturalization();
    }

    /**
     * Create an instance of {@link StatusLng }
     * 
     */
    public StatusLng createStatusLng() {
        return new StatusLng();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonInformation }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rop-gov-om:person", name = "PersonInformation")
    public JAXBElement<PersonInformation> createPersonInformation(PersonInformation value) {
        return new JAXBElement<PersonInformation>(_PersonInformation_QNAME, PersonInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInformationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonInformationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rop-gov-om:person", name = "PersonInformationResponse")
    public JAXBElement<PersonInformationResponse> createPersonInformationResponse(PersonInformationResponse value) {
        return new JAXBElement<PersonInformationResponse>(_PersonInformationResponse_QNAME, PersonInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "crn", scope = PersonRequest.class)
    public JAXBElement<BigDecimal> createPersonRequestCrn(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonRequestCrn_QNAME, BigDecimal.class, PersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "cardSN", scope = PersonRequest.class)
    public JAXBElement<String> createPersonRequestCardSN(String value) {
        return new JAXBElement<String>(_PersonRequestCardSN_QNAME, String.class, PersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "cardExpiryDate", scope = PersonRequest.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestCardExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestCardExpiryDate_QNAME, XMLGregorianCalendar.class, PersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "birthDate", scope = PersonRequest.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestBirthDate_QNAME, XMLGregorianCalendar.class, PersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "visa", scope = PersonRequest.class)
    public JAXBElement<BigDecimal> createPersonRequestVisa(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonRequestVisa_QNAME, BigDecimal.class, PersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "passportNumber", scope = PersonRequest.class)
    public JAXBElement<String> createPersonRequestPassportNumber(String value) {
        return new JAXBElement<String>(_PersonRequestPassportNumber_QNAME, String.class, PersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "passportIssuedCountry", scope = PersonRequest.class)
    public JAXBElement<BigDecimal> createPersonRequestPassportIssuedCountry(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonRequestPassportIssuedCountry_QNAME, BigDecimal.class, PersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "passportExpiryDate", scope = PersonRequest.class)
    public JAXBElement<XMLGregorianCalendar> createPersonRequestPassportExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonRequestPassportExpiryDate_QNAME, XMLGregorianCalendar.class, PersonRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "crnOfRequest", scope = PersonRequest.class)
    public JAXBElement<BigDecimal> createPersonRequestCrnOfRequest(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonRequestCrnOfRequest_QNAME, BigDecimal.class, PersonRequest.class, value);
    }

}
