package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
		String pathConfig="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_17_Framework\\Config\\config.Properties";
		
		FileInputStream file=new FileInputStream(pathConfig);
		
		pro=new Properties();
		pro.load(file);
		
	}
	
	public String getBaseUrl_QA1() {
		
		return pro.getProperty("BaseUrl_QA1");
	}
	
	
}
