package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UserManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US21_Admin_StepDefs {

    HomePage homePage = new HomePage();

    LoginPage loginPage = new LoginPage();

    AdminPage adminPage = new AdminPage();

    UserManagementPage userManagementPage = new UserManagementPage();

    int idx;

    @Given("{string} goes to the homepage")
    public void goes_to_the_homepage(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @When("{string} clicks on user icon")
    public void clicks_on_user_icon(String icon) {
        homePage.userIcon.click();
    }
    @When("{string} clicks on sign in button")
    public void clicks_on_sign_in_button(String string) {
        ReusableMethods.waitFor(2);
        homePage.signInOption.click();
    }
    @When("{string} clicks on sign in submit button")
    public void clicks_on_sign_in_submit_button(String string) {
        ReusableMethods.waitFor(2);
        loginPage.submitButton.click();
    }

    @Then("Admin clicks on administration option")
    public void admin_clicks_on_administration_option() {
        adminPage.adminMenuDropDown.click();
    }
    @Then("Admin clicks on user management option")
    public void admin_clicks_on_user_management_option() {
        adminPage.userManagement.click();
    }
    @When("{string} sorts the page by ID in Descending order")
    public void sorts_the_page_by_id_in_descending_order(String string) {
        ReusableMethods.waitFor(2);
        userManagementPage.sortById.click();
    }
    @When("{string} clicks on any id from among the registered users")
    public void clicks_on_any_id_from_among_the_registered_users(String string) {
        ReusableMethods.waitFor(4);

        List<String> userlist = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            userlist.add(Driver.getDriver().findElement(By.xpath("//tbody/tr["+i+"]/td[2]")).getText());
        }
        System.out.println(userlist);

        int inx = 0;
        for (int i = 1; i < 21; i++) {
            if (userlist.get(i).equals("emma")){
                System.out.println(i);
                JSUtils.clickElementByJS(Driver.getDriver().findElement(By.xpath("//tbody/tr["+i+"]/td[11]/div/a")));
                break;
            }
        }

    }
    @Then("{string} can see {string} of that registered user")
    public void can_see_of_that_registered_user(String admin, String login) {

    }
    @Then("verify login name of that registered user")
    public void verify_login_name_of_that_registered_user() {

    }
    @Then("verify firstName box contains valid first name of that user")
    public void verify_first_name_box_contains_valid_first_name_of_that_user() {

    }
    @Then("verify lastName box contains valid last name of that user")
    public void verify_last_name_box_contains_valid_last_name_of_that_user() {

    }
    @Then("verify email box contains valid email of that user")
    public void verify_email_box_contains_valid_email_of_that_user() {

    }
    @Then("{string} can see {string} for that user")
    public void can_see_for_that_user(String string, String string2) {

    }
    @Then("verify createdBy box contains valid information for that user")
    public void verify_created_by_box_contains_valid_information_for_that_user() {

    }
    @Then("verify modifiedBy box contains valid information for that user")
    public void verify_modified_by_box_contains_valid_information_for_that_user() {

    }
    @Then("verify modifiedDate box contains valid information for that user")
    public void verify_modified_date_box_contains_valid_information_for_that_user() {

    }
    @Then("{string} can see {string} of that user")
    public void can_see_of_that_user(String string, String string2) {

    }
    @Then("verify profile for that user is activated")
    public void verify_profile_for_that_user_is_activated() {

    }


}
