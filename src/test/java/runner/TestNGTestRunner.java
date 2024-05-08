package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepdefinitions","base"},
        monochrome = true,
        tags = "@MonitorItem")
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
}
