package pageObjects;

import base.BaseDriver;
import base.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePageObject{
    public MainPage(WebDriver driver){super(driver);}
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    WebElement backpack;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement shirt;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-onesie']")
    WebElement onesie;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bike-light']")
    WebElement bikeLight;
    public void addThingsToBucketList(){
        wait.until((ExpectedConditions.visibilityOf(backpack)));
        backpack.click();
        shirt.click();
        onesie.click();
        bikeLight.click();

    }
}
