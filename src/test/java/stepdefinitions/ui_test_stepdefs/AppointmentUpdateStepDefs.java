package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.AppointmentUpdatePage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import static org.junit.Assert.assertTrue;

public class AppointmentUpdateStepDefs {

    AppointmentUpdatePage appointmentUpdatePage=new AppointmentUpdatePage();

    Actions actions=new Actions(Driver.getDriver());

    @When("staff clicks on MY PAGES icon")
    public void staffClicksOnMYPAGESIcon() {
        appointmentUpdatePage.myPages.click();
    }

    @When("clicks on Search Patient icon")
    public void clicks_on_search_patient_icon() {

        appointmentUpdatePage.searchPateint.click();

    }

    @When("enters SSN into Patient {string} into SSN text box")
    public void enters_ssn_into_patient_into_ssn_text_box(String ssn) {
        ReusableMethods.waitFor(2);
        appointmentUpdatePage.ssn.sendKeys("700-01-111");
    }

    @When("clicks on Show Appointments button")
    public void clicks_on_show_appointments_button() {
        ReusableMethods.waitFor(2);
        appointmentUpdatePage.showAppointments.click();

    }

    @And("clicks on edit button to edit")
    public void clicksOnEditButtonToEdit() {
        actions.scrollToElement(appointmentUpdatePage.editButton).click().perform();
        ReusableMethods.waitFor(1);
        appointmentUpdatePage.editButton.click();
    }


    @And("sets new {string} for appointment")
    public void setsNewForAppointment(String startDateTime) {
        ReusableMethods.waitFor(1);
        appointmentUpdatePage.appointmentStartDate.clear();
        appointmentUpdatePage.appointmentStartDate.sendKeys("2023-02-21T03:15");
    }

    @And("sets new endDateTime in {string} field for appointment")
    public void setsNewEndDateTimeInFieldForAppointment(String endDateTime) {
        ReusableMethods.waitFor(1);
        appointmentUpdatePage.appointmentEndDate.clear();
        appointmentUpdatePage.appointmentEndDate.sendKeys("2023-02-21T04:15");

    }

    @When("clicks on Save button to save")
    public void clicks_on_save_button_to_save() throws InterruptedException {
        ReusableMethods.waitFor(3);
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", appointmentUpdatePage.saveButton);
        JSUtils.clickElementByJS(appointmentUpdatePage.saveButton);

    }

    @Then("verify that appointment is updated")
    public void verify_that_appointment_is_updated() {
        ReusableMethods.waitFor(5);
        assertTrue(appointmentUpdatePage.successMessage.isDisplayed());


    }


}

