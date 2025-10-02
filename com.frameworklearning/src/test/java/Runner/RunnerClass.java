package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefiles/Datatable2.feature", glue = "StepDefinitions")
public class RunnerClass {

}
