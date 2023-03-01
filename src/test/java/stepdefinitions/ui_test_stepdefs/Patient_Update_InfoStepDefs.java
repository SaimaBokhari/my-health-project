package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Patient_Update_InfoPage;
import utilities.ReusableMethods;

public class Patient_Update_InfoStepDefs {

    Patient_Update_InfoPage patientInfoUpdatePage = new Patient_Update_InfoPage();

    @When("patient updates {string} into First Name input field")
    public void patientUpdatesIntoFirstNameInputField(String firstname) {
        ReusableMethods.waitFor(1);
        patientInfoUpdatePage.firstName.clear();

        ReusableMethods.waitFor(1);
        patientInfoUpdatePage.firstName.sendKeys(firstname);
    }

    @And("patient updates {string} into Last Name input field")
    public void patientUpdatesIntoLastNameInputField(String lastname) {
        ReusableMethods.waitFor(1);
        patientInfoUpdatePage.lastName.clear();

        ReusableMethods.waitFor(1);
        patientInfoUpdatePage.lastName.sendKeys(lastname);

    }

    @And("clicks on Save button")
    public void clicksOnSaveButton() {
        ReusableMethods.waitFor(1);
        patientInfoUpdatePage.save.click();

    }

    @Then("verify that patient updated info is displayed")
    public void verifyThatUpdatedPatientInfoIsDisplayed() {
        ReusableMethods.waitFor(4);
        Assert.assertTrue(patientInfoUpdatePage.updatedUserInfo.isDisplayed());

    }
}
