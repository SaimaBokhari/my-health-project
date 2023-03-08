package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UserManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.*;

public class US21_Admin_StepDefs {

    HomePage homePage = new HomePage();

    LoginPage loginPage = new LoginPage();

    AdminPage adminPage = new AdminPage();

    UserManagementPage userManagementPage = new UserManagementPage();

//    ********** Background ************
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
    @Then("{string} clicks on {string} option")
    public void clicks_on_option(String string, String string2) {
        userManagementPage.createNewUser.click();

    }
    @Then("{string} enters {string} into Username input field")
    public void enters_into_username_input_field(String string, String string2) {
        userManagementPage.userNameForNewUser.sendKeys(ConfigReader.getProperty("us21_username"));
    }
    @Then("{string} enters {string} into First Name input field")
    public void enters_into_first_name_input_field(String string, String string2) {
        userManagementPage.firstNameForNewUser.sendKeys(ConfigReader.getProperty("us21_firstname"));
    }
    @Then("{string} enters {string} into Last Name input field")
    public void enters_into_last_name_input_field(String string, String string2) {
        userManagementPage.lastNameForNewUser.sendKeys(ConfigReader.getProperty("us21_lastname"));
    }
    @Then("{string} enters {string} into Email input field")
    public void enters_into_email_input_field(String string, String string2) {
        userManagementPage.emailForNewUser.sendKeys(ConfigReader.getProperty("us21_email"));
    }
    @Then("{string} enters {string} into SSN input field")
    public void enters_into_ssn_input_field(String string, String string2) {
        userManagementPage.ssnForNewUser.sendKeys(ConfigReader.getProperty("us21_ssn"));
    }
    @Then("{string} clicks on Save button")
    public void clicks_on_save_button(String string) {
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(userManagementPage.saveButton);
    }
    @Then("Verify the success message appears")
    public void verifyTheSuccessMessageAppears() {
        ReusableMethods.waitFor(3);
        assertTrue(userManagementPage.successMessageForNewUser.isDisplayed());
    }

    //        *************** TC_01_Admin can view registered user's information **************

    // Go back to User Management Page
    @When("{string} sorts the page by ID in Descending order")
    public void sorts_the_page_by_id_in_descending_order(String string) {
        ReusableMethods.waitFor(3);
        userManagementPage.sortById.click();
    }
    @When("{string} clicks on any id from among the registered users")
    public void clicks_on_any_id_from_among_the_registered_users(String string) {
        ReusableMethods.waitFor(4);
        userManagementPage.myUserViewButton.click();

//        List<String> userlist = new ArrayList<>();
//        for (int i = 1; i < 21; i++) {
//            userlist.add(Driver.getDriver().findElement(By.xpath("//tbody/tr["+i+"]/td[2]")).getText());
//        }
//        System.out.println(userlist);
//
//        int inx = 0;
//        for (int i = 1; i < 21; i++) {
//            if (userlist.get(i).equals("emina-team02")){
//                System.out.println(i);
//                JSUtils.clickElementByJS(Driver.getDriver().findElement(By.xpath("//tbody/tr["+i+"]/td[11]/div/a")));
//                break;
//            }
//        }

    }
    @Then("{string} can see {string} of that registered user")
    public void can_see_of_that_registered_user(String admin, String login) {
        ReusableMethods.waitFor(3);
        assertTrue(userManagementPage.loginOfMyUserOnViewPage.isDisplayed());
    }
    @Then("verify login name of that registered user")
    public void verify_login_name_of_that_registered_user() {
        ReusableMethods.waitFor(3);
        assertTrue(userManagementPage.loginOfMyUserOnViewPage.getText().contains(ConfigReader.getProperty("us21_username")));
    }
    @And("Admin can see firstname of that registered user")
    public void adminCanSeeFirstnameOfThatRegisteredUser() {
        ReusableMethods.waitFor(1);
        assertTrue(userManagementPage.firstNameOfMyUserOnViewPage.isDisplayed());
    }
    @Then("verify firstName box contains valid first name of that user")
    public void verify_first_name_box_contains_valid_first_name_of_that_user() {
        ReusableMethods.waitFor(1);
        assertTrue(userManagementPage.firstNameOfMyUserOnViewPage.getText().contains(ConfigReader.getProperty("us21_firstname")));
    }

    @Then("Admin can see the {string} of that registered user")
    public void admin_can_see_the_of_that_registered_user(String string) {
        ReusableMethods.waitFor(1);
        assertTrue(userManagementPage.lastNameOfMyUserOnViewPage.isDisplayed());

    }
    @Then("verify lastName box contains valid last name of that user")
    public void verify_last_name_box_contains_valid_last_name_of_that_user() {
        ReusableMethods.waitFor(1);
        assertTrue(userManagementPage.lastNameOfMyUserOnViewPage.getText().contains(ConfigReader.getProperty("us21_lastname")));
    }

    @Then("{string} can seee {string} of that registered user")
    public void can_seee_of_that_registered_user(String string, String string2) {
        ReusableMethods.waitFor(1);
        assertTrue(userManagementPage.emailOfMyUserOnViewPage.isDisplayed());

    }
    @Then("verify email box contains valid email of that user")
    public void verify_email_box_contains_valid_email_of_that_user() {
        ReusableMethods.waitFor(1);
        assertTrue(userManagementPage.emailOfMyUserOnViewPage.getText().contains(ConfigReader.getProperty("us21_email")));
    }

    @And("Admin can see {string} for that user")
    public void adminCanSeeForThatUser(String arg0) {
        ReusableMethods.waitFor(1);
        assertTrue(userManagementPage.createdByForMyUserOnViewPage.isDisplayed());
    }
    @Then("verify createdBy box contains valid information for that user")
    public void verify_created_by_box_contains_valid_information_for_that_user() {
        ReusableMethods.waitFor(1);
        assertTrue(userManagementPage.createdByForMyUserOnViewPage.getText().contains("adminteam02"));

    }
    @And("{string} can see {string} for that user")
    public void canSeeForThatUser(String arg0, String arg1) {
        ReusableMethods.waitFor(1);
        assertTrue(userManagementPage.modifiedByForMyUserOnViewPage.isDisplayed());
    }
    @Then("verify modifiedBy box contains valid information for that user")
    public void verifyModifiedByBoxContainsValidInformationForThatUser() {
        ReusableMethods.waitFor(1);
        assertTrue(userManagementPage.modifiedByForMyUserOnViewPage.getText().contains("adminteam02"));
    }
    @And("{string} see {string} of that user")
    public void seeOfThatUser(String admin, String profile) {
        ReusableMethods.waitFor(1);
        assertTrue(userManagementPage.profile.isDisplayed());
    }

    @Then("{string} goes back to the user management page")
    public void goes_back_to_the_user_management_page(String string) {
        ReusableMethods.waitFor(1);
       JSUtils.clickElementByJS(userManagementPage.backButtonOnUserViewPage);
    }

    //        ******** Delete the registered user ***********

    @Then("{string} deletes that registered user")
    public void deletes_that_registered_user(String string) {
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(userManagementPage.myUserDeleteButton);
    }
    @And("{string} confirms the delete option")
    public void confirmsTheDeleteOption(String arg0) {
        ReusableMethods.waitFor(3);
        userManagementPage.confirmDeleteButton.click();
    }
    @Then("{string} verify that user is deleted")
    public void verify_that_user_is_deleted(String string) {
        ReusableMethods.waitFor(3);
        assertTrue(userManagementPage.deleteMessage.isDisplayed());
    }

    @And("{string} closes the app")
    public void closesTheApp(String arg0) {
        Driver.closeDriver();
    }

    //    ************ TC_02 Admin can assign patient role to the registered user and delete it  *************

    @When("{string} clicks on edit button of any registered user")
    public void clicks_on_edit_button_of_any_registered_user(String string) {
        ReusableMethods.waitFor(2);
        userManagementPage.myUserEditButton.click();
    }
//    @Then("{string} clicks on Activated checkbox")
//    public void clicks_on_activated_checkbox(String string) {
//        ReusableMethods.waitFor(2);
//        JSUtils.clickElementByJS(userManagementPage.activatedCheckBox);
//
//    }
    @Then("{string} selects {string} from profiles")
    public void selects_from_profiles(String admin, String profileRole) {
        JSUtils.scrollIntoViewJS(userManagementPage.userProfiles);
        Select select =new Select(userManagementPage.userProfiles);
        select.selectByValue(profileRole);
    }

    @Then("{string} sorts the page by ID descending order")
    public void sorts_the_page_by_id_descending_order(String admin) {
        ReusableMethods.waitFor(2);
       userManagementPage.sortById.click();
    }
    @Then("{string} verify user registration status is Activated")
    public void verify_user_registration_status_is_activated(String admin) {
        ReusableMethods.waitFor(2);
 //       assertEquals("Activated", userManagementPage.activatedBoxForMyUser.getText());

        List<WebElement> statusList = userManagementPage.statusList;
        String status = statusList.get(0).getText();
        Assert.assertEquals("Activated", status);
    }
    @Then("{string} verify user profile as {string}")
    public void verify_user_profile_as(String string, String profileRole) {
        ReusableMethods.waitFor(2);
        List<WebElement> profilesList = userManagementPage.profilesList;
        String profiles = profilesList.get(0).getText();
        System.out.println(profiles);
        assertEquals(profileRole, profiles);

    }



}
