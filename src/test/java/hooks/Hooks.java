package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import static base_url.MedunnaBaseUrl.medunnaSetUp;

public class Hooks {
    /*
    HOOKS
> specific for Cucumber .. important one
> it is a class that runs Before and After each Scenario and Scenario Outline
> used to generate reports with screenshots
> AfterMethod is very helpful to capture screenshots when Scenario fails
> screenshot will be attached in html file
> import from Cucumber
     */

    @Before
    public void setUpScenario(){   // runs before the given Scenario
        System.out.println("Before Scenario Method");

    }
    @After
    public void tearDownScenario(Scenario scenario){
        System.out.println("After Scenario Method");

        if (scenario.isFailed()){
            final byte[] failedScreenshot = ((TakesScreenshot)(Driver.getDriver())).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot, "image/png", "failed_scenario"+scenario.getName());
            Driver.closeDriver();
        }
    }

    // This Before hooks only runs for @smoke_tests tagged scenarios

    @Before("@smoke_test")
    public void setUpSmokeScenario(){
        System.out.println("Run BEFORE Only Smoke Test Scenario");
    }

    // This After hooks only runs for @smoke_tests tagged scenarios
    @After("@smoke_test")
    public void tearDownSmokeScenario(){
        System.out.println("Run After Only Smoke Test Scenario");
    }

    @Before("@us11_api_test1")
    public void beforeApi(){  // This method will run before Api TestS
        medunnaSetUp();

    }

}

