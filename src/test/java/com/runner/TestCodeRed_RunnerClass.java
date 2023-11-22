package com.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="C:\\Users\\alakshmanan\\eclipse-workspace\\CodeRed\\PilotProject_Cyclos_CodeRed\\src\\test\\resources\\Features",
glue="com.stepdefinitions",plugin = "json:target/cucumber-report.json")
public class TestCodeRed_RunnerClass extends AbstractTestNGCucumberTests{
 
}