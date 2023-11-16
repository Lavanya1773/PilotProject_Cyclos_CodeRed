package com.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import com.utility.HelperClass;

import io.cucumber.java.After;

public class HookClass {
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
		
	}
	@After
	public static void tearDown(Scenario scenario) {
//		HelperClass.tearDown();
	}

}
