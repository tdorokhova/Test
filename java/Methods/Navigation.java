package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class Navigation extends BaseSelector {

    public Navigation(CommonMethods methods) {
        super(methods);
    }

    // open main page depends on type
    public void openMainPage(String type) {

        if (type == "Western") {
            driver.get(methods.baseUrl);
            click(By.xpath("//span/ul/li/a[contains(text(), 'estern')]"));
        }
        else {
            driver.get(methods.baseUrl);
        }
    }

    // sort depends on type
    public void sortByRank(String rankName, String suffix, String type) {

        if (type == "Western") {
            click(By.linkText(rankName));
        }
        else {
            click(By.name("sort"));
            new Select(driver.findElement(By.name("sort"))).selectByVisibleText(rankName); //choosing value
            click(By.cssSelector("option[value=" + suffix + "]"));
        }
    }

    // search depends on type
    public boolean findMovie(String rankName, String type) {

        if (type == "Western") {
            if (driver.findElements(By.xpath("//table[@class=\"results\"]/tbody/tr/td[@class=\"title\"]/div[@class=\"user_rating\"]")).size() > 0) {
                System.out.println("Sort type " + rankName + ": object is found");
                return true;
            }
            else {
                System.out.println("Sort type " + rankName + ": object not found");
                return false;
            }
        }
        else {
            if (driver.findElements(By.xpath("//table[@data-caller-name=\"chart-top250movie\"]/tbody/tr/td/strong[text()[\"based on\"]]")).size() > 0) {
                System.out.println("Sort type " + rankName + ": object is found");
                return true;
            }
            else {
                System.out.println("Sort type " + rankName + ": object not found");
                return false;
            }
        }
    }

    // checks
    public void checkSort(String rankName, String suffix, String type) {
        methods.getNavigation().sortByRank(rankName, suffix, type);
        findMovie(rankName, type);
    }

}
