package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianPage {
    public PhysicianPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Create a new Physician']")
    public WebElement createPhysician;

    @FindBy(id = "useSSNSearch")
    public WebElement ssnCheckBox;

    @FindBy(id = "searchSSN")
    public WebElement searchSSN;

    @FindBy(xpath = "//button[.='Search User']")
    public WebElement searchButton;

    @FindBy(id = "physician-firstName")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='physician-firstName']")
    public WebElement firstnameForEdit;

    @FindBy(id = "physician-lastName")
    public WebElement lastname;

    @FindBy(id = "physician1-birthDate")
    public WebElement birthdate;

    @FindBy(id = "physician-phone")
    public WebElement phone;

    @FindBy(id = "physician-speciality")
    public WebElement speciality;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement file_image;

    @FindBy(id = "physician-examFee")
    public WebElement examFee;

    @FindBy(id = "physician-user")
    public WebElement physician_user;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButtonForEdit;
    //------------------------------------------------------
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement pageFirstname;

    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public WebElement pageLastname;

    @FindBy(xpath = "//tbody/tr[1]/td[5]")
    public WebElement pageBirthdate;

    @FindBy(xpath = "//tbody/tr[1]/td[10]")
    public WebElement pageSpeciality;

    @FindBy(xpath = "//tbody/tr[1]/td[11]")
    public WebElement pageExamFee;

    @FindBy(xpath = "//tbody/tr[1]/td[14]/div")
    public WebElement pageFileImage;

    @FindBy(xpath = "//tbody/tr[1]/td[15]")
    public WebElement pageUser;

    @FindBy(xpath = "//tbody/tr[1]/td[18]/div/a[1]")
    public WebElement firstViewButton;

    @FindBy(xpath = "//tbody/tr[1]/td[18]/div/a[2]")
    public WebElement firstEditButton;

    @FindBy(xpath = "//tbody/tr[1]/td[18]/div/a[3]")
    public WebElement firstDeleteButton;

    @FindBy(id = "jhi-confirm-delete-physician")
    public WebElement deleteConfirmButton;

    @FindBy(xpath = "//div[contains(text(),'A Physician is deleted with identifier')]")
    public WebElement deleteConfirmMessage;

    //-------------------------------------------------------------
    @FindBy(xpath = "//div[@class='info jhi-item-count']/span")
    public WebElement physicianCount;





}
