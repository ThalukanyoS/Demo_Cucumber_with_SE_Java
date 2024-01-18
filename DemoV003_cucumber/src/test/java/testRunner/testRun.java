package testRunner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features=".//Features/Login.feature",
                glue="stepDefinitions",
                dryRun =  false, //if this is true, it will show unimplemented methods only
                monochrome=true,// Remove unneccesary characters on my windows
                plugin = {"pretty", "html:test-output"}//for reporting
        )
public class testRun {
}
