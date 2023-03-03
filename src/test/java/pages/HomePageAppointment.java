package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePageAppointment {

    public HomePageAppointment() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="firstName")
    public WebElement firstname;

    @FindBy(id ="lastName" )
    public WebElement lastname;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(xpath = "//div[normalize-space()='Your FirstName is required.']")
    public WebElement firstnameRequired;

    @FindBy(xpath = "//div[normalize-space()='Your LastName is required.']")
    public WebElement lastnameRequired;

    @FindBy(xpath = "//div[normalize-space()='Your SSN is required.']")
    public WebElement SSNRequired;

    @FindBy(xpath = "//div[normalize-space()='Your SSN is invalid']")
    public WebElement SSNinvalid;

    @FindBy(xpath = "//div[normalize-space()='Your email is required.']")
    public WebElement emailRequired;

    @FindBy(xpath = "//div[normalize-space()='This field is invalid']")
    public WebElement emailInvalid;

    @FindBy(xpath = "//div[normalize-space()='Phone number is required.']")
    public WebElement phoneRequired;

    @FindBy(xpath = "//div[normalize-space()='Phone number is invalid']")
    public WebElement phoneInvalid;

    @FindBy(xpath = "//span[normalize-space()='Send an Appointment Request']")
    public WebElement sendAppointmentButton;

    @FindBy(xpath = "//*[contains(text(),'Appointment registration saved')]")
    public WebElement successMessageToastContainer;

    @FindBy(xpath = "//*[@class='is-touched is-dirty av-valid from-control']")
    public WebElement verifyValid;

//    ===============================================

    @FindBy(xpath = "//span[normalize-space()='MY PAGES(PATIENT)']")
    public WebElement myPagesButton;

    @FindBy(xpath = "//span[normalize-space()='My Appointments']")
    public WebElement myAppointmentsButton;

    @FindBy(id = "appointment-heading")
    public WebElement appointmentTitle;

    @FindBy(xpath = "//h2[text()='Make an Appointment']")
    public WebElement makeappointmentTitleinPortal;

    @FindBy(id = "fromDate")
    public WebElement fromDate;

    @FindBy(id = "toDate")
    public WebElement toDate;

    @FindBy(xpath = "//table/tbody/tr/td[3]")
    public WebElement startDataTime;

    @FindBy(xpath = "//span[text()='Make an Appointment']")
    public WebElement makeanAppointmentButton;

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointmentButton;



}
