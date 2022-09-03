package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    ///////////Attribute for cart
    final By SucessMsg = By.cssSelector("span[class=\"a-size-medium-plus a-color-base sw-atc-text a-text-bold\"]");

    /////////////////Methods For cart page
    public String Check_item_added_successful() {
        String massage = driver.findElement(SucessMsg).getText();
        return massage;

    }

}
