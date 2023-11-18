package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClassPayments {
public String url, userName, password, user, amount, description;
	
	public UtilityClassPayments(){
		data();
	}
	
	public void data() {
		File file = new File("src/test/resources/Cyclos.properties");
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
		userName = prop.getProperty("userName");
		password = prop.getProperty("password");
		user = prop.getProperty("user");
		amount = prop.getProperty("amount");
		description = prop.getProperty("description");
	}

}
