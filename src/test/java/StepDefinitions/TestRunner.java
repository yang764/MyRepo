package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = {"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "junit:target/JUnitReports/report.xml", "json:target/JSONReports/reports.json", "html:target/HtmlReports/index.html"},
        tags = "@smoke")
public class TestRunner {
}
