package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
public class StaffPage {

    public StaffPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Create a new user']")
    public WebElement createNewUserLink;

    @FindBy(linkText = "Create a new Staff")
    public WebElement createNewStaffButtonLinktext;

    @FindBy(xpath = "//span[.='Items&Titles']")
    public WebElement itemsAndTitlesLink;

    @FindBy(xpath = "//span[.='Staff']")
    public WebElement staffLink;

    @FindBy(id = "useSSNSearch")
    public WebElement userSearchCheckbox;

    @FindBy(id = "searchSSN")
    public WebElement userSearchBox;

    @FindBy(xpath = "//button[.='Search User']")
    public WebElement searchUserButton;


    //  **************** STAFF SEARCH by SSN
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameFieldStaff;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameFieldStaff;
    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement staffBDayFieldStaff;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement staffPhoneField;
    @FindBy(id = "staff-gender")
    public WebElement staffGenderField;
    @FindBy(id = "staff-bloodGroup")
    public WebElement staffBloodGroupField;
    @FindBy(id = "staff-adress")
    public WebElement staffAddressField;
    @FindBy(id = "staff-description")
    public WebElement staffDescriptionField;
    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement staffCreatedDate;
    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement staffUserField;
    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement staffCountryField;
    @FindBy(xpath="//select[@name='cstate.id']")
    public WebElement staffCstateField;
    @FindBy(id = "save-entity")
    public WebElement saveSubmitButton;
    @FindBy(xpath = "//span[.='Created date']")
    public WebElement createdDateUserMan;
    @FindBy(xpath= "//tbody/tr/td[3]")
    public WebElement ssnListInUserManagment;   /// *** USER MANAGEMENT PAGE
    @FindBy(xpath = "//div[.='User found with search SSN']")
    public WebElement toesterContainerMessageSearch;
    @FindBy(xpath = "//div[.='A user is updated with identifier emmateam02']")
    public WebElement toesterContainerMessageEdit;

// @FindBy(xpath = "//*[contains(text(),'Adele01-staff')]")
// public WebElement firstNameValue;

    @FindBy(xpath = "(//div[@class='form-group'])[4]//input[@value='Adele01-staff']")
    public WebElement firstNameValue;
    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> loginlist ;

    // ********************* CREATE OR EDIT USER ====> User management

    @FindBy(id = "login")
    public WebElement loginField;
    @FindBy(id = "firstName")
    public WebElement firstnameField;
    @FindBy(id = "lastName")
    public WebElement lastnameField;
    @FindBy(id = "staff-birthDate")
    public WebElement staffBirthDateField;
    @FindBy(id = "email")
    public WebElement emailField;
    @FindBy(id = "ssn")
    public WebElement ssnField;
    @FindBy(id = "langKey")  //select
    public WebElement langKeyField;
    @FindBy(id = "authorities")  // select
    public WebElement authoritiesField;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveSubmitButtonUserMan;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement toesterContMssgCreation;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement toesterContMssgUpdate;


    /// **************************** DELETE USER'S ACCOUNT **********
    @FindBy(xpath = "//span[.='Confirm delete operation']")
    public WebElement confirmDeleteMssg;
    @FindBy(xpath = "(//span[.='Delete'])[7]")
    public WebElement deleteRedButton;

    // (//*[contains(text(),'Delete')])[21]    (//span[.='Delete'])[10]
    @FindBy(xpath = "(//*[contains(text(),'Delete')])[21]")
    public WebElement deleteButtonPopUp;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement toesterContMssgDelete;
    @FindBy(xpath = "(//span[.='Delete'])[10]")
    public WebElement deleteRedButton1;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement toesterContMssgEdit;


// *********************** ADMIN SELECTS/VIEWS USER'S ACCOUNT  ************

    @FindBy(xpath = "//tr[@id='etta-team02']/td[11]/div/a[1]")
    public WebElement myUserViewButton;
    @FindBy(xpath = "//tr[@id='etta-team02']")
    public WebElement myUser;
    @FindBy(xpath = "//tr[@id='etta-team02']/td[11]/div/a[2]")
    public WebElement myUserEditButton;
    @FindBy(xpath = "//tr[@id='etta-team02']/td[11]/div/a[3]")
    public WebElement myUserDeleteButton;
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnFieldEdit;
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement newSsnFieldEdit;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveSumitButtonEdit;

    // ****************** xsxss USER DELETE
    @FindBy(xpath = "//tr[@id='xsxss']")
    public WebElement myUser1;
    @FindBy(xpath = "//tr[@id='xsxss']/td[11]/div/a[3]")
    public WebElement myUser1Delete;

    // *********** MY USERS THAT CAN BE DELETED
    //  sdsdvv
    //etta-team02


    // *********** US_23 WebElements ****************

    @FindBy(id = "entity-menu")
    public WebElement myPages;

    @FindBy(xpath = "//span[.='Search Patient']")
    public WebElement searchPatient;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement searchPatientBySsn;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> staffSearchedSsnList;

    @FindBy(xpath = "//span[.='Show Appointments']")
    public WebElement showAppointmentsLink;

    @FindBy(xpath = "//span[.='Show Appointments']")
    public List<WebElement> showAppointmentsList;

    @FindBy(id = "appointment-heading")
    public WebElement appointmentHeading;

    @FindBy(xpath = "//span[.='Show Tests']")
    public WebElement showTestsLink;

    @FindBy(xpath = "//span[.='Tests']")
    public WebElement testHeading;

    @FindBy(xpath = "//span[.='View Results']")
    public WebElement viewResultsLink;

    @FindBy(xpath = "//span[.='Test Results']")
    public WebElement testResultsHeading;

    @FindBy(xpath = "//span[.='Edit']")
    public WebElement editResultsLink;
    @FindBy(xpath = "//span[.='Create or edit a Test Result']")
    public WebElement editResultsHeading;

    @FindBy(id = "c-test-result-result")
    public WebElement resultInput;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement confirmationMessage;

    @FindBy(xpath = "//tbody//tr//td[3]")
    public List<WebElement> updatedResultsList;

    @FindBy(id = "c-test-result-description")
    public WebElement descriptionInput;

    @FindBy(id = "c-test-result-id")
    public WebElement idOfTest;

    @FindBy(id = "c-test-result-date")
    public WebElement dateOfTest;

    @FindBy(id = "c-test-result-createdDate")
    public WebElement createdDateOfTest;

    @FindBy(id = "c-test-result-cTestItem")
    public WebElement testItemOfTest;

    @FindBy(id = "c-test-result-cTest")
    public WebElement testIdOfTest;




}
