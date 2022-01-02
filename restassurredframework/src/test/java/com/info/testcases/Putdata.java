package com.info.testcases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.info.base.Testbase;
import com.info.utilities.Utildata;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class Putdata extends Testbase{
	String s1=Utildata.namee();
	String s2=Utildata.locationn();
	String s3=Utildata.phonee();
	String s4=Utildata.coursee();
	@BeforeClass
	void postinfo() throws InterruptedException
	{
		RestAssured.baseURI="http://localhost:3000/users";
		httprequest=RestAssured.given();
		JSONObject requestparams=new JSONObject();
		requestparams.put("name",s1);
		requestparams.put("location",s2);
		requestparams.put("phone",s3);
		requestparams.put("courses",s4);
		httprequest.header("content-type","application/JSON");
		httprequest.body(requestparams.toJSONString());
		response=httprequest.request(Method.PUT,"/"+no);
		Thread.sleep(7000);
	}
	@Test
	void checkreposnsebody()
	{
		String responsebody=response.body().asString();
		Assert.assertEquals(responsebody.contains(s1),true);
		Assert.assertEquals(responsebody.contains(s2),true);
		Assert.assertEquals(responsebody.contains(s3),true);
		Assert.assertEquals(responsebody.contains(s4),true);
	}
	@Test
	void checkstatuscode()
	{
		int statuscode=response.getStatusCode();
		System.out.println("staus code is  "+statuscode);
	    Assert.assertEquals(statuscode, 200);
	}
		

}
