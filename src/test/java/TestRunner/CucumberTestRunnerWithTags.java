package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(tags="@smoke and @regression and not @perf" , 
			features = {"src/test/resources/FeatureWithTags"},
			glue= {"StepDefinitions"},
			plugin= {"pretty","html:target/htmlreport.html"},
			dryRun = false,
			monochrome = false)
			public class CucumberTestRunnerWithTags extends AbstractTestNGCucumberTests{



}
