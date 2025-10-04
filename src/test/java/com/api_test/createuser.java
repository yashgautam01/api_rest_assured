package com.api_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.basesetup;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class createuser extends basesetup{
	
	@Test
	public void usercreated() {
		basesetup bs = new basesetup();
		String user =bs.createuser("uyas","asas");
		
		
		Response res = RestAssured.given()
				.header("content-type","Application/json")
				.body(user)
				.given()
				.post("/users")
				.then()
				.log()
				.all()
				.extract()
				.response();
		
		System.out.println(res.statusCode());
		if(res.statusCode() == 201) {
			System.out.println("assert pass");
			}
	    Assert.assertEquals(res.statusCode(), 201);
		
		
		
		
		
		
		
		
		
	}

}
