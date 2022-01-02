package com.info.base;

import org.apache.log4j.PropertyConfigurator;

import com.sun.istack.logging.Logger;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Testbase {
	public static RequestSpecification httprequest;
	public static Response response;
	public String uid="dkdjd";
	public String no="1";
	public Logger logger;

}
