package Methods;

import org.openqa.selenium.*;


public abstract class BaseSelector {

    protected WebDriver driver;
    protected CommonMethods methods;
    public boolean acceptNextAlert = true;

    public BaseSelector(CommonMethods methods) {

        this.methods = methods;
        this.driver = methods.driver;
    };

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    public boolean isElementPresent(By by) {
        try {
            methods.driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            methods.driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = methods.driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

}
