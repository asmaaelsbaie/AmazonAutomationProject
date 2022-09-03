package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
    private final WebDriver driver;

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    ////////////////attribute for add to cart
    final By addToCartButton = By.cssSelector("input[name=\"submit.add-to-cart\"]");

    /////////////////Methods For item page
    public CartPage Add_To_cart() {
        driver.findElement(addToCartButton).click();
        return new CartPage(driver);
    }

}
