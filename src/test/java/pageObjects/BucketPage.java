package pageObjects;

import base.BaseDriver;
import base.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BucketPage extends BasePageObject {
    @FindBy(xpath = "//*[@id='shopping_cart_container']/a")
    WebElement bucketImage;
    @FindBy(xpath = "//*[@id='checkout']")
    WebElement checkoutButton;
    public BucketPage(WebDriver driver){
        super(driver);
    }
    public void checkoutThingsFromBucket(){
    bucketImage.click();
    wait.until(ExpectedConditions.visibilityOf(checkoutButton));
    checkoutButton.click();
    }
}
