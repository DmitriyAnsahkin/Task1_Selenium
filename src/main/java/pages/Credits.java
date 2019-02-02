package pages;

import org.openqa.selenium.WebElement;

public class Credits extends BasePage {
    private String header = "//h2";

    public void click_header(){
        WebElement element = getWebElement(header);
        scrollAndClickElement(element);
    }

}
