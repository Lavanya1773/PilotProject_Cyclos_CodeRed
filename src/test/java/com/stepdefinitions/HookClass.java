package com.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
<<<<<<< HEAD
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
=======

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

>>>>>>> 79295322b35231b02dba261e87cddb486b85e350
import com.utility.HelperClass;
import io.cucumber.java.After;

public class HookClass {
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
		
	}
	@After
	public static void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		
		HelperClass.tearDown();
	}

}
