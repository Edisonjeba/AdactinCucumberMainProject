package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
	
	public ConfigurationReader() throws Throwable{
		File f = new File("C:\\Users\\edison\\eclipse-workspace\\AdactinCucumberMainProject\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");
		
		FileInputStream fs = new FileInputStream(f);
		
		Properties p = new Properties();
		p.load(fs);
		
	}
	
	public String getBrowser() {
		String  browser = p.getProperty(getBrowser());
		return browser;
		
	}
	public String getUrl() {
		String url = p.getProperty(getUrl());
		return url;
		
		
	}
	
	

}
