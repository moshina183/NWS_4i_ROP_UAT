
package com.mtcit.rop.services;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import com.mtcit.rop.model.TXNAuditLogs;
import com.mtcit.rop.core.UTPasswordCallback;
import com.sun.xml.ws.client.BindingProviderProperties;
import javax.annotation.PostConstruct;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.ws.BindingProvider;
import java.sql.Timestamp;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


import om.gov.rop.trafficinformation.ObjectFactory;
import om.gov.rop.trafficinformation.RegistrationRegion;
import om.gov.rop.trafficinformation.TrafficInformationASEPortType;
import om.gov.rop.trafficinformation.TrafficInformationEntitiesWsProviderTrafficInformationASE;
import om.gov.rop.trafficinformation.TrafficInformationRequest;
import om.gov.rop.trafficinformation.TrafficInformationResponse2;

@Component
public class ClientTrafficInformation {

	@Value("${rop-gettrafficinformaiton-target-url}")
	private String ropTargetURL;
	
	@Value("${REQUEST-TIMEOUT}")
	private String requestTimeout;
	
	@Value("${CONNECT-TIMEOUT}")
	private String connectTimeout;

	@PostConstruct
	public void init() {
	}

	public String callTrafficInformation(String xml, TXNAuditLogs auditLogs) {
		System.out.println("Inside callTrafficInformation.");
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String dateInput = "2013-09-10";
			TrafficInformationASEPortType pt = new TrafficInformationEntitiesWsProviderTrafficInformationASE()
					.getTrafficInformationEntitiesWsProviderTrafficInformationASEPort();
			Client client = ClientProxy.getClient(pt);
			Endpoint endpoint = client.getEndpoint();
			client.getRequestContext().put(Message.ENDPOINT_ADDRESS, ropTargetURL);

			String xmlString = new String(xml.getBytes(), "UTF-8");

			Map<String, Object> ctx = new HashMap();
			ctx.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_DIGEST);
			ctx.put(WSHandlerConstants.PW_CALLBACK_CLASS, UTPasswordCallback.class.getName());
			// UAT
			ctx.put(WSHandlerConstants.USER, "owwsc.nama.om (device ca - 2)");
			// Prod
			//ctx.put(WSHandlerConstants.USER, "nws.nama.om (device ca - 2)");
			ctx.put(WSHandlerConstants.ALLOW_RSA15_KEY_TRANSPORT_ALGORITHM, true);
			ctx.put(WSHandlerConstants.ENC_KEY_TRANSPORT, "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
			ctx.put(WSHandlerConstants.ACTION, WSHandlerConstants.TIMESTAMP + " " + WSHandlerConstants.SIGNATURE + " "
					+ WSHandlerConstants.ENCRYPT);
			ctx.put(WSHandlerConstants.TTL_TIMESTAMP, "1000");
			ctx.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_DIGEST);
			ctx.put(WSHandlerConstants.PW_CALLBACK_CLASS, UTPasswordCallback.class.getName());
			//UAT
			ctx.put(WSHandlerConstants.USER, "owwsc.nama.om (device ca - 2)");
			//Prod
			//ctx.put(WSHandlerConstants.USER, "nws.nama.om (device ca - 2)");

			//UAT
			ctx.put(WSHandlerConstants.SIGNATURE_USER, "owwsc.nama.om (device ca - 2)");
			ctx.put(WSHandlerConstants.ENCRYPTION_USER, "eip stg server message signature (device ca - 2)");

			//Prod
//			ctx.put(WSHandlerConstants.SIGNATURE_USER, "nws.nama.om (device ca - 2)");
//			ctx.put(WSHandlerConstants.ENCRYPTION_USER, "eip server message signature (device ca - 2)");

			ctx.put(WSHandlerConstants.SIG_PROP_FILE, System.getProperty("SIGN_LOCATION"));
			ctx.put(WSHandlerConstants.ENC_PROP_FILE, System.getProperty("ENCRYPT_LOCATION"));
			ctx.put(WSHandlerConstants.DEC_PROP_FILE, System.getProperty("DECRYPT_LOCATION"));
			ctx.put(WSHandlerConstants.SIG_VER_PROP_FILE, System.getProperty("VERIFY_LOCATION"));
			Map<String, Object> in = new HashMap();// ((BindingProvider)

			in.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_DIGEST);
			in.put(WSHandlerConstants.PW_CALLBACK_CLASS, UTPasswordCallback.class.getName());
			//UAT
			in.put(WSHandlerConstants.USER, "owwsc.nama.om (device ca - 2)");
			//Prod
			//in.put(WSHandlerConstants.USER, "nws.nama.om (device ca - 2)");
			in.put(WSHandlerConstants.ACTION, WSHandlerConstants.TIMESTAMP + " " + WSHandlerConstants.SIGNATURE + " "
					+ WSHandlerConstants.ENCRYPT);

			//UAT
			in.put(WSHandlerConstants.SIGNATURE_USER, "owwsc.nama.om (device ca - 2)");
			in.put(WSHandlerConstants.ENCRYPTION_USER, "eip stg server message signature (device ca - 2)");

			//Prod
//			in.put(WSHandlerConstants.SIGNATURE_USER, "nws.nama.om (device ca - 2)");
//			in.put(WSHandlerConstants.ENCRYPTION_USER, "eip server message signature (device ca - 2)");
			
			in.put(WSHandlerConstants.SIG_PROP_FILE, System.getProperty("SIGN_LOCATION"));
			in.put(WSHandlerConstants.ENC_PROP_FILE, System.getProperty("ENCRYPT_LOCATION"));
			in.put(WSHandlerConstants.DEC_PROP_FILE, System.getProperty("DECRYPT_LOCATION"));
			in.put(WSHandlerConstants.SIG_VER_PROP_FILE, System.getProperty("VERIFY_LOCATION"));
			client.getOutInterceptors().add(new WSS4JOutInterceptor(ctx));
			client.getOutInterceptors().add(new LoggingOutInterceptor());
			client.getInInterceptors().add(new LoggingInInterceptor());
			client.getInInterceptors().add(new WSS4JInInterceptor(in));

			ObjectFactory trafficInformationFactory = new ObjectFactory();
			TrafficInformationRequest trafficInformation = trafficInformationFactory.createTrafficInformationRequest();
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = null;

			builder = factory.newDocumentBuilder();

			Document doc = builder.parse(new InputSource(new StringReader(xmlString)));

			/*
			 * JAXBContext jaxb = JAXBContext.newInstance(TrafficInformationRequest.class);
			 * Marshaller m = jaxb.createMarshaller();
			 * m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-6" );
			 */

			if (doc.getElementsByTagName("personNumber").item(0) != null) {
				trafficInformation
						.setPersonNumber(trafficInformationFactory.createTrafficInformationRequestPersonNumber(
								doc.getElementsByTagName("personNumber").item(0).getTextContent()));
			}
			if (doc.getElementsByTagName("civilNumber").item(0) != null) {
				trafficInformation.setCivilNumber(trafficInformationFactory.createTrafficInformationRequestCivilNumber(
						doc.getElementsByTagName("civilNumber").item(0).getTextContent()));
			}
			if (doc.getElementsByTagName("cardExpiryDate").item(0) != null) {
				String inputDate = doc.getElementsByTagName("cardExpiryDate").item(0).getTextContent();
				Date cardExpiryDate = formatter.parse(inputDate);
				// current date time in standard format
				System.out.println("Standard Format :- " + cardExpiryDate);

				XMLGregorianCalendar xmlDate = null;

				// Gregorian Calendar object creation
				GregorianCalendar gc = new GregorianCalendar();

				// giving current date and time to gc
				gc.setTime(cardExpiryDate);

				try {
					xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gc.get(Calendar.YEAR),
							gc.get(Calendar.MONTH) + 1, gc.get(Calendar.DAY_OF_MONTH),
							DatatypeConstants.FIELD_UNDEFINED);
					trafficInformation.setCardExpiryDate(
							trafficInformationFactory.createTrafficInformationRequestCardExpiryDate(xmlDate));
				} catch (Exception e) {
					e.printStackTrace();
				}

				/*
				 * trafficInformation.setCardExpiryDate(trafficInformationFactory.
				 * createTrafficInformationRequestCardExpiryDate(doc.getElementsByTagName(
				 * "cardExpiryDates").item(0).getTextContent()));
				 */
			}
			if (doc.getElementsByTagName("passportNumber").item(0) != null) {
				trafficInformation
						.setPassportNumber(trafficInformationFactory.createTrafficInformationRequestPassportNumber(
								doc.getElementsByTagName("passportNumber").item(0).getTextContent()));
			}
			if (doc.getElementsByTagName("passportCountryCode").item(0) != null) {
				trafficInformation.setPassportCountryCode(
						trafficInformationFactory.createTrafficInformationRequestPassportCountryCode(
								doc.getElementsByTagName("passportCountryCode").item(0).getTextContent()));
			}
//			if (doc.getElementsByTagName("passportExpiryDate").item(0) != null) {
//				trafficInformation.setPassportExpiryDate(trafficInformationFactory.
//						createTrafficInformationRequestPassportExpiryDate(doc.getElementsByTagName("passportExpiryDate").item(0).getTextContent()));
//			}
			if (doc.getElementsByTagName("visaNumber").item(0) != null) {
				trafficInformation.setVisaNumber(trafficInformationFactory.createTrafficInformationRequestVisaNumber(
						doc.getElementsByTagName("visaNumber").item(0).getTextContent()));
			}
			if (doc.getElementsByTagName("drivingLicenseNumber").item(0) != null) {
				trafficInformation.setDrivingLicenseNumber(
						trafficInformationFactory.createTrafficInformationRequestDrivingLicenseNumber(
								doc.getElementsByTagName("drivingLicenseNumber").item(0).getTextContent()));
			}
//			if (doc.getElementsByTagName("firstIssueDate").item(0) != null) {
//				trafficInformation.setFirstIssueDate(trafficInformationFactory.
//						createTrafficInformationRequestFirstIssueDate(doc.getElementsByTagName("firstIssueDate").item(0).getTextContent()));
//			}
			if (doc.getElementsByTagName("companyRegistrationNumber").item(0) != null) {
				trafficInformation.setCompanyRegistrationNumber(
						trafficInformationFactory.createTrafficInformationRequestCompanyRegistrationNumber(
								doc.getElementsByTagName("companyRegistrationNumber").item(0).getTextContent()));
			}
			if (doc.getElementsByTagName("internalOrganizationNumber").item(0) != null) {
				trafficInformation.setInternalOrganizationNumber(
						trafficInformationFactory.createTrafficInformationRequestInternalOrganizationNumber(
								doc.getElementsByTagName("internalOrganizationNumber").item(0).getTextContent()));
			}
			if (doc.getElementsByTagName("registrationCode").item(0) != null) {
				DocumentBuilderFactory docfactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docbuilder = docfactory.newDocumentBuilder();

				// Parse the XML string into a Document object
				Document document = docbuilder.parse(new InputSource(new StringReader(xml)));
				// Get the root element
				Element root = document.getDocumentElement();

				// Get the text content of the Arabic element
				NodeList nodeList = root.getElementsByTagName("registrationCode");
				if (nodeList.getLength() > 0) {
					Node node = nodeList.item(0);
					String arabicText = node.getNodeValue();
					System.out.println("Arabic Text: " + arabicText);
				}
				trafficInformation.setRegistrationCode(
						trafficInformationFactory.createTrafficInformationRequestRegistrationCode(new String(
								doc.getElementsByTagName("registrationCode").item(0).getTextContent().getBytes(),
								"UTF-8")));
			}
			if (doc.getElementsByTagName("registrationNumber").item(0) != null) {
				trafficInformation.setRegistrationNumber(
						trafficInformationFactory.createTrafficInformationRequestRegistrationNumber(
								doc.getElementsByTagName("registrationNumber").item(0).getTextContent()));
			}
			if (doc.getElementsByTagName("registrationRegion").item(0) != null) {
				trafficInformation.setRegistrationRegion(
						trafficInformationFactory.createTrafficInformationRequestRegistrationRegion(RegistrationRegion
								.fromValue(doc.getElementsByTagName("registrationRegion").item(0).getTextContent())));
			}
			if (doc.getElementsByTagName("foreignCountryCode").item(0) != null) {
				trafficInformation.setForeignCountryCode(
						trafficInformationFactory.createTrafficInformationRequestForeignCountryCode(
								doc.getElementsByTagName("foreignCountryCode").item(0).getTextContent()));
			}
			if (doc.getElementsByTagName("foreignStateCode").item(0) != null) {
				trafficInformation
						.setForeignStateCode(trafficInformationFactory.createTrafficInformationRequestForeignStateCode(
								doc.getElementsByTagName("foreignStateCode").item(0).getTextContent()));
			}
			if (doc.getElementsByTagName("chassisNumber").item(0) != null) {
				trafficInformation
						.setChassisNumber(trafficInformationFactory.createTrafficInformationRequestChassisNumber(
								doc.getElementsByTagName("chassisNumber").item(0).getTextContent()));
			}
			if (doc.getElementsByTagName("engineNumber").item(0) != null) {
				trafficInformation
						.setEngineNumber(trafficInformationFactory.createTrafficInformationRequestEngineNumber(
								doc.getElementsByTagName("engineNumber").item(0).getTextContent()));
			}
			if (doc.getElementsByTagName("vehiclePK").item(0) != null) {
				trafficInformation.setVehiclePK(trafficInformationFactory.createTrafficInformationRequestVehiclePK(
						doc.getElementsByTagName("vehiclePK").item(0).getTextContent()));
			}
			if (doc.getElementsByTagName("requesterId").item(0) != null) {
				trafficInformation.setRequesterId(doc.getElementsByTagName("requesterId").item(0).getTextContent());
			}

			//for set timeout
			TrafficInformationASEPortType myInterface = new TrafficInformationEntitiesWsProviderTrafficInformationASE().getTrafficInformationEntitiesWsProviderTrafficInformationASEPort();
			Map<String, Object> requestContext = ((BindingProvider)myInterface).getRequestContext();
			requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, requestTimeout); // Timeout in millis
			requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, connectTimeout); // Timeout in millis

			//auditLogs.setTargetRequestTime(new Timestamp(System.currentTimeMillis()));
			
			TrafficInformationResponse2 response = pt.trafficInformation(trafficInformation);
			
			//auditLogs.setTargetResponseTime(new Timestamp(System.currentTimeMillis()));
			
			JAXBContext jc = JAXBContext.newInstance(TrafficInformationResponse2.class);
			StringWriter sw = new StringWriter();
			JAXB.marshal(response, sw);
			String xmlString1 = sw.toString();
			System.out.println(xmlString1);
			return xmlString1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}