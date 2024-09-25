package com.mtcit.rop.controllers;

import java.io.StringReader;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.mtcit.rop.esb.IConstants;
import com.mtcit.rop.model.TXNAuditLogs;
import com.mtcit.rop.services.ClientStar;
import com.mtcit.rop.services.ClientTrafficInformation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("api/v1")
public class ControllerVer1 {
	
	private static final Logger logger = LoggerFactory.getLogger(ControllerVer1.class);

	
	@Autowired
	private ClientStar clientStar;
	
	@Autowired
	private ClientTrafficInformation clienttrafficinformation;
	
	//External Services
	
	@GetMapping("/test")
	public String display() {
		String trustStorePathNew = System.getProperty("javax.net.ssl.trustStore");
        String trustStorePasswordNew = System.getProperty("javax.net.ssl.trustStorePassword");
        System.out.println("---------- Trust Store Path New---- : " + trustStorePathNew);
        System.out.println("---------- Trust Store Password New ----: " + trustStorePasswordNew);
        

		/*System.setProperty("SIGN_LOCATION", "C:/Users/prasanth.s/Documents/workspaceDIAMTestTwoServices/NWS-ROPservices/config/sign.properties");
		System.setProperty("ENCRYPT_LOCATION", "C:/Users/prasanth.s/Documents/workspaceDIAMTestTwoServices/NWS-ROPservices/config/encrypt.properties");
		System.setProperty("DECRYPT_LOCATION", "C:/Users/prasanth.s/Documents/workspaceDIAMTestTwoServices/NWS-ROPservices/config/decrypt.properties");
		System.setProperty("VERIFY_LOCATION", "C:/Users/prasanth.s/Documents/workspaceDIAMTestTwoServices/NWS-ROPservices/config/verify.properties");
*/
        System.out.println("-SIGN_LOCATION:- : " + System.getProperty("SIGN_LOCATION"));
		System.out.println("-ENCRYPT_LOCATION:- : " + System.getProperty("ENCRYPT_LOCATION"));
		System.out.println("-DECRYPT_LOCATION:- : " + System.getProperty("DECRYPT_LOCATION"));
		System.out.println("-VERIFY_LOCATION:- : " + System.getProperty("VERIFY_LOCATION"));
		return "test success";

	}
	
		@PostMapping(value = "/getpersoninformation", produces = "application/xml")
		public ResponseEntity<String> getPersonInformation(HttpServletRequest request, HttpServletResponse response) {
			TXNAuditLogs auditLogs = (TXNAuditLogs) request.getAttribute(IConstants.CURRENT_AUDIT);
			//TXNAuditLogs auditLogs = new TXNAuditLogs();
			ResponseEntity<String> responseEntity = null;
			try {
			String xml = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = null;
			
			builder = factory.newDocumentBuilder();

			Document doc = builder.parse(new InputSource(new StringReader(xml)));
			String crn = doc.getElementsByTagName("crn").item(0).getTextContent();
			String cardExpiryDate = doc.getElementsByTagName("cardExpiryDate").item(0).getTextContent();
			String crnOfRequest = doc.getElementsByTagName("crnOfRequest").item(0).getTextContent();
			System.out.println("------------------------------------------------------");
			System.out.println(crn + "\n" + cardExpiryDate + "\n" + crnOfRequest);
			try {

				System.out.println("-----------------------XML Body------------------------------- :: "+xml);
				
				return new ResponseEntity<String>(clientStar.CallROPService(crn,cardExpiryDate,crnOfRequest,auditLogs), HttpStatus.OK);
				
				
				
				} catch (HttpStatusCodeException e) {
					logger.error("Exception while processing ",e);
					
					e.printStackTrace();
					auditLogs.setTargetResponseMsg(e.getResponseBodyAsString());
					System.out.println("In exception  " + e.getResponseBodyAsString());
					auditLogs.setResponseMsg(e.getResponseBodyAsString());
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			
			return responseEntity;
			
		}
		
		
		@PostMapping(value = "/gettrafficinformaton", produces = "application/xml")
		public ResponseEntity<String> getTrafficInformaton(HttpServletRequest request, HttpServletResponse response) {
			TXNAuditLogs auditLogs = (TXNAuditLogs) request.getAttribute(IConstants.CURRENT_AUDIT);
			ResponseEntity<String> responseEntity = null;
			try {
				//String xml = new String(request.getReader().lines().collect(Collectors.joining(System.lineSeparator())).getBytes(),"UTF-8");
				String xml = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
				
				try {
					//gettrafficinformaton auditing 
					//auditLogs.setRequestMsg(xml);
					
					return new ResponseEntity<String>(clienttrafficinformation.callTrafficInformation(xml,auditLogs), HttpStatus.OK);
					
					} catch (HttpStatusCodeException e) {
						logger.error("Exception while processing ",e);
						e.printStackTrace();
						auditLogs.setTargetResponseMsg(e.getResponseBodyAsString());
						System.out.println("In exception  " + e.getResponseBodyAsString());
						auditLogs.setResponseMsg(e.getResponseBodyAsString());
					}
			}catch (Exception e) {
				// TODO: handle exception
			}

			
			return responseEntity;
			
		}


}
