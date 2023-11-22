package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClassPayments {
    // Declare variables for storing data
	public String url, userName, password, user, amount, description;
	
    // Constructor to initialize data by calling the data() method
	public UtilityClassPayments(){
		data();
	}
	
    // Method to read data from the properties file
	public void data() {
		
        // Specify the path of the properties file
		File file = new File("src/test/resources/Cyclos.properties");
		
        // Initialize FileInputStream
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
        // Initialize Properties object
		Properties prop = new Properties();
		
		try {
			
            // Load data from the properties file
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
        // Assign values to variables from the loaded properties
		url = prop.getProperty("url");
		userName = prop.getProperty("userName");
		password = prop.getProperty("password");
		user = prop.getProperty("user");
		amount = prop.getProperty("amount");
		description = prop.getProperty("description");
	}

}
