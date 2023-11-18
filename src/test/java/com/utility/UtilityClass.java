package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	public String url,strName,strLoginName,strEmail,strPassword,strConfirmPassword;
	public UtilityClass(){
		data();
	}
	public void data() {
		File file = new File("C:\\CodeRed_Cyclos\\Cyclos\\src\\test\\resources\\Features\\Register.properties");
		FileInputStream fileinput =null;
		try {
			fileinput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties property = new Properties();
		try {
			property.load(fileinput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		url = property.getProperty("url");
		strName = property.getProperty("Name");
		strLoginName = property.getProperty("LoginName");
		strEmail = property.getProperty("Email");
		strPassword = property.getProperty("Password");
		strConfirmPassword = property.getProperty("ConfirmPassword");
	}
 
}
