package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(stepNotifications = true,features="src/test/java/com",glue={"com.seleniumgluecode"},plugin = {"pretty", "html:target/html-report/cucumber-html-reports.html"})


public class TestRunner {

}
