package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Features",
        glue = "StepDefinitions",
        dryRun =false,
        tags = "@dataTable",
        plugin = {"pretty"})





//@CucumberOptions(features ="src\\test\\resources\\Features",glue = "StepDefinitions",dryRun = false,
 // tags="@testcase1 or @testcase2" or @smoke)


public class SmokeRunner {
}


// tags option will execute the tagged testcase as mentioned in your runner class
//have to use OR if want to execute more than 1 case