package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\alakshmanan\\eclipse-workspace\\CodeRed\\PilotProject_Cyclos_CodeRed\\src\\test\\resources\\Features\\LoginPage.feature", glue = "com.stepdefinitions")

public class runnerClass {

}
