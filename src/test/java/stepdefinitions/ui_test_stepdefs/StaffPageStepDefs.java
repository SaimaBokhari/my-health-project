package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.StaffPage;
import utilities.JSUtils;
import utilities.ReusableMethods;
import static org.junit.Assert.*;

public class StaffPageStepDefs {

    StaffPage staffPage = new StaffPage();

    @Then("Admin clicks on Items&Titles dropdown")
    public void admin_clicks_on_items_titles_dropdown() {
        ReusableMethods.waitFor(2);
        staffPage.itemsAndTitlesLink.click();
    }

    @Then("Admin clicks on Staff from the dropdown")
    public void admin_clicks_on_staff_from_the_dropdown() {
        ReusableMethods.waitFor(2);
        staffPage.staffLink.click();
    }

    @Then("Admin clicks on Create A New Staff Button")
    public void admin_clicks_on_create_a_new_staff_button() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(staffPage.createNewStaffButtonLinktext);
    }

    @Then("Admin clicks on User Search checkbox")
    public void admin_clicks_on_user_search_checkbox() {
        ReusableMethods.waitFor(2);
        staffPage.userSearchCheckbox.click();
    }

    @Then("Admin clicks on Search User button")
    public void admin_clicks_on_search_user_button() {
        ReusableMethods.waitFor(2);
        staffPage.searchUserButton.click();
    }

    @And("Admin sorts page by created date")
    public void adminSortsPageByCreatedDate() {
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(staffPage.createdDateUserMan);
    }

    @And("Admin types {string} into SSN field in New Staff Page")
    public void adminTypesIntoSSNFieldInNewStaffPage(String string) {
        ReusableMethods.waitFor(2);
        staffPage.userSearchBox.sendKeys(string);
    }

    @Then("Verify that message User found with search SSN pops up")
    public void verifyThatMessageUserFoundWithSearchSSNPopsUp() {
        ReusableMethods.waitFor(2);
        assertTrue(staffPage.toesterContainerMessageSearch.isDisplayed());
    }


//  ******************* SEARCH BY SSN AND INFO POPULATED

    @And("Verify that firstname field is populated")
    public void verifyThatFirstnameFieldIsPopulated() {
        String actualName = staffPage.firstNameFieldStaff.getAttribute("value");
        assertFalse(actualName.isEmpty());
    }
    @Then("Verify that lastname field is populated")
    public void verify_that_lastname_field_is_populated() {
        JSUtils.scrollDownByJS();
        ReusableMethods.waitFor(2);
        String actualLastname = staffPage.lastNameFieldStaff.getAttribute("value");
        assertFalse(actualLastname.isEmpty());
    }
    @Then("Verify that birth date field is populated")
    public void verify_that_birth_date_field_is_populated() {
        String actualBdate = staffPage.staffBDayFieldStaff.getAttribute("value");
        assertFalse(actualBdate.isEmpty());
    }
    @Then("Verify that phone field is populated")
    public void verify_that_phone_field_is_populated() {
        String actualPhone = staffPage.staffPhoneField.getAttribute("value");
        ReusableMethods.waitFor(2);
        if (actualPhone.isEmpty()) {
            staffPage.staffPhoneField.sendKeys("1234567890");
        } else {
            assertFalse(actualPhone.isEmpty());

        }
    }
    @Then("Verify that gender field is populated")
    public void verify_that_gender_field_is_populated() {
        ReusableMethods.waitFor(2);
        String actualGender = staffPage.staffGenderField.getAttribute("value");
        assertFalse(actualGender.isEmpty());

    }
    @Then("Verify that blood group field is populated")
    public void verify_that_blood_group_field_is_populated() {
        ReusableMethods.waitFor(2);
        String actualBloodGroup = staffPage.staffBloodGroupField.getAttribute("value");
        assertFalse(actualBloodGroup.isEmpty());
    }

    @Then("Verify that address field is populated")
    public void verify_that_address_field_is_populated() {
        ReusableMethods.waitFor(2);
        String actualAddress = staffPage.staffAddressField.getAttribute("value");
        if(actualAddress.isEmpty()){
            staffPage.staffAddressField.sendKeys("London");
        }else{
            assertFalse(actualAddress.isEmpty());
        }
    }
    @Then("Verify that description field is populated")
    public void verify_that_description_field_is_populated() {
        ReusableMethods.waitFor(2);
        String actualDescription = staffPage.staffDescriptionField.getAttribute("value");
        if (actualDescription.isEmpty()) {
            staffPage.staffDescriptionField.sendKeys("hastalik");
        } else {
            assertFalse(actualDescription.isEmpty());
        }
    }
    @Then("Verify that created date field is populated")
    public void verify_that_created_date_field_is_populated() {
        ReusableMethods.waitFor(2);
        String actualCreatedDate = staffPage.staffCreatedDate.getAttribute("value");
        assertFalse(actualCreatedDate.isEmpty());
    }

    @Then("Verify that user field is populated")
    public void verify_that_user_field_is_populated() {
        ReusableMethods.waitFor(2);
        String actualUser = staffPage.staffUserField.getAttribute("value");
        assertFalse(actualUser.isEmpty());
    }

    @Then("Verify that country field is populated")
    public void verify_that_country_field_is_populated() {
        ReusableMethods.waitFor(2);
        String actualCountry = staffPage.staffCountryField.getAttribute("value");

        if (actualCountry.isEmpty()) {
            staffPage.staffCountryField.sendKeys("England");
        }else{
            assertFalse(actualCountry.isEmpty());
        }
    }

    @Then("Verify that state_city field is populated")
    public void verify_that_state_city_field_is_populated() {
        ReusableMethods.waitFor(2);
        String actualCityState = staffPage.staffCstateField.getAttribute("value");
        if (actualCityState.isEmpty()) {
            staffPage.staffCstateField.sendKeys("London");
        } else {
            assertFalse(actualCityState.isEmpty());
        }
    }


    // *********************  CREATING A NEW STAFF BY ADMIN
    @And("Admin enters login {string}")
    public void adminEntersLogin(String string) {
        ReusableMethods.waitFor(2);
        staffPage.loginField.sendKeys(string);
    }

    @And("Admin enters the firstname {string}")
    public void adminEntersTheFirstname(String string) {
        ReusableMethods.waitFor(2);
        staffPage.firstnameField.sendKeys(string);
    }

    @And("Admin enters the lastname {string}")
    public void adminEntersTheLastname(String string) {
        ReusableMethods.waitFor(2);
        staffPage.lastnameField.sendKeys(string + Keys.ENTER);
    }

    @And("Admin enters the email  {string}")
    public void adminEntersTheEmail(String string) {
        ReusableMethods.waitFor(2);
        staffPage.emailField.sendKeys(string);
    }

    @And("Admin enters the SSN {string}")
    public void adminEntersTheSSN(String string) {
        ReusableMethods.waitFor(2);
        staffPage.ssnField.sendKeys(string);
    }

    @And("Admin selects the language from the drop down")
    public void adminSelectsTheLanguageFromTheDropDown() {
        ReusableMethods.waitFor(2);
        WebElement language = staffPage.langKeyField;
        Select select = new Select(language);
        select.selectByVisibleText("English");
    }

    @And("Admin clicks on the Save Button")
    public void adminClicksOnTheSaveButton() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(staffPage.saveSumitButtonEdit);
    }

    @Then("Verify that success message New User is Created pops up")
    public void verifyThatSuccessMessageNewUserIsCreatedPopsUp() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(staffPage.toesterContMssgCreation.isDisplayed());
    }

    ///  ************ DELETING the Staff by Admin


    @And("Admin clicks on the delete button")
    public void adminClicksOnTheDeleteButton() {
        ReusableMethods.waitFor(2);
        staffPage.myUser1Delete.click();
    }

    @Then("Admin selects a {string} to be deleted")
    public void admin_selects_a_to_be_deleted(String login) {
        String actualLogin = staffPage.myUser1.getText();
        System.out.println(actualLogin);
        assertTrue(actualLogin.contains(login));
    }

    @Then("Admin clicks on delete button")
    public void admin_clicks_on_delete_button() {
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(staffPage.deleteRedButton1);
    }
    @Then("Admin clicks on delete pop up button")
    public void admin_clicks_on_delete_pop_up_button() {
        ReusableMethods.waitFor(3);
        staffPage.deleteButtonPopUp.click();
    }

    @Then("Verify that message delete is successful appears")
    public void verifyThatMessageDeleteIsSuccessfulAppears() {
        ReusableMethods.waitFor(3);
        assertTrue(staffPage.toesterContMssgDelete.isDisplayed());
    }
    @And("Verify that confirm delete opp pop up appears")
    public void verifyThatConfirmDeleteOppPopUpAppears() {
        ReusableMethods.waitFor(3);
        assertTrue(staffPage.confirmDeleteMssg.isDisplayed());
    }
    @And("Admin clicks on Create a new user link")
    public void adminClicksOnCreateANewUserLink() {
        staffPage.createNewUserLink.click();
    }

//   ******************* ADMIN SELECTS/VIEW USER'S ACCOUNT

    @Then("Admin selects a {string} of registered user")
    public void admin_selects_for_a_of_registered_user(String string) {
        ReusableMethods.waitFor(3);
        String actualLogin = staffPage.myUser.getText();
        System.out.println(actualLogin);
        ReusableMethods.waitFor(3);
        assertTrue(actualLogin.contains(string));
    }
    @Then("Admin clicks on the view button to see user's account")
    public void admin_clicks_on_the_view_button_to_see_user_s_account() {
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(staffPage.myUserViewButton);
    }
    //********************** EDIT
    @And("Admin clicks on the edit button to see user's account")
    public void adminClicksOnTheEditButtonToSeeUserSAccount() {
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(staffPage.myUserEditButton);

    }
    @And("Admin types {string} into SSN field in Edit Page")
    public void adminTypesIntoSSNFieldInEditPage(String ssn) {
        ReusableMethods.waitFor(2);
        staffPage.ssnFieldEdit.clear();
        staffPage.ssnFieldEdit.sendKeys(ssn);
    }
    @Then("Verify that new SSN number of the user is {string}")
    public void verifyThatNewSSNNumberOfTheUserIs(String ssn) {
        ReusableMethods.waitFor(3);
        String actualLogin = staffPage.myUser.getText();
        System.out.println(actualLogin);

        ReusableMethods.waitFor(3);
        assertTrue(actualLogin.contains(ssn));
    }

}
