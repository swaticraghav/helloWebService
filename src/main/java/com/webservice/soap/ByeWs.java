package com.webservice.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ByeWs {

	@WebMethod
	public String byeWorld() {
		return "Bye World forever!";
	}
}
