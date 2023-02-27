package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
import java.util.Random;

public class MyAppointmentsPage {
    public MyAppointmentsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "appointment-heading")
    public WebElement appointmentHeading;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public List<WebElement> editButtonList;

    @FindBy(xpath = "//tbody//td[13]")
    public WebElement firstEditButton;

    @FindBy(xpath = "//tbody/tr[2]/td[13]")
    public WebElement secondEditButton;

    @FindBy(xpath = "//tbody/tr[3]/td[13]")
    public WebElement thirdEditButton;

    @FindBy(id = "hospitalmsappfrontendApp.appointment.home.createOrEditLabel")
    public WebElement createOrEditHeader;

    @FindBy(name = "id")
    public WebElement id;

    @FindBy(name = "startDate")
    public WebElement startDate;

    @FindBy(name = "endDate")
    public WebElement endDate;

    @FindBy(id = "appointment-physician")
    public WebElement physician;

    @FindBy(id = "appointment-status")
    public WebElement status;

    @FindBy(name = "anamnesis")
    public WebElement anamnesis;

    @FindBy(name = "treatment")
    public WebElement treatment;

    @FindBy(name = "diagnosis")
    public WebElement diagnosis;

    @FindBy(id = "appointment-prescription")
    public WebElement prescription;

    @FindBy(id = "appointment-description")
    public WebElement description;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement requiredFieldMessage;

    @FindBy(xpath = "//option[@value='PENDING']")
    public WebElement pending;

    @FindBy(xpath = "//option[@value='COMPLETED']")
    public WebElement completed;

    @FindBy(xpath = "//option[@value='CANCELLED']")
    public WebElement cancelled;

    @FindBy(xpath = "//option[@value='UNAPPROVED']")
    public WebElement unapproved;
}
