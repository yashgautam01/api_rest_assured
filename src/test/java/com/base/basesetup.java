package com.base;

import org.json.JSONObject;
import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class basesetup {
	@BeforeClass
	public void setup() {
		RestAssured.baseURI = "http://localhost:3000/";
	}
	
	public static String createuser(String name, String job) {
		
		JSONObject  obj = new JSONObject();
		obj.put("name", name);
		obj.put("country",job);
		return obj.toString();
	}
public static String updateuser(String name, String job) {
		
		JSONObject  obj = new JSONObject();
		obj.put("name", name);
		obj.put("country",job);
		return obj.toString();
	}
}
