package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {

    //////////////Attribute for Search List product
    final By items = By.cssSelector(" div[class =\"s-main-slot s-result-list s-search-results sg-row\"]>div");
    private final WebDriver driver;
    private List<WebElement> itemsList;
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    /////////////////Methods For search

    public void list_of_Items() {
        itemsList = driver.findElements(items);
    }

    public ItemPage click_item(int index) {

        list_of_Items();
        itemsList.get(index + 2).click(); ////we add 2 to index as first item appear in result are in div 2
        return new ItemPage(driver);
    }

}
