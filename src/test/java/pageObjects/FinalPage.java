package pageObjects;

import base.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FinalPage extends BasePageObject {
    @FindBy(xpath = "//*[@id='finish']")
    WebElement finishButton;
    public FinalPage(WebDriver driver){
        super(driver);
    }
    public void clickOnFinishButton(){
    wait.until(ExpectedConditions.visibilityOf(finishButton));
    finishButton.click();

    }
}
