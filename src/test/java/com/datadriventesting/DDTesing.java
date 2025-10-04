package com.datadriventesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.basesetup;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DDTesing extends basesetup {
	
	@DataProvider(name="userdata")
	public Object[][] getuserdata(){
		return ReadJsonfile.readfile("C:\\Users\\yash\\eclipse-workspace\\API_Framework\\src\\test\\resources\\data.json");
	}
	@Test(dataProvider="userdata")
	public void createusers(String name,String job) {
		String resbody = null;
		try {
			resbody = basesetup.createuser(name,job);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Response res = RestAssured.given().header("Content-Type","Application/json")
				.body(resbody)
				.when()
				.post("/users").then().log().all().extract().response();
		
		
	}

}
