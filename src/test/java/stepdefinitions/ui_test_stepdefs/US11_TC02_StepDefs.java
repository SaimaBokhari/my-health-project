package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.DoctorsPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US11_TC02_StepDefs {

    DoctorsPage doctorsPage= new DoctorsPage();
    @Then("assert that doctor can see patient id")
    public void assert_that_doctor_can_see_patient_id() {
        assertTrue(doctorsPage.patientId.isDisplayed());

        ReusableMethods.waitFor(5);
        for (WebElement w : doctorsPage.patientIdList) {
            System.out.println(w.getText());
        }
    }
    @Then("assert that doctor can see start date")
    public void assert_that_doctor_can_see_start_date() {
        assertTrue(doctorsPage.startDateAndTime.isDisplayed());
    }
    @Then("assert that doctor can see end date")
    public void assert_that_doctor_can_see_end_date() {
        assertTrue(doctorsPage.endDateAndTime.isDisplayed());
    }
    @Then("assert that doctor can see status")
    public void assert_that_doctor_can_see_status() {
        assertTrue(doctorsPage.appointmentStatus.isDisplayed());

        ReusableMethods.waitFor(5);
        for (WebElement w : doctorsPage.appointmentStatusList) {
            System.out.println(w.getText());
        }
    }

    @Then("assert that doctor can see anamnesis")
    public void assert_that_doctor_can_see_anamnesis() {
        assertTrue(doctorsPage.anamnesis.isDisplayed());
    }
    @Then("assert that doctor can see treatment")
    public void assert_that_doctor_can_see_treatment() {
       assertTrue(doctorsPage.treament.isDisplayed());
    }
    @Then("assert that doctor can see diagnosis")
    public void assert_that_doctor_can_see_diagnosis() {
        assertTrue(doctorsPage.diagnosis.isDisplayed());
    }
    @Then("assert that doctor can see prescription")
    public void assert_that_doctor_can_see_prescription() {
        assertTrue(doctorsPage.prescription.isDisplayed());
    }
    @Then("assert that doctor can see description")
    public void assert_that_doctor_can_see_description() {
       assertTrue(doctorsPage.description.isDisplayed());
    }
    @Then("assert that doctor can see createdDate")
    public void assert_that_doctor_can_see_created_date() {
        assertTrue(doctorsPage.createdDate.isDisplayed());
    }
    @Then("assert that doctor can see physician")
    public void assert_that_doctor_can_see_physician() {
        assertTrue(doctorsPage.physician.isDisplayed());
    }
    @Then("assert that doctor can see patient")
    public void assert_that_doctor_can_see_patient() {
        assertTrue(doctorsPage.patient.isDisplayed());
    }
}
