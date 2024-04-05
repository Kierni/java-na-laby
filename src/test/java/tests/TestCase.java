package tests;

import base.BaseDriver;
import base.BasePageObject;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;

import java.time.Duration;

public class TestCase extends BaseDriver {

@Test
public void Start(){
    WebDriver driver = getChromeDriver();
    driver.get("https://www.saucedemo.com/");

    LoginPage loginPage = new LoginPage(driver);
    loginPage.login();

    MainPage mainPage = new MainPage(driver);
    mainPage.addThingsToBucketList();

    BucketPage bucketPage = new BucketPage(driver);
    bucketPage.checkoutThingsFromBucket();

    CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(driver);
    checkoutInformationPage.fillPersonalInformation();

    FinalPage finalPage = new FinalPage(driver);
    finalPage.clickOnFinishButton();

}

}
