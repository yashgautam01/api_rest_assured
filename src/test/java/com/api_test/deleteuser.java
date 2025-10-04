package com.api_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class deleteuser {
	@Test
	public void delete() {
		Response res = RestAssured.given()
				.when().delete("http://localhost:3000/users/1fd6").
				then().extract().response();
		//Assert.assertEquals(res.getStatusCode(), 204);
		 System.out.println("Status Code:  delete " + res.getStatusCode());

	}

}
