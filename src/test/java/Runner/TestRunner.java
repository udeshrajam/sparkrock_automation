package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
glue = {"steps_definitions"},
monochrome = true,
plugin = {"pretty", "junit:target/JunitReports.xml", "json:target/JSONReport", "html:target/Reports/HTMLReport.html"})
public class TestRunner {
}
