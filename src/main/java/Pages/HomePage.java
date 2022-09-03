package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    ////////////////Attributes for search page
    final By searchBar = By.id("twotabsearchtextbox");
    final By searchSubmitButton = By.id("nav-search-submit-button");
    //////////////Attributes for Today page
    final By TodayTab = By.partialLinkText("Today's Deals");
    private final WebDriver driver;
    ///////////////ِAttributes for alrert
    By Alert = By.cssSelector("#nav-main > div.nav-left > div");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    /////////////////Methods For send key in search bar
    public SearchPage SendKeyWordToSearchBar(String keyWord) {
        driver.findElement(searchBar).sendKeys(keyWord);
        driver.findElement(searchSubmitButton).click();
        return new SearchPage(driver);
    }

    ////////////////Methods For open Today page from home
    public TodayPage click_Today_tab() {
        driver.findElement(TodayTab).click();
        return new TodayPage(driver);
    }
}
