package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.PhysicianInfoPage;
import pages.PhysicianPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class PhysicianShouldSeeTestStepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PhysicianPage physicianPage = new PhysicianPage();
    PhysicianInfoPage physicianInfoPage = new PhysicianInfoPage();

    @Given("phsician goes to {string} page")
    public void phsician_goes_to_page(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @When("phsician click on user icon")
    public void phsician_click_on_user_icon() {
        ReusableMethods.waitFor(2);
        homePage.userIcon.click();
    }
    @When("physician click on Sign In option")
    public void physician_click_on_sign_in_option() {
        ReusableMethods.waitFor(2);
        homePage.signInOption.click();
    }
    @When("physician enter {string} as username input")
    public void physician_enter_as_username_input(String username) {
        ReusableMethods.waitFor(2);
        loginPage.username.sendKeys(ConfigReader.getProperty("doctor_username"));
    }
    @When("physician enter {string} as password input")
    public void physician_enter_as_password_input(String password) {
        ReusableMethods.waitFor(2);
        loginPage.password.sendKeys(ConfigReader.getProperty("doctor_password"));
    }

    @And("physician click on Remember Me checkbox")
    public void physicianClickOnRememberMeCheckbox() {
        ReusableMethods.waitFor(2);
        loginPage.rememberMe.click();
    }
    @When("physician click on Sign In submit button")
    public void physician_click_on_sign_in_submit_button() {
        ReusableMethods.waitFor(2);
        loginPage.submitButton.click();
    }
    @When("physician click on MyPages")
    public void physician_click_on_my_pages() {
        ReusableMethods.waitFor(2);
        physicianPage.myPagesDropDown.click();
    }
    @When("physician click on My Appointments")
    public void physician_click_on_my_appointments() {
        ReusableMethods.waitFor(2);
        physicianPage.myAppointment.click();
    }
    @When("physician click on Edit button")
    public void physician_click_on_edit_button() {
        ReusableMethods.waitFor(2);
        physicianInfoPage.editSection.click();
    }
    @Then("verify Show Test Results button is displayed")
    public void verify_show_test_results_button_is_displayed() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.showTestResults.isDisplayed();
        assertTrue(isDisplayed);
    }

    @When("physician click on Show Test Results button")
    public void physician_click_on_show_test_results_button() {
        ReusableMethods.waitFor(2);
        physicianInfoPage.showTestResults.click();
    }
    @Then("verify View Results button is displayed on the site")
    public void verify_view_results_button_is_displayed_on_the_site() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.viewResults.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("physician click on View Results button")
    public void physician_click_on_view_results_button() {
        ReusableMethods.waitFor(2);
        physicianInfoPage.viewResults.click();
    }
    @Then("verify Test Results page is displayed")
    public void verify_test_results_page_is_displayed() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.testResults.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify test id is visible")
    public void verify_test_id_is_visible() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.idSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify test name is visible")
    public void verify_test_name_is_visible() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.nameSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify test result is visible")
    public void verify_test_result_is_visible() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.resultSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify default min value is visible")
    public void verify_default_min_value_is_visible() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.defMinValSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify default max value is visible")
    public void verify_default_max_value_is_visible() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.defMaxValSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify test is visible")
    public void verify_test_is_visible() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.testSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify description is visible")
    public void verify_description_is_visible() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.descriptionSection.isDisplayed();
        assertTrue(isDisplayed);
    }
    @Then("verify test date is visible")
    public void verify_test_date_is_visible() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.dateSection.isDisplayed();
        assertTrue(isDisplayed);
    }

    @When("physician click on Request Inpatient button")
    public void physician_click_on_request_inpatient_button() {
        ReusableMethods.waitFor(2);
        physicianInfoPage.requestInpatient.click();
    }
    @And("physician types {string}  as anamnesis")
    public void physicianTypesAsAnamnesis(String anamnesis) {
        ReusableMethods.waitFor(2);
        physicianInfoPage.anamnesisSection.sendKeys(anamnesis);
    }

    @And("physician types {string} as treatment")
    public void physicianTypesAsTreatment(String treatment) {
        ReusableMethods.waitFor(2);
        physicianInfoPage.treatmentSection.sendKeys(treatment);
    }

    @And("physician types {string} as diagnosis")
    public void physicianTypesAsDiagnosis(String diagnosis) {
        ReusableMethods.waitFor(2);
        physicianInfoPage.diagnosisSection.sendKeys(diagnosis);
    }
    @When("phycician click on Save button")
    public void phycician_click_on_save_button() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(physicianInfoPage.saveButton);
    }
    @When("physician click on MyInpatients")
    public void physician_click_on_my_inpatients() {
        ReusableMethods.waitFor(6);
        physicianPage.myInpatients.click();
    }
    @When("verify Inpatient Appointment number is visible on the page")
    public void verify_inpatient_appointment_number_is_visible_on_the_page() {
        ReusableMethods.waitFor(2);
        boolean isDisplayed = physicianInfoPage.appointmentNumber.isDisplayed();
        assertTrue(isDisplayed);
    }
}
