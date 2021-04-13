package pages;
import static base.BasePage.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.HelperMethods;


public class AboutPage {



    @FindBy(xpath ="//*[@id=\"mobile-navbar-collapse\"]/ul/li[3]/a/span")

    public static WebElement aboutPagelink;


    @FindBy(id = "dropdownMenuLink")
    public static WebElement LanguageMenu;


    @FindBy(xpath = "//*[@id=\"langEn\"]")
    public static WebElement EnglishBtn;

    @FindBy(xpath = "//a[normalize-space()='Turkish']")
    public static WebElement TurkishBtn;

    @FindBy(xpath = "//a[normalize-space()='Mongolian']")
    public  static WebElement MongolianBtn;

    @FindBy(xpath = "//a[normalize-space()='Chinese']")
    public static WebElement ChineseBtn;

    @FindBy(xpath = "//a[normalize-space()='Russian']")
    public static WebElement RussianBtn;

    @FindBy(xpath = "//a[normalize-space()='Arabic']")
    public static WebElement ArabicBtn;


    @FindBy(xpath = "//*[@id=\"page\"]/section[1]/div/div[1]/div[2]/h1/span")
    public static WebElement getAbout;



    public AboutPage(){
        PageFactory.initElements(driver,this);
    }



    public static void goAboutPage (){
        HelperMethods.doClick(aboutPagelink);

    }



    public static String getUrl(){
        return driver.getCurrentUrl();
    }

    public static void clickLang(){
        HelperMethods.doClick(LanguageMenu);
    }

    public static void goEn(){
        HelperMethods.doClick(EnglishBtn);
    }
    public static void goTr(){
        HelperMethods.doClick(TurkishBtn);
    }
    public static void goMon(){
        HelperMethods.doClick(MongolianBtn);
    }
    public static void goCh(){
        HelperMethods.doClick(ChineseBtn);
    }
    public static void goRus(){
        HelperMethods.doClick(RussianBtn);
    }
    public static void goArb(){
        HelperMethods.doClick(ArabicBtn);
    }
    public static String EnGetText(){
        return HelperMethods.doGetText(getAbout);



    }








}
