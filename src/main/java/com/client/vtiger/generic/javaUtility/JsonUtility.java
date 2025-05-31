package com.client.vtiger.generic.javaUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtility {
	
	public String getDataFromJsonFile(String key) throws Throwable {
		
		FileReader fileR = new FileReader("./configAppData/appCommonData.json");
		
		JSONParser parser = new JSONParser();
		
		Object obj = parser.parse(fileR);
		
		//downcasting (JSONObject)
		JSONObject map = (JSONObject) obj;
		
		String data = (String)map.get(key);
		
		return data;
		
		
		// to write data back to json we can create one more method
		
		
	}

}
