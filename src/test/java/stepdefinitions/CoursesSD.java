package stepdefinitions;

import base.BasePage;
import base.PageManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CoursesPage;

import static base.BasePage.driver;

public class CoursesSD {
   @Given("User goes to main page")
    public void goToMainPage() {
       BasePage.initializeDriver();
   }
   @When("User clicks to course page")
   public void clickToCoursePage(){
      CoursesPage.clickToCoursesBtn();
   }
   @Then("User sees the course page")
   public void verifyCoursePage(){
      String Url= "https://ispeakbetter.com/courses";
      String actualUrl=driver.getCurrentUrl();
      Assert.assertEquals(Url, actualUrl);
      CoursesPage.quit();
   }
   @And("User clicks to first Enrolment Links")
   public void clickToFirstEnrolmentBtn(){
      CoursesPage.clickToFirstEnrolmentBtn();
   }
   @And("User clicks to second Enrolment Links")
   public void clickToSecondEnrolmentBtn(){
      CoursesPage.clickToSecondEnrolmentBtn();
   }
   @And("User clicks to third Enrolment Links")
   public void clickToThirdEnrolmentBtn(){
      CoursesPage.clickToThirdEnrolmentBtn();
   }
   @And("User clicks to fourth Enrolment Links")
   public void clickToFourthEnrolmentBtn(){
      CoursesPage.clickToFourthEnrolmentBtn();
   }
   @And("User clicks to fifth Enrolment Links")
   public void clickToFifthEnrolmentBtn(){
      CoursesPage.clickToFifthEnrolmentBtn();
   }
   @Then("User sees if the link opens correct page")
   public void verifyLink(){
      boolean verification=CoursesPage.isEnrolmentPageOpened();
      Assert.assertTrue(verification);
      CoursesPage.quit();
   }
}
