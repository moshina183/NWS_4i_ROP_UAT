package com.mtcit.rop.controllers;

import java.sql.Timestamp;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.mtcit.rop.esb.IConstants;
import com.mtcit.rop.model.TXNAuditLogs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@RestController
@RequestMapping("api/v2")
public class ControllerVer2 {
	
	private static final Logger logger = LoggerFactory.getLogger(ControllerVer2.class);
	
	
	@Value("${getpersoninformation-target-url}")
	private String getPersonInformationURL;
	
	@Value("${getpersoninformation-soap-action}")
	private String GetPersonInformationSoapAction;
	
	//External Services
	
	@GetMapping("/test")
	public String display() {
		return "testing...";
		
	}
	@PostMapping(value = "/getpersoninformation" , produces = "application/xml")
	public ResponseEntity<String> getPersonInformation(HttpServletRequest request,HttpServletResponse resopnse){
		TXNAuditLogs auditLogs=(TXNAuditLogs) request.getAttribute(IConstants.CURRENT_AUDIT);
		ResponseEntity<String> responseEntity=null;
		String responseMsg = null;
		try {
			String xml=request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
			HttpHeaders header=createHeaders();
			header.set("SOAPAction", GetPersonInformationSoapAction);
			header.set("Content-Type", "text/xml;charset=UTF-8");
			
			RestTemplate restTemplate = getRestTemplate();
			HttpEntity mrReadingEntity = new HttpEntity(xml, header);
			
			/*auditLogs.setTargetRequestTime(new Timestamp(System.currentTimeMillis()));
			auditLogs.setRequestMsg(xml);
			auditLogs.setTargetRequesMsg(xml);*/
			try {
				
				responseEntity=restTemplate.exchange(getPersonInformationURL, HttpMethod.POST,
						mrReadingEntity,String.class);
				/*auditLogs.setTargetResponseTime(new Timestamp(System.currentTimeMillis()));
				auditLogs.setTargetResponseMsg(responseEntity.getBody());*/
				responseMsg = String.format(IConstants.ESB_XML_SUCCESS_RESPONSE_V2, responseEntity.getBody());
				responseMsg = responseMsg.replaceAll("(<\\?xml.*?\\?>)","");
				responseMsg = responseMsg.replaceAll("(?m)^[ \\t]*\\r?\\n", "");
				/*auditLogs.setResponseMsg(responseMsg);
				auditLogs.setTargetResponseCode(responseEntity.getStatusCode().toString());	*/
				
			}catch(HttpStatusCodeException e) {
				e.printStackTrace();
				//auditLogs.setTargetResponseMsg(e.getResponseBodyAsString());
				System.out.println("In exception  "+ e.getResponseBodyAsString());
				//auditLogs.setResponseMsg(e.getResponseBodyAsString());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return new ResponseEntity<String>(responseMsg, HttpStatus.OK);
		
	}


	//Object creation methods
	protected RestTemplate getRestTemplate() {
		if (logger.isInfoEnabled())
			logger.info("Entered::AbstractEmailDelivery::getRestTemplate()");
		RestTemplate restTemplate = new RestTemplate(
				new BufferingClientHttpRequestFactory(getClientHttpRequestFactory()));
		return restTemplate;
	}

	private SimpleClientHttpRequestFactory getClientHttpRequestFactory() {
		SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
		return clientHttpRequestFactory;
	}

	public HttpHeaders createHeaders() {
		return new HttpHeaders();

	}
	
}
