package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target//default-cucumber-reports"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "",
        dryRun = true
)
public class Runner {
}
