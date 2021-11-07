package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = "src/test/java/features", 
                 glue = "steps", 
                 monochrome = true,
                 publish = true,
                 tags = "@Leads" //run all the smoke testcases only
                // tags = "not @regression" //run all the testcases except regression
                // tags = "@functional or @regression" // run all the functional and regression testcases
                // tags = "@functional and @regression"  // run the scenarios having both @functional and @regression
		)
public class CucumberRunner extends BaseClass {

}
