package com.webservice.soap.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webservice.soap.ByeWs;

@Configuration
public class WebServiceConfigTwo {

	@Autowired
	private Bus bus;

	@Bean
	public Endpoint endPointTwo() {
		
		Endpoint endPoint = new EndpointImpl(bus, new ByeWs());
		endPoint.publish("/byeWs");
		
		return endPoint;
	}
}
