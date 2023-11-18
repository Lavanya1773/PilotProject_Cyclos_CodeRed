package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(features = "C:\\Users\\alakshmanan\\eclipse-workspace\\CodeRed\\PilotProject_Cyclos_CodeRed\\src\\test\\resources\\Features\\LoginPage.feature", glue = "com.stepdefinitions")
=======
<<<<<<< HEAD
@CucumberOptions(features = "src/test/resources/Features/MarketPlace.feature", glue = "com.stepdefinitions")

=======
@CucumberOptions(features = "src/test/resources/Features/AccountInformation.feature", glue = "com.stepdefinitions",plugin = {"pretty", "html:target/Reports/Cucuber.html", "junit:target/Reports/Cucuber.xml", "json:target/Reports/Cucuber.json"})
>>>>>>> 64e57b4f21701f8f9b67612d1f8675b26cba41e4
>>>>>>> c2a702c9ff4845730e8bf50e0ba0845d2cfd1ed5

public class runnerClass {

}
