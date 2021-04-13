package stepdefinitions;


import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AboutPage;


public class AboutSD {



    @Given("User on the About page")
    public void goToMainPage() {

        AboutPage.getUrl();






    }
   @When("I see correct url")
    public void when(){

       System.out.println(AboutPage.getUrl());


   }


   @Then("Verify Url")
    public void then (){



       String expectedURL = "https://ispeakbetter.com/";

       Assert.assertEquals(expectedURL,AboutPage.getUrl());


   }


    @When("User clicks to term_conditions page")
    public void userClicksToTerm_conditionsPage() {

        AboutPage.goAboutPage();
        AboutPage.clicktermsConLink();



    }

    @Then("Verify that you switch to the Terms & Conditions  page")
    public void verifyThatYouSwitchToTheTermsConditionsPage() {
        String expectedUrl = "https://ispeakbetter.com/terms-conditions";
        Assert.assertEquals(expectedUrl,AboutPage.getUrl());


    }

    @When("User clicks to PrivacyPolicy page")
    public void userClicksToPrivacyPolicyPage() {
        AboutPage.goAboutPage();
        AboutPage.clickPrivPolLink();

    }

    @Then("Verify that you switch to the PrivacyPolicy  page")
    public void verifyThatYouSwitchToThePrivacyPolicyPage() {
        String expectedUrl = "https://ispeakbetter.com/privacy-policy";
        Assert.assertEquals(expectedUrl,AboutPage.getUrl());
    }

    @When("User clicks to FAQ page")
    public void userClicksToFAQPage() {
        AboutPage.goAboutPage();
        AboutPage.clickFAQLink();

    }

    @Then("Verify that you switch to the FAQ  page")
    public void verifyThatYouSwitchToTheFAQPage() {
        String expectedUrl= "https://ispeakbetter.com/faq";
        Assert.assertEquals(expectedUrl,AboutPage.getUrl());

    }

    @When("User clicks to Contact Us page")
    public void userClicksToContactUsPage() {
        AboutPage.goAboutPage();
        AboutPage.clickContactUsLink();

    }

    @Then("Verify that you switch to the Contact Us  page")
    public void verifyThatYouSwitchToTheContactUsPage() {
        String expectedUrl= "https://ispeakbetter.com/contact";
        Assert.assertEquals(expectedUrl,AboutPage.getUrl());

    }

    @When("User clicks to Partners page")
    public void userClicksToPartnersPage() {
        AboutPage.goAboutPage();
        AboutPage.clickPartnersLink();

    }

    @Then("Verify that you switch to the Partners  page")
    public void verifyThatYouSwitchToThePartnersPage() {
        String expectedUrl= "https://ispeakbetter.com/partners";
        Assert.assertEquals(expectedUrl,AboutPage.getUrl());
    }
}
