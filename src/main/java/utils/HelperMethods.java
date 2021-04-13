package utils;

import base.BasePage;
import base.PageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static base.BasePage.driver;

public class HelperMethods  {

    public static void doClick(WebElement element) {
        try {
            waitForClickability(element);
            element.click();
        } catch (Exception e) {
            System.out.println("Some exception occurred while clicking at " + element);
        }
    }
    public static String doGetText(WebElement element) {
        try {
            return element.getText();
        } catch (Exception e) {
            System.out.println("Some exception occured while getting the text " + element);
            return null;
        }
    }
    public static void waitForClickability(WebElement element) {
        getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }
    public static WebDriverWait getWaitObject() {

        return new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
    }
    public static void sendText(By locator, String text) {
        try {
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        } catch (Exception e) {
            System.out.println("Some exception occurred while sending keys at");
        }
    }
}
