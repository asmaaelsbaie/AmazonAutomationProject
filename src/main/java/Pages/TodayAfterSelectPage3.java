package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodayAfterSelectPage3 {
    //////////Attributes for page 3 after selection
    By page4 = By.cssSelector("ul[class=\"a-pagination\"]>li:nth-child(5)");
    private WebDriver driver;

    public TodayAfterSelectPage3(WebDriver driver) {
        this.driver = driver;
    }

    /////////////////Methods For open page 3
    public TodayAfterSelectPage4 go_to_page4() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(page4).click();
        return new TodayAfterSelectPage4(driver);
    }
}
