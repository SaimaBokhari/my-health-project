package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.Then;
import pages.AdminPage;

public class AdminPageStepDefs {
    AdminPage adminPage = new AdminPage();

    @Then("Admin clicks administration dropdown")
    public void admin_clicks_administration_dropdown() {
        adminPage.adminMenuDropDown.click();
    }
    @Then("Admin click user management button")
    public void admin_click_user_management_button() {
        adminPage.userManagement.click();
    }
}
