package steps;

import pages.MainPageSberbank;

public class MainPageSberbankSteps {
    private MainPageSberbank mainPageSberbank = new MainPageSberbank();

    // клик по кнопке в топ меню
    public void clickTopMenuItem(String itemName){
        mainPageSberbank.clickTopMenuListItem(itemName);
    }

    // клик по кнопке в топ меню и переход в подраздел
    public void chooseSubItemTopMenu(String itemName, String subItemName){
        mainPageSberbank.clickTopMenuListItem(itemName);
        mainPageSberbank.clickSubMenuTopMenu(subItemName);
    }

    // клик по кнопке в топ меню и переход в подраздел
    public void chooseSubItemTopMenu(String subItemName){
        mainPageSberbank.clickSubMenuTopMenu(subItemName);
    }
}
