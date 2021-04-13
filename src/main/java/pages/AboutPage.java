package pages;
import static base.BasePage.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.HelperMethods;


public class AboutPage {



    @FindBy(xpath = "//*[@id=\"page\"]/section[2]/div/div/div[2]/p/strong/a")
    public static WebElement youtubeLink;

    @FindBy(xpath ="//*[@id=\"mobile-navbar-collapse\"]/ul/li[3]/a/span")
    public static WebElement aboutPagelink;


    @FindBy(linkText ="Terms & Conditions")
    public static WebElement term_conditions;


    @FindBy(linkText ="Privacy Policy")
    public static WebElement PrivacyPolicy ;


    @FindBy(linkText ="FAQ")
    public static WebElement FAQ ;


    @FindBy(linkText ="Contact Us")
    public static WebElement ContactUs;

    @FindBy(linkText ="Partners")
    public static WebElement Partners;



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

            public static void clickYoutubeLink(){
                HelperMethods.doClick(youtubeLink);
            }

            public static boolean youtubeLinkSsDisplayed(){
             return    HelperMethods.doIsDisplayed(youtubeLink);
            }

            public static boolean termsConLinkIsDis(){
                return HelperMethods.doIsDisplayed(term_conditions);

            }
            public static void clicktermsConLink(){

                HelperMethods.doClick(term_conditions);
            }
             public static void clickPrivPolLink(){

              HelperMethods.doClick(PrivacyPolicy);
             }
             public static void clickFAQLink(){

             HelperMethods.doClick(FAQ);
             }
            public static void clickContactUsLink(){

             HelperMethods.doClick(ContactUs);
             }
            public static void clickPartnersLink(){

             HelperMethods.doClick(Partners);
            }


            public static String getUrl(){
             return HelperMethods.getCurrentURL();
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