package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedCondition.*;

public class WaitHelper {
    public WebDriver driver;
    public WaitHelper(WebDriver driver){
        this.driver = driver;
    }

    //Wait till the element is visible on the page
    public void WaitForElement(WebElement element,long timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
