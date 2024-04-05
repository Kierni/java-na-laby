package pageObjects;

import base.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageObject {
    public LoginPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//*[@id='user-name']")
    WebElement usernameField;
    @FindBy(xpath = "//*[@id='password']")
    WebElement passwordField;
    @FindBy(xpath = "//*[@id='login-button']")
    WebElement loginButton;
    public void login(){
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
    }
}
