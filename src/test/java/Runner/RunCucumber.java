package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features/FindNewCar.feature",glue= {"StepDefinations"},plugin= {"html:target/cucumber-reports/cucumber-html-report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},dryRun=false)
public class RunCucumber extends AbstractTestNGCucumberTests {

	
	
}
