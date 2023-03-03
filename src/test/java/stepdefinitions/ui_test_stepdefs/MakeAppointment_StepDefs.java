package stepdefinitions.ui_test_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.*;
import pojos.Appointments;
import pojos.Patient;
import utilities.ConfigReader;
import utilities.Driver;

public class MakeAppointment_StepDefs {


    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    MyAppointmentsPage myAppointmentsPage = new MyAppointmentsPage();
    HomePageAppointment homePageAppointment = new HomePageAppointment();
    Patient_InfoPage patientInfoPage=new Patient_InfoPage();
    Patient_LoginPage patientLoginPage=new Patient_LoginPage();
    Patient_Update_InfoPage patientInfoUpdatePage = new Patient_Update_InfoPage();

    Faker faker = new Faker();
    Appointments appointments = new Appointments();
    Patient patient = new Patient();



    @Given("user goes to the homepage")
    public void user_goes_to_the_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }


    @Given("verify make an appointment button is displayed")
    public void verify_make_an_appointment_button_is_displayed() {
        Assert.assertTrue(homePageAppointment.makeAnAppointmentButton.isDisplayed());
    }

    @When("user click to Make an Appointment")
    public void user_click_to_make_an_appointment() {
        homePageAppointment.makeAnAppointmentButton.click();
    }


    @Then("verify Make an Appointment is displayed")
    public void verify_make_an_appointment_is_displayed() {
        Assert.assertTrue(homePageAppointment.sendAppointmentButton.isDisplayed());
    }

    @When("user provide first name of the applicant {string}")
    public void user_provide_first_name_of_the_applicant(String firstname) {

        if(firstname.equals("-1")){
            firstname=faker.name().firstName();
        }

        homePageAppointment.firstname.sendKeys(firstname + Keys.ENTER);
        patient.setFirstName(firstname);

    }
    @Then("user should not see error message")
    public void user_should_not_see_error_message() {

        Assert.assertTrue(homePageAppointment.verifyValid.isDisplayed());

    }

    @Then("user should see error message")
    public void user_should_see_error_message() {

        Assert.assertTrue(homePageAppointment.firstnameRequired.isDisplayed());
    }


    @When("user provides the {string} SSN")
    public void user_provides_the_ssn(String SSN) {
        if(SSN.equals("-1")){
            SSN=faker.idNumber().ssnValid();
        }
        homePageAppointment.ssn.sendKeys(SSN+Keys.ENTER);

    }

    @Then("user does not get invalid error message")
    public void user_does_not_get_invalid_error_message() {
        Assert.assertTrue(homePageAppointment.ssn.isDisplayed());

    }

    @When("user provide last name of the application {string}")
    public void user_provide_last_name_of_the_application(String lastName) {

        if(lastName.equals("-1")){
            lastName=faker.name().firstName();
        }

        homePageAppointment.firstname.sendKeys(lastName + Keys.ENTER);
        patient.setLastName(lastName);


    }

    @When("user provide last name of the applicant {string}")
    public void user_provide_last_name_of_the_applicant(String lastName) {
        if(lastName.equals("-1")){
            lastName=faker.name().lastName();
        }

        homePageAppointment.lastname.sendKeys(lastName + Keys.ENTER);
        patient.setLastName(lastName);
    }


    @When("user provides the {string} phone number")
    public void user_provides_the_phone_number(String phoneNumber) {

        homePageAppointment.phone.sendKeys(phoneNumber + Keys.ENTER);
        patient.setPhone(phoneNumber);
    }


    @When("user provide email name of the applicant {string}")
    public void user_provide_email_name_of_the_applicant(String email) {

        homePageAppointment.email.sendKeys(email+Keys.ENTER);
        patient.setEmail(email);
    }



    @When("user click to Sent an Appointment Request button")
    public void user_click_to_sent_an_appointment_request_button() {
        homePageAppointment.sendAppointmentButton.submit();

    }



}
