package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.StaffPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class US23_TestItemsUpdated {

    StaffPage staffPage = new StaffPage();

    List<String> searchedSsnList = new ArrayList<>();
    String validSsn;
    String inValidSsn;
    String toBeUpdatedResult;
    String toBeUpdatedId;
    String toBeUpdatedDescription;
    int index ;


    @Then("Staff clicks on MY PAGES link")
    public void staff_clicks_on_my_pages_link() {
        staffPage.myPages.click();

    }
    @Then("Staff clicks on Search Patients link")
    public void staff_clicks_on_search_patients_link() {
        staffPage.searchPatient.click();
    }
    @Then("Staff verifies patients search input box is visible")
    public void staff_verifies_patients_search_input_box_is_visible() {
        ReusableMethods.waitFor(1);
        assertTrue(staffPage.searchPatientBySsn.isDisplayed());
    }
    @Then("Staff enters a valid SSN {string} into search input box")
    public void staff_enters_a_valid_ssn_into_search_input_box(String SSN) {
        validSsn = SSN;
        ReusableMethods.waitFor(2);
       staffPage.searchPatientBySsn.sendKeys(SSN);
    }
    @Then("Staff verifies the required ssn result is visible")
    public void staff_verifies_the_required_ssn_result_is_visible() {
        ReusableMethods.waitFor(2);
        for (WebElement eachSsn : staffPage.staffSearchedSsnList) {
            searchedSsnList.add(eachSsn.getText());
        }
        boolean flag = true;
        for (String eachSsn : searchedSsnList) {
            if (!eachSsn.contains(validSsn)) {
                flag = false;
                break;
            }
        }
//        System.out.println(searchedSsnList);
//        System.out.println(validSsn);
        assertTrue(flag);

    }

    @Then("Staff enters a invalid SSN {string} into search input box")
    public void staff_enters_a_invalid_ssn_into_search_input_box(String SSN) {
        inValidSsn = SSN;
        ReusableMethods.waitFor(2);
        staffPage.searchPatientBySsn.sendKeys(SSN);
    }
    @Then("Staff verifies that result do not match")
    public void staff_verifies_that_result_do_not_match() {
        ReusableMethods.waitFor(1);
        assertTrue(staffPage.staffSearchedSsnList.size()==0);

    }

    @Then("Staff clicks on Show appointments button for the first patient")
    public void staff_clicks_on_show_appointments_button_for_the_first_patient() {
        ReusableMethods.waitFor(1);
        staffPage.showAppointmentsLink.click();
    }
    @Then("Staff verify appointments page is visible")
    public void staff_verify_appointments_page_is_visible() {
        ReusableMethods.waitFor(1);
        assertTrue(staffPage.appointmentHeading.isDisplayed());
    }
    @Then("Staff clicks on Show tests button")
    public void staff_clicks_on_show_tests_button() {
        ReusableMethods.waitFor(1);
        staffPage.showTestsLink.click();
    }
    @Then("Staff verify tests page is visible")
    public void staff_verify_tests_page_is_visible() {
        ReusableMethods.waitFor(1);
        assertTrue(staffPage.testHeading.isDisplayed());
    }
    @Then("Staff clicks on test view result button")
    public void staff_clicks_on_test_view_result_button() {
        ReusableMethods.waitFor(1);
        staffPage.viewResultsLink.click();
    }
    @Then("Staff verify test results page is visible")
    public void staff_verify_test_results_page_is_visible() {
        ReusableMethods.waitFor(1);
        assertTrue(staffPage.testResultsHeading.isDisplayed());
    }
    @Then("Staff clicks on test edit button")
    public void staff_clicks_on_test_edit_button() {
        ReusableMethods.waitFor(1);
        staffPage.editResultsLink.click();
    }
    @Then("Staff verify test result update page is visible")
    public void staff_verify_test_result_update_page_is_visible() {
        ReusableMethods.waitFor(1);
        assertTrue(staffPage.editResultsHeading.isDisplayed());
    }
    @Then("Staff enters a number {string} into result input box")
    public void staff_enters_a_number_into_result_input_box(String result) {
        toBeUpdatedResult=result;
        ReusableMethods.waitFor(1);
        staffPage.resultInput.clear();
        ReusableMethods.waitFor(1);
        staffPage.resultInput.sendKeys(toBeUpdatedResult);

        //System.out.println(JSUtils.getValueByJS(staffPage.resultInput.toString()));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        toBeUpdatedId = js.executeScript("return document.getElementById('c-test-result-id').value").toString();
        System.out.println(toBeUpdatedId);
    }
    @Then("Staff clicks on Save button")
    public void staff_clicks_on_save_button() {
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(staffPage.saveButton);
    }

    @Then("Staff verify the test result is updated message comes up")
    public void staff_verify_the_test_result_is_updated_message_comes_up() {
        ReusableMethods.waitFor(1);
        assertTrue(staffPage.confirmationMessage.isDisplayed());
    }

    @Then("Staff verify the test result is updated")
    public void staff_verify_the_test_result_is_updated() {
        ReusableMethods.waitFor(1);

        List<WebElement> resultsList = staffPage.updatedResultsList;

        for (int i = 0; i < resultsList.size(); i++) {
            if (resultsList.get(i).getText().equals(toBeUpdatedId)) {
                index = i + 1;
                break;
            }
        }
        System.out.println("id: " + toBeUpdatedId);
        System.out.println(resultsList.get(0).getText());
        System.out.println("index: " + index);
        ReusableMethods.waitFor(2);
        String result = Driver.getDriver().findElement(By.xpath("//tbody//tr[" + index + "]//td[3]")).getText();
        System.out.println(result);

        assertTrue(toBeUpdatedResult.equals(result));

    }

}
