package com.datadriventesting;

import java.io.FileInputStream;
import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ReadJsonfile {
	
	public static Object[][] readfile(String filepath){
		Object[][] data = null;
		try {
			InputStream is = new FileInputStream(filepath);
			JSONArray arr = new JSONArray(new JSONTokener(is));
			data =new Object[arr.length()][2];
			for(int i = 0;i<arr.length();i++) {
				JSONObject obj = arr.getJSONObject(i);
				data[i][0] = obj.getString("name");
				data[i][1] = obj.getString("country");
				
			}
			}
			catch(Exception e) {
				System.out.println(e);
		}
		
		
		
		return data;
		
	}

}
