package pageObjects;

import base.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutInformationPage extends BasePageObject {
    @FindBy(xpath = "//*[@id='first-name']")
    WebElement firstNameField;
    @FindBy(xpath = "//*[@id='last-name']")
    WebElement lastNameField;
    @FindBy(xpath = "//*[@id='postal-code']")
    WebElement zipField;
    @FindBy(xpath = "//*[@id='continue']")
    WebElement countinueButton;
    public CheckoutInformationPage(WebDriver driver){
        super(driver);
    }
    public void fillPersonalInformation(){
    wait.until(ExpectedConditions.visibilityOf(firstNameField));
    firstNameField.sendKeys("Jan");
    lastNameField.sendKeys("Kowalski");
    zipField.sendKeys("12345");
    countinueButton.click();

    }
}
