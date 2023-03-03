package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.DoctorPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US13_StepDefinitions {
    HomePage homePage = new HomePage();
    DoctorPage doctorPage = new DoctorPage();


    @When("{string} goes home pagee")
    public void goes_home_pagee(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @Then("{string} clicks on the menu dropdown")
    public void clicks_on_the_menu_dropdown (String string){
        homePage.menuIcon.click();

    }

        @Then("{string} clicks on the Sign in button")
        public void clicks_on_the_sign_in_button (String string){
            homePage.signInOptionButton.click();
        }


        @Then("{string} enters {string} in username fields")
        public void enters_in_username_fields (String string, String username){
            homePage.usernameInput.sendKeys(username);
        }


        @Then("{string} enters {string} in password fields")
        public void enters_in_password_fields (String string, String password){
            homePage.passwordInput.sendKeys(password);
        }


        @Then("{string} clicks on Sign in button")
        public void clicks_on_sign_in_button (String string){
            homePage.signInButton.click();

        }

        @When("{string} clicks on my pages option")
        public void clicks_on_my_pages_option (String string){
            doctorPage.myPagesOption.click();
        }

        @Then("{string} clicks on my appointments icon")
        public void clicks_on_my_appointments_icon (String string){
            doctorPage.myAppointmentIcon.click();
        }

        @Then("{string} clicks on edit button;")
        public void clicks_on_edit_button (String string){
            doctorPage.editButton.click();
        }

        @Then("{string} clicks on request a test button")
        public void clicks_on_request_a_test_button (String string){
            ReusableMethods.waitFor(1);
            JSUtils.clickElementByJS(doctorPage.requestATestButton);

        }


        @Then("{string} should see items as checkmark {string}")
        public void should_see_items_as_checkmark (String string, String itemName){
            for (int i = 1; i < 12; i++) {
                if (Driver.getDriver().findElement(By.xpath("//tr[" + i + "]//td[2]")).getText().equals(itemName)) {
                    Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + i + "]//td[9]")).isEnabled());
                }
            }
        }
        @Then("{string} should verify the request is success")
        public void should_verify_the_request_is_success (String string){
            doctorPage.isTestSuccess.isDisplayed();
        }
}

