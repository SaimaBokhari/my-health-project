package stepdefinitions.ui_test_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class Us01_RegisterationPageStepDefs {

    RegistrationPage registrationPage = new RegistrationPage();

    //@TC01
    @Then("click on register option")
    public void click_on_register_option() {

        registrationPage.registerButton.click();
    }
    @Then("{string} enters {string} in SSN box")
    public void enters_in_ssn_box(String string, String ssn) {
        Faker faker = new Faker();
        registrationPage.enterSSN.sendKeys(ConfigReader.getProperty(ssn));
        System.out.println(faker.idNumber().ssnValid());
        ReusableMethods.waitFor(1);
        Assert.assertFalse(ssn.contains("Your SSN is invalid"));
        assertTrue(ssn.contains("valid_ssn_number"));
    }
    @And("{string} enters {string} in First Name Box")
    public void entersInFirstNameBox(String String, String firstName) {
        registrationPage.enterFirstName.sendKeys(firstName);
    }
    @Then("verify FirstName box contains Valid First Name")
    public void verify_first_name_box_contains_valid_first_name() {
        assertTrue(registrationPage.enterFirstName.toString().contains("firstName"));
    }

    @Then("click on register submit button")
    public void clickOnRegisterSubmitButton() {
        ReusableMethods.waitFor(2);
        registrationPage.registerSubmitButton.click();
    }

    @Then("Verify the error message appears")
    public void verifyTheErrorMessageAppears() {
        ReusableMethods.waitFor(3);
        assertTrue(registrationPage.lastNameRequired2.isDisplayed());
    }

    @Then("verify that error message appears")
    public void verifyThatErrorMessageAppears() {
        ReusableMethods.waitFor(3);
        assertTrue(registrationPage.firstNameRequired2.isDisplayed());
    }

    @And("{string} enters {string} in Last Name Box")
    public void entersInLastNameBox(String string, String lastname) {
        ReusableMethods.waitFor(2);
        registrationPage.enterLastName.sendKeys("France");
    }

    @Then("verify LastName box contains Valid Last Name")
    public void verifyLastNameBoxContainsValidLastName() {
        Assert.assertTrue(registrationPage.enteredLastName.toString().contains("France"));

    }



}