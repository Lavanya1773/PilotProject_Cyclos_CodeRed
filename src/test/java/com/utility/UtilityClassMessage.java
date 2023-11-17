package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 

public class UtilityClassMessage {
    
	public String url, User,Subject,Description,userName,password;
	
	public UtilityClassMessage(){
		data();
	}
	public void data() {
		File file = new File("C:\\Users\\avelayudhan\\eclipse-workspace\\CodeRed\\PilotProject_Cyclos_CodeRed\\src\\test\\resources\\Cyclos.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		url = prop.getProperty("url");
		User = prop.getProperty("User");
		Subject = prop.getProperty("Subject");
		Description = prop.getProperty("Description");
		userName = prop.getProperty("userName");
		password =prop.getProperty("password");
	}
	
	
	
}
