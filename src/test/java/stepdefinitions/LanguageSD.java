package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AboutPage;

public class LanguageSD {
    
        @Given("User on the About pageL")
        public void gotoAboutPage(){
                AboutPage.goAboutPage();
                AboutPage.clickLang();
                
                
        }


        @When("User clicks to English button")
        public void userClicksToEnglishButton() {
                AboutPage.goEn();

                System.out.println(AboutPage.EnGetText());

                
        }

        @Then("Verify that you switch to the English  button")
        public void verifyThatYouSwitchToTheEnglishButton() {
                String expectedText="About us";
                Assert.assertEquals(expectedText,AboutPage.EnGetText());
                
        }

        @When("User clicks to Turkish page")
        public void userClicksToTurkishPage() {
                AboutPage.goTr();
                System.out.println(AboutPage.EnGetText());
                
        }

        @Then("Verify that you switch to the Turkish  button")
        public void verifyThatYouSwitchToTheTurkishButton() {
                String expectedText="Hakkımızda";
                Assert.assertEquals(expectedText,AboutPage.EnGetText());
        }

        @When("User clicks to Mongolian page")
        public void userClicksToMongolianPage() {
                AboutPage.goMon();
                System.out.println(AboutPage.EnGetText());
                
        }

        @Then("Verify that you switch to the Mongolian  button")
        public void verifyThatYouSwitchToTheMongolianButton() {
                String expectedText="Бидний тухай";
                Assert.assertEquals(expectedText,AboutPage.EnGetText());
        }

        @When("User clicks to Chinese page")
        public void userClicksToChinesePage() {
                AboutPage.goCh();
                System.out.println(AboutPage.EnGetText());
                
        }

        @Then("Verify that you switch to the Chinese  button")
        public void verifyThatYouSwitchToTheChineseButton() {
                String expectedText="關於我們";
                Assert.assertEquals(expectedText,AboutPage.EnGetText());
        }

        @When("User clicks to Russian page")
        public void userClicksToRussianPage() {
                AboutPage.goRus();
                System.out.println(AboutPage.EnGetText());
                
        }

        @Then("Verify that you switch to the Russian  button")
        public void verifyThatYouSwitchToTheRussianButton() {
                String expectedText="O нас";
                Assert.assertEquals(expectedText,AboutPage.EnGetText());
        }

        @When("User clicks to Arabic page")
        public void userClicksToArabicPage() {
                AboutPage.goArb();
                System.out.println(AboutPage.EnGetText());
                
        }

        @Then("Verify that you switch to the Arabic  button")
        public void verifyThatYouSwitchToTheArabicButton() {
                String expectedText="About us";
                Assert.assertEquals(expectedText,AboutPage.EnGetText());
        }
}
