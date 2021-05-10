package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static base.BasePage.driver;

public class BlogSD {
    WebDriver driver;

    @Given("User will be on home page")
    public void userWillBeOnHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://ispeakbetter.com/?lang=en");
    }

    @When("User will click on blog section")
    public void userWillClickOnBlogSection() {
        driver.findElement(By.xpath("//span[@data-hover='Blog']")).click();
    }

    @And("User will click to picture")
    public void userWillClickToPicture() {
        driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[@class='container']" +
                "/div[@class='vc_row wpb_row vc_row-fluid']/div[@class='wpb_column vc_column_container" +
                " vc_col-sm-12']/div[contains(@class,'vc_column-inner')]/div[@class='wpb_wrapper']" +
                "/div[@class='post_list_main_section_wrapper']/div[1]/div[1]/div[1]/div[1]/a[1]")).click();

    }

    @Then("User will see the correct blog")
    public void userWillSeeTheCorrectBlog() {
        String Url= "https://blog.ispeakbetter.com/how-to-sound-like-a-native-english-speaker/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(Url, actualUrl);
        driver.quit();

    }

    @And("User will click to English Article")
    public void userWillClickToEnglishArticle() {
        driver.findElement(By.xpath("//div[@class='vc_row wpb_row vc_row-fluid']//div[2]//div[2]//" +
                "div[1]//div[2]//div[1]//div[1]//div[3]//a[1]")).click();

    }

    @And("User will click to second page")
    public void userWillClickToSecondPage() {
        driver.findElement(By.xpath("//a[normalize-space()='2']")).click();
    }

    @Then("User will see the list of English Articles")
    public void userWillSeeTheListOfEnglishArticles() {
        String Url= "https://blog.ispeakbetter.com/category/english-article/page/2/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(Url, actualUrl);
        driver.quit();

    }

    @And("User will click to headline title")
    public void userWillClickToHeadlineTitle() {
        driver.findElement(By.xpath("//a[normalize-space()='3 Hacks to Learn English Better and Faster']")).click();
    }

    @Then("User will see the blog")
    public void userWillSeeTheBlog() {
        String Url= "https://blog.ispeakbetter.com/3-hacks-to-learn-english-better-and-faster/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(Url, actualUrl);
        driver.quit();

    }

    @And("User will open the blog")
    public void userWillOpenTheBlog() {
        driver.findElement(By.xpath("//a[contains(text(),'Aced your TOEFL/IELTS? Here are the top destinatio')]")).click();

    }

//    @And("User will click the source link")
//    public void userWillClickTheSourceLink() {
//        driver.findElement(By.xpath("//a[normalize-space()='https://www.ielts.org/ielts/destinations']")).click();
//
//    }

    @Then("User will see the IELTS destination page")
    public void userWillSeeTheIELTSDestinationPage() {
        String Url= "https://www.ielts.org/ielts/destinations";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(Url, actualUrl);
        driver.quit();

    }

    @And("User will click to Online learning tag")
    public void userWillClickToOnlineLearningTag() {
        driver.findElement(By.xpath("//a[normalize-space()='Online learning']")).click();

    }

    @Then("User will see the list of Articles with the Online learning tag")
    public void userWillSeeTheListOfArticlesWithTheOnlineLearningTag() {
        String Url= "https://blog.ispeakbetter.com/tag/online-learning/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(Url, actualUrl);
        driver.quit();
    }
}
