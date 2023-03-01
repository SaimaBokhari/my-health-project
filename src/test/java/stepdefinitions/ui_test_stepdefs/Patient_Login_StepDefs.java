package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Patient_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Patient_Login_StepDefs {

    Patient_LoginPage patientLoginPage=new Patient_LoginPage();

    @Given("patient is on {string} page")
    public void patient_is_on_page(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

//    @When("click on user icon")
//    public void click_on_user_icon() {
//        ReusableMethods.waitFor(1);
//        patientLoginPage.userIcon.click();
//
//    }
//    @When("click on Sign In option")
//    public void click_on_sign_in_option() {
//        ReusableMethods.waitFor(1);
//        patientLoginPage.signInOption.click();
//
//    }

//    @When("enter {string} in Username input")
//    public void enter_in_username_input(String username) {
//        ReusableMethods.waitFor(1);
//        patientLoginPage.usernameInput.sendKeys(username);
//
//    }
//
//    @When("enter {string} in Password input")
//    public void enter_in_password_input(String password) {
//        ReusableMethods.waitFor(1);
//        patientLoginPage.passwordInput.sendKeys(password);
//
//    }

//    @When("click on Remember Me checkbox")
//    public void click_on_remember_me_checkbox() {
//        ReusableMethods.waitFor(1);
//        patientLoginPage.rememberMeCheckbox.click();
//
//    }
//
//    @When("click on Sign In submit button")
//    public void click_on_sign_in_submit_button() {
//        ReusableMethods.waitFor(1);
//        patientLoginPage.signInSubmitButton.click();
//
//    }

    @Then("verify that login is successfull.")
    public void verify_that_login_is_successfull() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(patientLoginPage.userID.isDisplayed());

    }
}
