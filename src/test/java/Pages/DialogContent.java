package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() {

            PageFactory.initElements(GWD.getDriver(),this);
        }



    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginBottun;

    @FindBy(xpath="//span[@class='nav-link-title']")
    public WebElement txtTechnoStudyDashboard;

    @FindBy(xpath="//ms-add-button[@class='ng-star-inserted']//button")
    public WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath="//ms-save-button//button")
    public WebElement saveButton;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;
}
