package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:src/test/java/features",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-html-report.html"},
        monochrome = true
)
public class TestRunner {
}
