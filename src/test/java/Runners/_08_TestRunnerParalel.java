package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitios"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _08_TestRunnerParalel extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browserTipi")
    public void beforeClass(String browserName)
    {
        GWD.threadBrowserName.set(browserName);

    }
}
