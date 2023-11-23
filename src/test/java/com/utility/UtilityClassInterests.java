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
<<<<<<< HEAD
		File file = new File("src/test/resources/Cyclos.properties");
=======
<<<<<<< HEAD
		File file = new File("src/test/resources/Cyclos.properties");
=======
		File file = new File("C:\\Users\\nselvam2\\eclipse-workspace\\CodeRed\\PilotProject_Cyclos_CodeRed\\src\\test\\resources\\Cyclos.properties");
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
>>>>>>> 3001778f8f7b7cb2f4d30d5867dec82be0987e19
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
