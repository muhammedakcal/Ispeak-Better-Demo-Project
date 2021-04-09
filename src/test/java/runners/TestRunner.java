package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(


        // This creates cucumber report
        plugin = {"pretty", "html:target/site/cucumber-pretty.html"
                , "json:target/cucumber-html-reports/cucumber.json",
                "junit:target/cucumber-xml-reports/cucumber.xml"},

        features = {"src/test/resources/features"},
        glue = {"src/test/java/stepdefinitions"}, // --> Bu kismi localinize gore duzenlemeniz gerekiyor.


        // Changes the console output and if value is true, console output is going to look more simple
        monochrome = false,
        // Checks if the steps are defined or not
        dryRun = false


)

public class TestRunner {
}
