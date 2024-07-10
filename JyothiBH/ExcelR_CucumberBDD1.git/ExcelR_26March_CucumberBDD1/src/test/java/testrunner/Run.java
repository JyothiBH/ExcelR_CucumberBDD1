package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Test_Login_Admin.feature",
					glue="stepDefinitions",
					//tags= "@Sc8",
					dryRun=false,
					monochrome=true,
					plugin={"pretty","html:target/Cucumber_Reports/Html_Report_1.html"}
					 )
public class Run {

	
}


