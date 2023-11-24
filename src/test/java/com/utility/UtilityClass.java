package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	public String url,strName,strLoginName,strEmail,strPassword,strConfirmPassword,strSigninPassword,strSigninName;
	public UtilityClass(){
		data();
	}
	public void data() {
		File file = new File("C:\\Users\\alakshmanan\\eclipse-workspace\\CodeRed\\PilotProject_Cyclos_CodeRed\\src\\test\\resources\\Cyclos.properties");
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
		strSigninName =  property.getProperty("SigninName");
		strSigninPassword =  property.getProperty("SigninPassword");
	}
 
}
