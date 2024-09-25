package com.mtcit.rop.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.callback.Callback;

import org.apache.wss4j.common.ext.WSPasswordCallback;

/**
 */

public class UTPasswordCallback implements CallbackHandler {

	private Map<String, String> passwords = new HashMap<String, String>();

	public UTPasswordCallback() {
		//for UAT
		passwords.put("owwsc.nama.om (device ca - 2)", "oman@123");
		passwords.put("eip stg server message signature (device ca - 2)", "oman@123");
		//for PROD
//		passwords.put("nws.nama.om (device ca - 2)", "owwsc@123");
//		passwords.put("eip server message signature (device ca - 2)", "owwsc@123");
	}

	/**
	 * Here, we attempt to get the passwod from the private alias/passwords map.
	 */
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
			pc.setPassword("oman@123");
			String pass = passwords.get(pc.getIdentifier());
			if (pass != null) {
				pc.setPassword(pass);
				return;
			}
		}
	}

	/**
	 * Add an alias/password pair to the callback mechanism.
	 */
	public void setAliasPassword(String alias, String password) {
		passwords.put(alias, password);
	}
}
