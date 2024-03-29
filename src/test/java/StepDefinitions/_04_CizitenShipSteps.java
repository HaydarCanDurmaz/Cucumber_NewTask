package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CizitenShipSteps {
    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();

    @And("Navigate to CitizenShip page")
    public void navigateToCitizenShipPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.cizitenship);
    }

    @When("User a CitizenShip name as {} short name as {}")
    public void userACitizenShipNameAsShortNameAs(String name, String shortName) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput, name);
        dc.sendKeysFunction(dc.shortName, shortName);
        dc.clickFunction(dc.saveButton);
    }


    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExist, "already");
    }


    @When("User delete the{string}")
    public void userDeleteThe(String searcText) {
        dc.deleteItem(searcText);
    }
}
