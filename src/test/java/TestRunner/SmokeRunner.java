package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Features",
        glue = "StepDefinitions",
        dryRun =false,
        tags = "@testcase2",
        plugin = {"pretty","html:target/Cucumber.html","json:target/Cucumber.json","rerun:target/failed.txt"})





//@CucumberOptions(features ="src\\test\\resources\\Features",glue = "StepDefinitions",dryRun = false,
 // tags="@testcase1 or @testcase2" or @smoke)


public class SmokeRunner {
}


// tags option will execute the tagged testcase as mentioned in your runner class
//have to use OR if want to execute more than 1 case