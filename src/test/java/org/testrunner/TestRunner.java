package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\themu\\eclipse-workspace\\NewCucumber\\src\\test\\resources\\feature",
                                glue = "org.stepdefinition",dryRun = false,strict = true)
public class TestRunner  {

}
