package com.homeoffice.utility;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile/",
        glue = "com/homeoffice",
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
                "json:target/RunCuke/cucumber.json"}
)
public class TestRunner {

}
