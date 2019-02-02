package pages;

import org.openqa.selenium.WebElement;

public class MainPageSberbank extends BasePage {

    // формат локатор для нажатия кнопки в топ меня по названию
    private final String topMenuList = "//li//span[text()='%s']";

    // форма локатор для нажатия кнопки подменю основных кнопок топ меню
    private final String itemSubMenuTopMenuButton = "//ul[@class=\"lg-menu__list\"]//li/a[text()='%s']";

    public void clickTopMenuListItem(String itemName){
        String xpath = String.format(topMenuList, itemName);
        WebElement itemTopMenu = getWebElement(xpath);
        scrollAndClickElement(itemTopMenu);
    }

    public void clickSubMenuTopMenu(String subItemName){
        String xpath = String.format(itemSubMenuTopMenuButton, subItemName);
        WebElement subItemMenu = getWebElement(xpath);
        scrollAndClickElement(subItemMenu);
    }
}
