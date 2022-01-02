package com.info.testcases;

import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.info.base.Testbase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class Singlegetuser extends Testbase {
	@BeforeClass
	void getinfodata() throws InterruptedException
	{
		RestAssured.baseURI="http://localhost:3000";
		httprequest=RestAssured.given();
		response=httprequest.request(Method.GET,"/users/"+no);
		Thread.sleep(3);
	}
	@Test
	void checkreposnsebody()
	{
		String responsebody=response.body().asString();
		System.out.println("RESPONSE BODY FROM GET:"+ responsebody);
		//Assert.assertTrue(responsebody!=null);
		Assert.assertEquals(responsebody.contains(no),true);
		
	}
	@Test
	void checkstatuscode()
	{
		int statuscode=response.getStatusCode();
		System.out.println("staus code is  "+statuscode);
	    Assert.assertEquals(statuscode, 200);
	}
    @AfterClass
    void teardown()
    {
    	System.out.println("Completed GET request");
    }
	
}
