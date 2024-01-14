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
}
