package StepDefinition;

import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Hook {
    static HomePage homePage;
    static WebDriver driver = null;

    @Before
    public static void user_open_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // Change resolution to 1024x768
       HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
       browserstackOptions.put("resolution", "1024x768");

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @After
    public static void user_close_the_driver() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }
}
