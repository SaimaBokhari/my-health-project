package stepdefinitions.ui_test_stepdefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.DoctorPage;
import utilities.Driver;

public class US11_StepDefsB {
    DoctorPage doctorPage = new DoctorPage();
    @Then("{string} can see the appointment lists")
    public void can_see_the_appointment_lists(String string) {
        Assert.assertTrue(doctorPage.ids.isDisplayed());
    }
    @Then("{string} can see the appointment time slots")
    public void can_see_the_appointment_time_slots(String string) {
        Assert.assertTrue(doctorPage.fromDate.isDisplayed());
        Assert.assertTrue(doctorPage.toDate.isDisplayed());
    }
    @Then("{string} can see the Information")
    public void can_see_the(String string) {
        int count =0;
        for (int i = 1;i<5;i++){
            for (int k =1;k<5;k++){
                if (Driver.getDriver().findElement(By.xpath("//tr["+k+"]//td["+i+"]")).isDisplayed()){
                    count++;
                }
            }
        }
        Assert.assertEquals(16, count);
    }

}
