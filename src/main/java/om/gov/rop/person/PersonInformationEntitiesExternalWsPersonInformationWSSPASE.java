package om.gov.rop.person;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.6.0
 * 2024-09-23T10:16:33.811+04:00
 * Generated source version: 3.6.0
 *
 */
@WebServiceClient(name = "PersonInformation_Entities.External.ws.PersonInformation_WSSP_ASE",
                  wsdlLocation = "classpath:wsdl/application.wsdl",
                  targetNamespace = "urn:rop-gov-om:person")
public class PersonInformationEntitiesExternalWsPersonInformationWSSPASE extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:rop-gov-om:person", "PersonInformation_Entities.External.ws.PersonInformation_WSSP_ASE");
    public final static QName PersonInformationEntitiesExternalWsPersonInformationWSSPASEPort = new QName("urn:rop-gov-om:person", "PersonInformation_Entities_External_ws_PersonInformation_WSSP_ASE_Port");
    static {
        URL url = PersonInformationEntitiesExternalWsPersonInformationWSSPASE.class.getClassLoader().getResource("wsdl/application.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(PersonInformationEntitiesExternalWsPersonInformationWSSPASE.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/application.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PersonInformationEntitiesExternalWsPersonInformationWSSPASE(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PersonInformationEntitiesExternalWsPersonInformationWSSPASE(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonInformationEntitiesExternalWsPersonInformationWSSPASE() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PersonInformationEntitiesExternalWsPersonInformationWSSPASE(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PersonInformationEntitiesExternalWsPersonInformationWSSPASE(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PersonInformationEntitiesExternalWsPersonInformationWSSPASE(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns PersonInformationWSSPASEPortType
     */
    @WebEndpoint(name = "PersonInformation_Entities_External_ws_PersonInformation_WSSP_ASE_Port")
    public PersonInformationWSSPASEPortType getPersonInformationEntitiesExternalWsPersonInformationWSSPASEPort() {
        return super.getPort(PersonInformationEntitiesExternalWsPersonInformationWSSPASEPort, PersonInformationWSSPASEPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonInformationWSSPASEPortType
     */
    @WebEndpoint(name = "PersonInformation_Entities_External_ws_PersonInformation_WSSP_ASE_Port")
    public PersonInformationWSSPASEPortType getPersonInformationEntitiesExternalWsPersonInformationWSSPASEPort(WebServiceFeature... features) {
        return super.getPort(PersonInformationEntitiesExternalWsPersonInformationWSSPASEPort, PersonInformationWSSPASEPortType.class, features);
    }

}
