package com.api_test;


import static io.restassured.RestAssured.baseURI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class getapi {

	
	@Test
	public void getuser() {
		baseURI= "https://reqres.in/";
		
		Response res = RestAssured
				.given()
				.when()
				.get("api/users?page=2")
				.then()
				.statusCode(200)
				.log().all()
				.extract().response();
			
		Assert.assertEquals(res.getStatusCode() , 200,":::::status code is 200 :::::");
		
		String name = res.jsonPath().getString("data.name[1]");
		System.out.println(name);
		Assert.assertEquals(name, "chili pepper", ":::::name matched:::::");
		
		long time  =  res.getTime();
		Assert.assertTrue(time<2000,":::::api took longer than expected:::::");
		
		Assert.assertNotNull(res.jsonPath().get("data.id"),"::::user id in not null::::");
		
		
		
		
	}
	
	
}
