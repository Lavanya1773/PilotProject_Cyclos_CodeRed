package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features/AccountInformation.feature",
//	"src/test/resources/Features/MarketPlace.feature"
	glue = "com.stepdefinitions",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty", "html:target/Reports/Cucuber.html", "junit:target/Reports/Cucuber.xml", "json:target/Reports/Cucuber.json"})

public class runnerClass {

}
