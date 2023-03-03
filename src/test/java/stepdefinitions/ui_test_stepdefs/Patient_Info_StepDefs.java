package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Patient_InfoPage;
import utilities.ReusableMethods;

public class Patient_Info_StepDefs {

    Patient_InfoPage patientInfoPage=new Patient_InfoPage();

    @And("clicks on Settings option")
    public void clicksOnSettingsOption() {
        ReusableMethods.waitFor(1);
        patientInfoPage.settings.click();

    }

    @When("patient clicks on user icon")
    public void patientClicksOnUserIcon() {
        ReusableMethods.waitFor(1);
        patientInfoPage.userIcon.click();

    }

    @Then("verify that {string} message is displayed")
    public void verifyThatMessageIsDisplayed(String message) {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(patientInfoPage.userInfoMessage.isDisplayed());
    }

}
