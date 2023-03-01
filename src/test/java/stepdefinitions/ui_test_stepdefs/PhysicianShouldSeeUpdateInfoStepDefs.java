package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.PhysicianInfoPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class PhysicianShouldSeeUpdateInfoStepDefs {

    PhysicianInfoPage physicianInfoPage = new PhysicianInfoPage();
    @Then("verify physician should see ID section")
    public void verify_physician_should_see_id_section() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.inpatientIdSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify physician should see Start Date section")
    public void verify_physician_should_see_start_date_section() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.startDateSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify physician should see End Date section")
    public void verify_physician_should_see_end_date_section() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.endDateSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify physician should see Description section")
    public void verify_physician_should_see_description_section() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.descriptSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify physician should see Created Date section")
    public void verify_physician_should_see_created_date_section() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.createdDateSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify physician should see Appointment section")
    public void verify_physician_should_see_appointment_section() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.appointmentSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify physician should see Status section")
    public void verify_physician_should_see_status_section() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.statusSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify physician should see Room section")
    public void verify_physician_should_see_room_section() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.roomSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify physician should see Patient section")
    public void verify_physician_should_see_patient_section() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.patientSection.isDisplayed();
        assertTrue(isDisplayed);
    }

    @When("physician click on status section")
    public void physician_click_on_status_section() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(physicianInfoPage.status);
    }
    @When("physician choose UNAPPROVED status")
    public void physician_choose_unapproved_status() {
        ReusableMethods.waitFor(2);
        Select select = new Select(physicianInfoPage.status);
        select.selectByValue("UNAPPROVED");
    }
    @And("clicks on Save Submit button")
    public void clicksOnSaveSubmitButton() {
        ReusableMethods.waitFor(2);
        physicianInfoPage.saveSubmitButton.click();
    }
    @Then("verify change is updated successfully")
    public void verify_change_is_updated_successfully() {
        boolean isDisplayed = physicianInfoPage.successMessage.isDisplayed();
        assertTrue(isDisplayed);
    }

    @When("physician click on Room Section")
    public void physicianClickOnRoomSection() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(physicianInfoPage.room);
    }

    @And("physician click on a room from dropbox")
    public void physicianClickOnARoomFromDropbox() {
        ReusableMethods.waitFor(2);
        Select select = new Select(physicianInfoPage.room);
        select.selectByValue("5522");
    }
}
