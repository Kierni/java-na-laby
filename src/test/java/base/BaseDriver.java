package base;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseDriver {
    public static WebDriver getChromeDriver(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiern\\OneDrive\\Pulpit\\untitled\\.idea\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(options);
    }
}
