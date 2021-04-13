package base;

import pages.AboutPage;
import pages.CoursesPage;

public class PageManager {

    public static CoursesPage coursespage;
    public static AboutPage aboutPage;
    public static void initialize() {
        coursespage = new CoursesPage();
         aboutPage = new AboutPage();
    }

}
