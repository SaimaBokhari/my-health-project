package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PhysicianDetailsPage;

public class PhysicianDetailsStepDefs {
    PhysicianDetailsPage detailsPage = new PhysicianDetailsPage();

    @Then("Admin verify ssn header is visible")
    public void adminVerifySsnHeaderIsVisible() {
        Assert.assertTrue(detailsPage.ssn.isDisplayed());
    }

    @Then("Admin verify firstName header is visible")
    public void adminVerifyFirstNameHeaderIsVisible() {
        Assert.assertTrue(detailsPage.firstName.isDisplayed());
    }

    @Then("Admin verify lastName header is visible")
    public void adminVerifyLastNameHeaderIsVisible() {
        Assert.assertTrue(detailsPage.lastName.isDisplayed());
    }

    @Then("Admin verify birthDate header is visible")
    public void adminVerifyBirthDateHeaderIsVisible() {
        Assert.assertTrue(detailsPage.birthDate.isDisplayed());
    }

    @Then("Admin verify phone header is visible")
    public void adminVerifyPhoneHeaderIsVisible() {
        Assert.assertTrue(detailsPage.phone.isDisplayed());
    }

    @Then("Admin verify speciality header is visible")
    public void adminVerifySpecialityHeaderIsVisible() {
        Assert.assertTrue(detailsPage.speciality.isDisplayed());
    }

    @And("Admin clicks back button")
    public void adminClicksBackButton() {
        detailsPage.backButton.click();
    }
}
