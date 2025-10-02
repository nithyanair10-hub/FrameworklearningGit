package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefiles/Datatable2.feature", glue = "StepDefinitions",
plugin = {
        "pretty",
        "html:target/cucumber-reports.html"
    })
public class RunnerClass {

}
