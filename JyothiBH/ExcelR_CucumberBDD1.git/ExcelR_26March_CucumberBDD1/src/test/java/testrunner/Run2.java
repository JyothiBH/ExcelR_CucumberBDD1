package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Test_Case11to26_all.feature",
							glue="stepDefinitions",
					tags= "@Sc20 or @Sc21 or @Sc23 or @Sc25andSc26",
							dryRun=false,
							monochrome=true,
							plugin={"pretty","html:target/Cucumber_Reports/Html_Report_3.html"}
						   )
public class Run2 {


}
