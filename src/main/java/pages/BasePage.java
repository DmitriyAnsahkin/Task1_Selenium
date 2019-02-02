package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import other.Init;

public abstract class BasePage {

    WebDriver driver;

    public BasePage() {
        this.driver = Init.getDriver();
    }

    public WebElement getWebElement(String xpath) {
        return new WebDriverWait(driver, 10).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public void scrollTo(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void scrollAndClickElement(WebElement element){
        scrollTo(element);
        element.click();
    }
}
