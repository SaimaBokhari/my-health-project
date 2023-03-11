package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AppointmentUpdatePage {

    public AppointmentUpdatePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath="//span[.='MY PAGES']")
    public WebElement myPages;

    @FindBy(xpath="//span[.='Search Patient']")
    public WebElement searchPateint;

    @FindBy(xpath="//input[@name='ssn']")
    public WebElement ssn;

    @FindBy(xpath="(//span[.='Show Appointments'])[2]")
    public WebElement showAppointments;

    @FindBy(xpath="//*[@class='btn btn-warning btn-sm']")
    public WebElement editButton;

    @FindBy(xpath="//input[@name='startDate']")
    public WebElement appointmentStartDate;

    @FindBy(xpath="//input[@name='endDate']")
    public WebElement appointmentEndDate;

    @FindBy(id="save-entity")
    public WebElement saveButton;

    @FindBy(xpath="//div[@role='alert']")
    public WebElement successMessage;


}
