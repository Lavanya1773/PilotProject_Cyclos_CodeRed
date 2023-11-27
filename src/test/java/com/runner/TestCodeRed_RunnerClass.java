package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/resources/Features",
glue="com.stepdefinitions",plugin = "json:target/cucumber-report.json")
public class TestCodeRed_RunnerClass extends AbstractTestNGCucumberTests{
 
}
