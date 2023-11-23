<<<<<<< HEAD

package com.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(tags="@MemberPayments", features = "src/test/resources/Features/AccountInformation.feature", glue = "com.stepdefinitions",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty", "html:target/Reports/Cucuber.html", "junit:target/Reports/Cucuber.xml", "json:target/Reports/Cucuber.json"})
//@CucumberOptions(features = "src/test/resources/Features/AccountInformation.feature", glue = "com.stepdefinitions",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty", "html:target/Reports/Cucuber.html", "junit:target/Reports/Cucuber.xml", "json:target/Reports/Cucuber.json"})
@CucumberOptions(features = "src/test/resources/Features", glue = "com.stepdefinitions",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty", "html:target/Reports/Cucuber.html", "junit:target/Reports/Cucuber.xml", "json:target/Reports/Cucuber.json"})
=======
<<<<<<< HEAD
package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/Features/AccountInformation.feature", glue = "com.stepdefinitions",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty", "html:target/Reports/Cucuber.html", "junit:target/Reports/Cucuber.xml", "json:target/Reports/Cucuber.json"})
@CucumberOptions(features = "src/test/resources/Features", glue = "com.stepdefinitions",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/Reports/Cucuber.json"})
>>>>>>> 3001778f8f7b7cb2f4d30d5867dec82be0987e19

public class runnerClass {

}
<<<<<<< HEAD
=======
=======
//
//package com.runner;
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
////@CucumberOptions(features = "src/test/resources/Features/AccountInformation.feature", glue = "com.stepdefinitions",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty", "html:target/Reports/Cucuber.html", "junit:target/Reports/Cucuber.xml", "json:target/Reports/Cucuber.json"})
//@CucumberOptions(features = "src/test/resources/Features", glue = "com.stepdefinitions",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty", "html:target/Reports/Cucuber.html", "junit:target/Reports/Cucuber.xml", "json:target/Reports/Cucuber.json"})
//
//public class runnerClass {
//
//}
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
>>>>>>> 3001778f8f7b7cb2f4d30d5867dec82be0987e19
