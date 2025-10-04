package com.api_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.basesetup;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class putuser {
	
	@Test
	public void updateuser() {
		String str = basesetup.updateuser("yash1", "indian");
		Response res  = RestAssured.given().header("Content-Type","Application/json")
				.body(str).when().put("/users/9741").then().extract().response();
		
		// Assert.assertEquals(res.getStatusCode(), 200);
	       // Assert.assertTrue(res.asString().contains("updatedAt"));
		System.out.println("Status Code update : " + res.getStatusCode());

		
				
	}

}
