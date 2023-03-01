package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.When;
import pages.PhysicianPage;

public class PhysicianPageStepDefs {
    PhysicianPage physicianPage = new PhysicianPage();

    @When("Doctor clicks My Pages dropdown")
    public void doctor_clicks_my_pages_dropdown() {
        physicianPage.myPagesDropDown.click();
    }
    @When("Doctor clicks My Appointment")
    public void doctor_clicks_my_appointment() {
        physicianPage.myAppointment.click();
    }
}
