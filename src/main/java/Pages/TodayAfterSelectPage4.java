package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class TodayAfterSelectPage4 {
    private WebDriver driver;

    public TodayAfterSelectPage4(WebDriver driver) {
        this.driver = driver;
    }

    //////////////Randmize item
    Random rand = new Random(); //instance of random class
    int upperbound = 60; //////// numbers of product per page
    //generate random values from 0-60
    int randomItem = rand.nextInt(upperbound);

    ///////////attributes for page 4 after selection
    By anyItem=By.cssSelector("div[class=\"Grid-module__gridDisplayGrid_2X7cDTY7pjoTwwvSRQbt9Y\"]>div:nth-child("+randomItem+")");

    /////////////////Methods For open page4
    public ItemPage select_item_from_page4(){
        driver.findElement(anyItem).click();
        System.out.println(randomItem);
        return new ItemPage(driver);
    }
}
