package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.UserManagementPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.List;

public class UserManagementStepDefs {
    UserManagementPage userMan = new UserManagementPage();

    @Then("Admin sort page by ID descending order")
    public void admin_sort_page_by_id_descending_order() {
        userMan.sortById.click();
        ReusableMethods.waitFor(2);
    }


    @Then("Admin click edit button of last registered user")
    public void admin_click_edit_button_of_last_registered_user() {
        List<WebElement> usersEditButtonList = userMan.usersEditButtonList;
        usersEditButtonList.get(0).click();
    }

    @Then("Admin click Activated checkbox")
    public void admin_click_activated_checkbox() {
        JSUtils.scrollDownByJS();
        ReusableMethods.waitFor(2);
        userMan.activatedCheckBox.click();

    }
    @Then("Admin select {string} from profiles")
    public void admin_select_from_profiles(String string) {
        Select select =new Select(userMan.userProfiles);
        select.selectByValue(string);
    }
    @Then("Admin click save button")
    public void admin_click_save_button() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(userMan.saveButton);
        ReusableMethods.waitFor(2);

    }
    @Then("Admin verify user registration status Activated")
    public void admin_verify_user_registration_status_activated() {
        List<WebElement> statusList = userMan.statusList;
        String status = statusList.get(0).getText();
        Assert.assertEquals("Activated", status);
    }
    @Then("Admin verify user profiles {string}")
    public void admin_verify_user_profiles(String string) {
        List<WebElement> profilesList = userMan.profilesList;
        String profiles = profilesList.get(0).getText();
        Assert.assertEquals(string, profiles);

    }

}
