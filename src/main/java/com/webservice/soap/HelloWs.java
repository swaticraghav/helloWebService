package com.webservice.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;

@WebService
// @Features(features = "org.apache.cxf.ext.logging.LoggingFeature")
public class HelloWs {

	@WebMethod
	public String hello() {
		return "Hello World!";
	}
	
	@WebMethod
	public String hola() {
		return "Hola World!";
	}
}
