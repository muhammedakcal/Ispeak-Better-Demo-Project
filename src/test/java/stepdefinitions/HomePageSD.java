package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static base.BasePage.driver;

public class HomePageSD {

    WebDriver driver;
    By seeCoursesBtn = By.xpath("//*[@id=\"about-section\"]/div/div/div[1]/a");
    By signUp = By.xpath("//*[@id=\"btnFree\"]");

    @Given("User is on the ISpeakBetter HomePage")
    public void verifyTheHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://ispeakbetter.com");
    }
    //Scenario #1
    @When("User clicks to Try for Free")
    public void userClicksToTryForFree() {
        new WebDriverWait(driver, 20).
                until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//*[@id=\"btnFree\"]"))).click();


    }

    @Then("Sign in window pops up")
    public void signInWindowPopsUp() {

        driver.findElement(By.xpath("//*[@id=\"btnFree\"]")).isEnabled();
        driver.quit();
    }


    //Scenario #2
    @When("User clicks on 'See our courses button")
    public void userClicksOnSeeOurCoursesButton() {
        new WebDriverWait(driver, 20).
                until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//*[@id=\"about-section\"]/div/div/div[1]/a"))).click();

    }

    @Then("User is on the Courses Provided page")
    public void userIsOnTheCoursesProvidedPage() {
        String expectedUrl = "https://ispeakbetter.com/courses";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        driver.quit();
    }

    //Scenario 3
    @When("User clicks on LearnMore")
    public void userClicksOnLearnMore() {
        new WebDriverWait(driver, 20).
                until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//a[@data-text='Learn more']"))).click();

    }

    @Then("User is on the LearnMore page")
    public void userIsOnTheLearMorePage() throws InterruptedException {
        String expectedUrl = "https://ispeakbetter.com/about";
        Thread.sleep(3000);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        driver.quit();
    }

    //Scenario 4
    @When("User selects duration for {int} min")
    public void userSelectsDurationForMin(int arg0) {
        By duration = By.xpath("//span[@class='select2 select2-container select2-container--default select2-container--below select2-container--open']//span[@class='dropdown-wrapper']");
        List<WebElement> options = driver.findElements(duration);

        System.out.println(options.size());

        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).getText().equals("30")) {
                options.get(i).click();
            }
        }
    }

    @Then("User sees it on the duration selection box")
    public void userSeesItOnTheDurationSelectionBox() {
        String expectedText = "30";
        String actualText = driver.findElement(By.xpath("//*[@id=\"select2-class_duration-container\"]")).getText();
        Assert.assertEquals(expectedText, actualText);
        driver.quit();
    }

    //Scenario 5
    @When("User selects program for Business English")
    public void userSelectsProgramForTOEFL() {
        By program = By.xpath("//span[@class='select2 select2-container select2-container--default select2-container--below']//span[@class='dropdown-wrapper']");
        List<WebElement> options1 = driver.findElements(program);

        System.out.println(options1.size());

        for (int i = 0; i < options1.size(); i++) {
            if (options1.get(i).getText().equals("Business English")) {
                options1.get(i).click();
            }
        }
    }

    @Then("User sees it on the program selection box")
    public void userSeesItOnTheProgramSelectionBox() {
        String expectedText = "Business English";
        String actualText = driver.findElement(By.xpath("//span[@id='select2-course_program-container']")).getText();
        Assert.assertEquals(expectedText, actualText);
        driver.quit();
    }
}

