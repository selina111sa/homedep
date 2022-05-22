package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "", features = { "Features/" }, 
glue = { "stepDefs" }, 
plugin = { "pretty",
		"html:target/cucumber-html-reports.html"

		}

)
public class HomeDepotTestRunner extends AbstractTestNGCucumberTests{

}
