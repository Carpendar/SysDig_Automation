package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage<pageTitle> extends PageBase{

    public LoginPage(WebDriver driver) {
        super.driver = driver;
        super.pageTitle = this.pageTitle;
        super.pageUrl = this.pageUrl;
        PageFactory.initElements(driver, this);
    }
    public String pageUrl = "https://app.sysdigcloud.com/#/login";
    public String pageTitle = "Sysdig Monitor";

    //Locating the email address text box
    @FindBy(xpath = "//input[@data-test=\"login-username\"]")
    WebElement usernameTxtBx;

    //Locating password text box
    @FindBy(xpath = "//input[@data-test=\"login-password\"]")
    WebElement passwordTxtBx;

    //Locating forgot password link
    @FindBy(xpath = "//a[@data-test=\"link-forgot-password\"]")
    WebElement forgotPasswordLink;

    //Locating Login Button
    @FindBy(xpath = "//*[@data-id=\"submit-login\"]")
    WebElement loginBtn;



    public boolean IsDisplayedUsernameTextBox(){
        return usernameTxtBx.isDisplayed();
    }

    public boolean IsDisplayedPasswordTextBox(){
        return  passwordTxtBx.isDisplayed();
    }

    public boolean IsDisplayedForgotPasswordLink() {
        return forgotPasswordLink.isDisplayed();
    }

    public boolean IsLoginButtonDisplayed() {
        return loginBtn.isDisplayed();
    }

}
