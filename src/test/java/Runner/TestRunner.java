package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Login1.feature", glue= {"StepDefinitions"},
 tags= {"@smoke"},strict=true,dryRun=false, monochrome=true,
 plugin = {"de.monochromata.cucumber.report.PrettyReports:target/cucumber"})
public class TestRunner {

}
