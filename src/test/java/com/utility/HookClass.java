package com.utility;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;

public class HookClass {
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
		
	}
	@After
	public static void tearDown(Scenario scenario) {
		HelperClass.tearDown();
	}

}
