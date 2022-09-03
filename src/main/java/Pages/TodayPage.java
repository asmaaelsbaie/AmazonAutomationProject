package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodayPage {
    private final WebDriver driver;

    public TodayPage(WebDriver driver) {
        this.driver = driver;
    }

    //////////////////////Attributes  for Today page
    By headphoneCheck = By.cssSelector("ul[class=\"a-nostyle\"]:nth-child(3) >li:nth-child(21) ");
    By groceryCheck = By.cssSelector("ul[class=\"a-nostyle\"]:nth-child(3) >li:nth-child(19) ");
    By discount10 = By.cssSelector("span:nth-child(6) > span > ul > li:nth-child(2)");
    By page3button = By.cssSelector("#slot-15 > div > div > div.GridContainer-module__gridFooter_VLpWMDEvOFj3taV1CiY8J > div > ul > li:nth-child(4)");


    /////////////////Methods For open Today page
    public void Select_headphone_grocery_checkBox() {
        driver.findElement(headphoneCheck).click();
        driver.findElement(groceryCheck).click();

    }

    public void Select_10_off_more() {
        driver.findElement(discount10).click();
    }

    public TodayAfterSelectPage3 go_to_3_page() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(page3button).click();
        return new TodayAfterSelectPage3(driver);
    }
}
