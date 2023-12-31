package MyTestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"StepDefinitions", "AppHooks"},
        plugin = {"pretty"
        }

)
public class TestRunner {
}
