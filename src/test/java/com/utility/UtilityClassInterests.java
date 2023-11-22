package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClassInterests {
public String url, userName, password, nameInput, nameInput2;
	
	public UtilityClassInterests(){
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
		nameInput = prop.getProperty("nameInput");
		
	}
}
