import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutSD {

WebDriver driver;
  By youtubeLink = By.xpath("//*[@id=\"page\"]/section[2]/div/div/div[2]/p/strong/a");




   @Given("User wil be swithch youtube page")
    public void given1(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("https://ispeakbetter.com/about");
   }
   @When("User  click youtube link")
    public void when1(){
       driver.findElement(youtubeLink).click();


   }

   @Then("Verify that you switch to the youtube page")
    public void then (){


   }
}
