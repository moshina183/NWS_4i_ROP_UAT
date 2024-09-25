package com.mtcit.rop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NwsRoPservicesApplication {

	public static void main(String[] args) {
		System.setProperty("javax.net.ssl.trustStore", "D:\\diamwallet\\keystore.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		String trustStorePathNew = System.getProperty("javax.net.ssl.trustStore");
        String trustStorePasswordNew = System.getProperty("javax.net.ssl.trustStorePassword");
        System.out.println("---------- Trust Store Path New---- : " + trustStorePathNew);
        System.out.println("---------- Trust Store Password New ----: " + trustStorePasswordNew);
        

		System.setProperty("SIGN_LOCATION", "D:/Moshina/NWS-ROPservices/config/sign.properties");
		System.setProperty("ENCRYPT_LOCATION", "D:/Moshina/NWS-ROPservices/config/encrypt.properties");
		System.setProperty("DECRYPT_LOCATION", "D:/Moshina/NWS-ROPservices/config/decrypt.properties");
		System.setProperty("VERIFY_LOCATION", "D:/Moshina/NWS-ROPservices/config/verify.properties");

        System.out.println("-SIGN_LOCATION:- : " + System.getProperty("SIGN_LOCATION"));
		System.out.println("-ENCRYPT_LOCATION:- : " + System.getProperty("ENCRYPT_LOCATION"));
		System.out.println("-DECRYPT_LOCATION:- : " + System.getProperty("DECRYPT_LOCATION"));
		System.out.println("-VERIFY_LOCATION:- : " + System.getProperty("VERIFY_LOCATION"));
		SpringApplication.run(NwsRoPservicesApplication.class, args);
	}

}
