package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(features = "src/test/resources/Features/MarketPlace.feature", glue = "com.stepdefinitions")

=======
@CucumberOptions(features = "src/test/resources/Features/AccountInformation.feature", glue = "com.stepdefinitions",plugin = {"pretty", "html:target/Reports/Cucuber.html", "junit:target/Reports/Cucuber.xml", "json:target/Reports/Cucuber.json"})
>>>>>>> 64e57b4f21701f8f9b67612d1f8675b26cba41e4

public class runnerClass {

}
