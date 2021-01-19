package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFile"},tags= {"@scenariowithDatable"},
glue= {"StepDefination"},
plugin =
{"com.cucumber.listener.ExtentCucumberFormatter:Reports/report2.html","pretty",
"html:target/cucumber-reports2"},monochrome = true)
public class TestRuner {

}
