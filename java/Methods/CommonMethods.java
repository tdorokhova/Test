package Methods;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class CommonMethods {

    public WebDriver driver;
    public String baseUrl;

    private Navigation navigation;

    //
    public CommonMethods() {
        driver = new FirefoxDriver();
        baseUrl = "http://www.imdb.com/chart/top";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    // init navigation
    public Navigation getNavigation() {
        if (navigation == null) {
            navigation = new Navigation(this);
        }
        return navigation;
    }

    public void stop() {
        driver.quit();
    }


}



