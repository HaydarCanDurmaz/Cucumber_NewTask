package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends Parent {
    public DialogContent() {

        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginBottun;

    @FindBy(xpath = "//span[@class='nav-link-title']")
    public WebElement txtTechnoStudyDashboard;

    @FindBy(xpath = "//ms-add-button[@class='ng-star-inserted']//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath="//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath="//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;

    @FindBy(xpath="//mat-slide-toggle[@formcontrolname='active']")
    private WebElement toggleBar;


    public WebElement getWebElement(String addButtonn){

        switch (addButtonn)
        {
            case "addButton" : return addButton;
            case "saveButton" : return saveButton;
            case "nameInput" : return nameInput;
            case "codeInput" : return codeInput;
            case "deleteButton" : return deleteButton;
            case "deleteDialogBtn" : return deleteDialogBtn;
            case "integrationCode" : return integrationCode;
            case "priorityCode" : return priorityCode;
            case "toggleBar" : return toggleBar;



        }
        return null;
    }

    public void deleteItem(String searchText) {
        sendKeysFunction(searchInput, searchText);
        clickFunction(searchButton);

//fuse-progress-bar/*   gözüküyor
        //beklet
        //1. StaleElemetn hatası verdi : erken buldum tez kaybettim
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        //fuse-progress-bar/*    bu 0 olana kadar beklet
       // wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunction(deleteButton);
        clickFunction(deleteDialogBtn);

    }



}
