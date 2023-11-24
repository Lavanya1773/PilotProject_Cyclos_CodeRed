package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="C:\\Users\\avelayudhan\\eclipse-workspace\\CodeRed\\PilotProject_Cyclos_CodeRed\\src\\test\\resources\\Features\\message.feature",
glue="com.stepdefinitions",plugin = "json:target/cucumber-report.json")

public class Testrunner_DemoCyclos extends AbstractTestNGCucumberTests{

}
