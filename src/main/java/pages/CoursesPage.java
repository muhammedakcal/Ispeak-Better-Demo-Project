package pages;


import base.BasePage;
import org.openqa.selenium.By;
import utils.HelperMethods;

import static base.BasePage.driver;

public class CoursesPage {
    public static By coursesBtn=By.xpath("//*[@id=\"mobile-navbar-collapse\"]/ul/li[4]/a/span");
    public static By courseEnrolment1=By.xpath("//*[@id=\"course-section\"]/div/div[2]/div/div[1]/div/div[2]/div[3]/h4/a");
    public static By courseEnrolment2=By.xpath("//*[@id=\"course-section\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/h4/a");
    public static By courseEnrolment3=By.xpath("//*[@id=\"course-section\"]/div/div[2]/div/div[3]/div/div[2]/div[2]/h4/a");
    public static By courseEnrolment4=By.xpath("//*[@id=\"course-section\"]/div/div[2]/div/div[4]/div[1]/div[1]/div/div[2]/div[2]/h4/a");
    public static By courseEnrolment5=By.xpath("//*[@id=\"course-section\"]/div/div[2]/div/div[4]/div[1]/div[2]/div/div[2]/div[2]/h4/a");
    public static By displayedPart=By.xpath("//*[@id=\"page\"]/section[3]/div/div/div[1]/h1");
    public static void clickToCoursesBtn(){
        HelperMethods.doClick(driver.findElement(coursesBtn));
    }
    public static void clickToFirstEnrolmentBtn(){
        HelperMethods.doClick(driver.findElement(courseEnrolment1));
    }
    public static void clickToSecondEnrolmentBtn(){
        HelperMethods.doClick(driver.findElement(courseEnrolment2));
    }
    public static void clickToThirdEnrolmentBtn(){
        HelperMethods.doClick(driver.findElement(courseEnrolment3));
    }
    public static void clickToFourthEnrolmentBtn(){
        HelperMethods.doClick(driver.findElement(courseEnrolment4));
    }
    public static void clickToFifthEnrolmentBtn(){
        HelperMethods.doClick(driver.findElement(courseEnrolment5));
    }
    public static Boolean isEnrolmentPageOpened(){
        return driver.findElement(displayedPart).isDisplayed();
    }
    public static void quit(){
        BasePage.tearDown();
    }

}
