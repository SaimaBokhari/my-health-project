package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianInfoPage {

    public PhysicianInfoPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[.='Edit'])[1]")
    public WebElement editSection;

    @FindBy(xpath = "//*[.='Show Test Results']")
    public WebElement showTestResults;

    @FindBy(xpath = "//*[.='View Results']")
    public WebElement viewResults;

    @FindBy(xpath = "(//*[.='Test Results'])[2]")
    public WebElement testResults;

    @FindBy(xpath = "//*[.='ID']")
    public WebElement idSection;

    @FindBy(xpath = "//*[.='Name']")
    public WebElement nameSection;

    @FindBy(xpath = "//*[.='Result']")
    public WebElement resultSection;

    @FindBy(xpath = "//*[.='Default Min. Value']")
    public WebElement defMinValSection;

    @FindBy(xpath = "//*[.='Default Max. Value']")
    public WebElement defMaxValSection;

    @FindBy(xpath = "//*[.='Test']")
    public WebElement testSection;

    @FindBy(xpath = "//*[.='Description']")
    public WebElement descriptionSection;

    @FindBy(xpath = "//*[.='Date']")
    public WebElement dateSection;

    @FindBy(xpath = "//*[.='Request Inpatient']")
    public WebElement requestInpatient;

    @FindBy(id = "appointment-anamnesis")
    public WebElement anamnesisSection;

    @FindBy(id = "appointment-treatment")
    public WebElement treatmentSection;

    @FindBy(id = "appointment-diagnosis")
    public WebElement diagnosisSection;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "(//*[.='3604'])[1]")
    public WebElement appointmentNumber;

    @FindBy(xpath = "(//*[.='ID'])[3]")
    public WebElement inpatientIdSection;

    @FindBy(id = "startDateLabel")
    public WebElement startDateSection;

    @FindBy(id = "endDateLabel")
    public WebElement endDateSection;

    @FindBy(id = "descriptionLabel")
    public WebElement descriptSection;

    @FindBy(id = "createdDateLabel")
    public WebElement createdDateSection;

    @FindBy(xpath = "(//*[.='Appointment'])[2]")
    public WebElement appointmentSection;

    @FindBy(id = "statusLabel")
    public WebElement statusSection;

    @FindBy(xpath = "(//*[.='Room'])[2]")
    public WebElement roomSection;

    @FindBy(xpath = "(//*[.='Patient'])[2]")
    public WebElement patientSection;

    @FindBy(id = "in-patient-status")
    public WebElement status;

    @FindBy(xpath = "//*[.='Save']")
    public WebElement saveSubmitButton;

    @FindBy(xpath = "//*[.='InPatient status was updated successfully']")
    public WebElement successMessage;

    @FindBy(id = "in-patient-room")
    public WebElement room;
}
