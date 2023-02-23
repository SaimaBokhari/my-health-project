package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",     // makes the console printing green
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
        },
        monochrome = false,     // makes the console grey

        features = "./src/test/resources/features",   // Path of Features folder
        glue = {"stepdefinitions"},
        dryRun = false,
        tags = "@grid_edge"
)
public class GridRunner {

}


/*
When you run Runner, it will go to feature file, and start execution from top to bottom.
If there is any step matching, Java will find that matching 'stepdefinition', and it will be executed.
If there is no match then Cucumber will generate template for us in the console.
 */

