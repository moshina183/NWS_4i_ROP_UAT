package com.mtcit.rop.services;

import java.io.StringWriter;
import java.math.BigDecimal;
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
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
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


import om.gov.rop.person.ObjectFactory;
import om.gov.rop.person.Person;
import om.gov.rop.person.PersonInformationEntitiesExternalWsPersonInformationWSSPASE;
import om.gov.rop.person.PersonInformationWSSPASEPortType;
import om.gov.rop.person.PersonRequest;
import om.gov.rop.person.Response;
import om.gov.rop.person.StatusLng;

@Component
public class ClientStar {
	
	@Value("${rop-getpersoninformaiton-target-url}")
	private String ropTargetURL;
	
	@Value("${REQUEST-TIMEOUT}")
	private String requestTimeout;
	
	@Value("${CONNECT-TIMEOUT}")
	private String connectTimeout;

	@PostConstruct
	public void init() {
	}

	public String CallROPService(String crn, String cardExpiryDate, String crnOfRequest, TXNAuditLogs auditLogs) {
		System.out.println("Inside CallROPmethod.");
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("Inside CallROPmethod.-1");
			PersonInformationWSSPASEPortType pt = new PersonInformationEntitiesExternalWsPersonInformationWSSPASE()
					.getPersonInformationEntitiesExternalWsPersonInformationWSSPASEPort();
			System.out.println("Inside CallROPmethod.-2");
			Client client = ClientProxy.getClient(pt);
			Endpoint endpoint = client.getEndpoint();
			client.getRequestContext().put(Message.ENDPOINT_ADDRESS,
					ropTargetURL);

			// Map<String, Object> ctx = ((BindingProvider) pt).getRequestContext();
			Map<String, Object> ctx = new HashMap();
			ctx.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_DIGEST);
			ctx.put(WSHandlerConstants.PW_CALLBACK_CLASS, UTPasswordCallback.class.getName());
			//UAT
			ctx.put(WSHandlerConstants.USER, "owwsc.nama.om (device ca - 2)");
			//Prod
			//ctx.put(WSHandlerConstants.USER, "nws.nama.om (device ca - 2)");
			ctx.put(WSHandlerConstants.ALLOW_RSA15_KEY_TRANSPORT_ALGORITHM, "true");
			ctx.put(WSHandlerConstants.ENC_KEY_TRANSPORT, "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
			ctx.put(WSHandlerConstants.ACTION, WSHandlerConstants.TIMESTAMP + " " + WSHandlerConstants.SIGNATURE + " " + WSHandlerConstants.ENCRYPT);
			ctx.put(WSHandlerConstants.TTL_TIMESTAMP, "1000");
			//Prod
			//ctx.put(WSHandlerConstants.USER, "nws.nama.om (device ca - 2)");

			//Prod
//			ctx.put(WSHandlerConstants.SIGNATURE_USER, "nws.nama.om (device ca - 2)");
//			ctx.put(WSHandlerConstants.ENCRYPTION_USER, "eip server message signature (device ca - 2)");

			//UAT
			ctx.put(WSHandlerConstants.SIGNATURE_USER, "owwsc.nama.om (device ca - 2)");
			ctx.put(WSHandlerConstants.ENCRYPTION_USER, "eip stg server message signature (device ca - 2)");
			ctx.put(WSHandlerConstants.SIG_PROP_FILE,
					System.getProperty("SIGN_LOCATION"));
			ctx.put(WSHandlerConstants.ENC_PROP_FILE,
					System.getProperty("ENCRYPT_LOCATION"));
			ctx.put(WSHandlerConstants.DEC_PROP_FILE,
					System.getProperty("DECRYPT_LOCATION"));
			ctx.put(WSHandlerConstants.SIG_VER_PROP_FILE,
					System.getProperty("VERIFY_LOCATION"));

			Map<String, Object> in = new HashMap();// ((BindingProvider) pt).getRequestContext();

			in.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_DIGEST);
			in.put(WSHandlerConstants.PW_CALLBACK_CLASS, UTPasswordCallback.class.getName());
			//UAT
			in.put(WSHandlerConstants.USER, "owwsc.nama.om (device ca - 2)");
			//changes done due to certificate change 11-16-2023
			//Prod
			//in.put(WSHandlerConstants.USER, "nws.nama.om (device ca - 2)");
			
			/*in.put(WSHandlerConstants.ACTION, WSHandlerConstants.TIMESTAMP + " " + WSHandlerConstants.SIGNATURE + " "
					+ WSHandlerConstants.ENCRYPT);*/
			in.put(WSHandlerConstants.ACTION, WSHandlerConstants.TIMESTAMP + " " + WSHandlerConstants.ENCRYPT);

			
			//changes done due to certificate change 11-16-2023
			//Prod
//			in.put(WSHandlerConstants.SIGNATURE_USER, "nws.nama.om (device ca - 2)");
//			in.put(WSHandlerConstants.ENCRYPTION_USER, "eip server message signature (device ca - 2)");
			
			//UAT
			in.put(WSHandlerConstants.SIGNATURE_USER, "owwsc.nama.om (device ca - 2)");
			in.put(WSHandlerConstants.ENCRYPTION_USER, "eip stg server message signature (device ca - 2)");


			in.put(WSHandlerConstants.SIG_PROP_FILE,
					System.getProperty("SIGN_LOCATION"));
			in.put(WSHandlerConstants.ENC_PROP_FILE,
					System.getProperty("ENCRYPT_LOCATION"));
			in.put(WSHandlerConstants.DEC_PROP_FILE,
					System.getProperty("DECRYPT_LOCATION"));
			in.put(WSHandlerConstants.SIG_VER_PROP_FILE,
					System.getProperty("VERIFY_LOCATION"));
			
			
			client.getOutInterceptors().add(new WSS4JOutInterceptor(ctx));
			client.getOutInterceptors().add(new LoggingOutInterceptor());
			client.getInInterceptors().add(new LoggingInInterceptor());
			client.getInInterceptors().add(new WSS4JInInterceptor(in));

			ObjectFactory personfactry = new ObjectFactory();
			PersonRequest personRequest = personfactry.createPersonRequest();
			Date current_date = formatter.parse(cardExpiryDate);

			// current date time in standard format
			System.out.println("Standard Format :- " + current_date);

			XMLGregorianCalendar xmlDate = null;

			// Gregorian Calendar object creation
			GregorianCalendar gc = new GregorianCalendar();

			// giving current date and time to gc
			gc.setTime(current_date);

			try {
				xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gc.get(Calendar.YEAR), gc.get(Calendar.MONTH)+1, gc.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
				personRequest.setCardExpiryDate(personfactry.createPersonRequestCardExpiryDate(xmlDate));
			} catch (Exception e) {
				e.printStackTrace();
			}

			personRequest.setCrn(personfactry.createPersonRequestCrn(new BigDecimal(crn)));
			personRequest.setCrnOfRequest(personfactry.createPersonRequestCrnOfRequest(new BigDecimal(crnOfRequest)));
			
			//for set timeout
			PersonInformationWSSPASEPortType myInterface = new PersonInformationEntitiesExternalWsPersonInformationWSSPASE().getPersonInformationEntitiesExternalWsPersonInformationWSSPASEPort();
			Map<String, Object> requestContext = ((BindingProvider)myInterface).getRequestContext();
			requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, requestTimeout); // Timeout in millis
			requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, connectTimeout); // Timeout in millis

			//auditLogs.setTargetRequestTime(new Timestamp(System.currentTimeMillis()));
			System.out.println("personRequest: "+personRequest);
			Response response = pt.personInformation(personRequest);
			System.out.println("response: "+response);
			//auditLogs.setTargetResponseTime(new Timestamp(System.currentTimeMillis()));
			
			if(response.getPerson()!=null) {
				JAXBContext jc = JAXBContext.newInstance(Person.class);
				StringWriter sw = new StringWriter();
				JAXB.marshal(response.getPerson(), sw);
				String xmlString = sw.toString();
				System.out.println(xmlString);
				auditLogs.setTargetResponseMsg(xmlString);
				auditLogs.setResponseMsg(xmlString);
				return xmlString;
				
			}else {
				JAXBContext jc = JAXBContext.newInstance(StatusLng.class);
				StringWriter sw = new StringWriter();
				JAXB.marshal(response.getStatus(), sw);
				String xmlString = sw.toString();
				System.out.println(xmlString);
				return xmlString;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
