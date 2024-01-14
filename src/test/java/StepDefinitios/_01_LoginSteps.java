package StepDefinitios;

import Pages.DialogContent;

import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {

        GWD.getDriver().get("https://test.mersys.io/");

    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        //  WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        //  wait.until(ExpectedConditions.elementToBeClickable(dc.username));
        //  dc.username.sendKeys("turkeyts");
        //  dc.password.sendKeys("TechnoStudy123");
        //  dc.loginBottun.click();
        dc.sendKeysFunction(dc.username, "turkeyts");
        dc.sendKeysFunction(dc.password, "TechnoStudy123");
        dc.clickFunction(dc.loginBottun);
    }

    @Then("User should login succesfully")
    public void userShouldLoginSuccesfully() {

        System.out.println("Loading...");
          // dc.verifyContainsTextFunction(dc.txtTechnoStudyDashboard,"Dashboard ");
        }

}
