package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegistrationPageStepDefs {
    WebDriver driver;
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("User goes to the home page")
    public void userGoesToTheHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @When("User clicks on Register from drop down menu")
    public void clicks_on_Register_from_drop_down_menu() {
        registrationPage.registerButton.click();
    }

    @When("User enters the {string} into SSN input field")
    public void enters_the_into_ssn_input_field(String string) {
        registrationPage.ssnTextInput.sendKeys(string);
    }

    @When("User enters the {string} into First Name input field")
    public void enters_the_into_first_name_input_field(String string) {
        registrationPage.firstNameTextInput.sendKeys(string);
    }

    @When("User enters the {string} into Last Name input field")
    public void enters_the_into_las_name_input_field(String string) {
        registrationPage.lastNameTextInput.sendKeys(string);
    }

    @When("User enters the {string} into Username input field")
    public void enters_the_into_username_input_field(String string) {
        registrationPage.userNameTextInput.sendKeys(string);
    }

    @When("User enters the {string} into Email input field")
    public void enters_the_into_email_input_field(String string) {
        registrationPage.emailTextInput.sendKeys(string);
    }

    @When("User enters the {string} into New Password Confirmation input field")
    public void enters_the_into_new_password_confirmation_input_field(String string) {
        registrationPage.secondPasswordTextInput.sendKeys(string);
    }

    @Then("Verify that success message appears")
    public void verify_that_success_message_appears() {
        ReusableMethods.waitFor(3);
        assertTrue(registrationPage.successMessageToastContainer.isDisplayed());
    }

    //  **********************

    @When("User clicks on \"User Icon\" in the top right corner")
    public void user_clicks_on_user_icon() {
        registrationPage.userIcon.click();
    }

    @When("User enters the password into \"New Password\" input field")
    public void user_enters_password_into_new_password_field(String password) {
        registrationPage.newPasswordField.sendKeys(password);
    }

    @When("User enters the {string} into New Password input field")
    public void user_enters_the_into_new_password_input_field(String string) {
        JSUtils.scrollDownByJS();
        ReusableMethods.waitFor(3);
        registrationPage.newPasswordField.sendKeys(string);
    }

    @When("User clicks on Register submit button")
    public void User_clicks_on_register_submit_button() {
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(registrationPage.RegisterSubmitButton);
    }

    @Then("Verify that error message appears")
    public void verify_that_error_message_appears() {
        assertTrue(registrationPage.errorMessagePassAtLeast4Char.isDisplayed());
    }

    @Then("Verify that the error message appears")
    public void verify_that_the_error_message_appears() {
        assertTrue(registrationPage.errorMessagePassRequired.isDisplayed());
    }

    @Then("Verify that password strength is weak-red")
    public void verify_that_password_strength_is_weak_red() {
        String redBar = registrationPage.passwordStrengthBar1.getAttribute("style");
        assertEquals("background-color: rgb(255, 0, 0);", redBar);
    }

    @Then("Verify that password strength is good-orange")
    public void verify_that_password_strength_is_good_orange() {
        String orangeBar = registrationPage.passwordStrengthBar1.getAttribute("style");
        assertEquals("background-color: rgb(255, 153, 0);", orangeBar);
    }

    @Then("Verify that password strength is the strongest-green")
    public void verify_that_password_strength_is_the_strongest_green() {
        String greenBarMax = registrationPage.passwordStrengthBar1.getAttribute("style");
        assertEquals("background-color: rgb(0, 255, 0);", greenBarMax);
    }

    @Then("Verify that password strength is strong-green")
    public void verifyThatPasswordStrengthIsStrongGreen() {
        String greenBar = registrationPage.passwordStrengthBar1.getAttribute("style");
        assertEquals("background-color: rgb(153, 255, 0);", greenBar);
    }

    @And("User closes the application")
    public void userClosesTheApplication() {
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }
//    @After
//    public void close_application() throws InterruptedException {
//    Driver.closeDriver();
//    }

}
