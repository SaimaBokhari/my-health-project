package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginPageStepDefs {
    LoginPage loginPage = new LoginPage();

    @When("{string} enters {string} in username field")
    public void enters_in_username_field(String string, String username) {
        loginPage.username.sendKeys(ConfigReader.getProperty(username));
    }
    @When("{string} enters {string} in password field")
    public void enters_in_password_field(String string, String password) {
        loginPage.password.sendKeys(ConfigReader.getProperty(password));
    }
    @When("{string} clicks sign in submit button")
    public void clicks_sign_in_submit_button(String string) {
        loginPage.submitButton.click();
    }
}
