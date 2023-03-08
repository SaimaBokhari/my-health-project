package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class UserManagementPage {
    public UserManagementPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@class='pagination']/li")
    public List<WebElement> pageNumbers;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public List<WebElement> usersEditButtonList;

    @FindBy(id = "activated")
    public WebElement activatedCheckBox;

    @FindBy(id = "authorities")
    public WebElement userProfiles;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//tbody/tr/td[5]/button/span")
    public List<WebElement> statusList;

    @FindBy(xpath = "//tbody/tr/td[7]/div/span")
    public List<WebElement> profilesList;

    @FindBy(xpath = "//span[.='ID']")
    public WebElement sortById;

    // US_21 WebElements

    @FindBy(xpath = "//span[.='Create a new user']")
    public WebElement createNewUser;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement userNameForNewUser;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameForNewUser;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameForNewUser;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailForNewUser;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnForNewUser;

    @FindBy(xpath = "//span[.='Back']")
    public WebElement backButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement successMessageForNewUser;

    @FindBy(xpath = "//td[1]/a")
    public WebElement id;

    @FindBy(xpath = "//tbody//td[1]")
    public List<WebElement> idList;

    @FindBy(xpath = "//tbody//td[2]")
    public List<WebElement> loginList;

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
    public List<WebElement> usersViewButtonList;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public List<WebElement> usersDeleteButtonList;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement deleteMessage;

    @FindBy(xpath = "//a[@aria-label='Previous']")
    public WebElement previousPage;

    @FindBy(xpath = "//tr[@id='lily_team02']/td[11]/div/a[1]")
    public WebElement myUserViewButton;

//    @FindBy(xpath = "//tr[@id='"+ ConfigReader.getProperty() +"']/td[11]/div/a[1]")
//    public WebElement myUserViewButton1;

    @FindBy(xpath = "//tr[@id='lily_team02']/td[11]/div/a[2]")
    public WebElement myUserEditButton;

    @FindBy(xpath = "//tr[@id='lily_team02']/td[11]/div/a[3]")
    public WebElement myUserDeleteButton;

    @FindBy(xpath = "(//span[.='Delete'])[41]")
    public WebElement confirmDeleteButton;

    @FindBy(xpath = "//tr[@id='lily_team02']/td[5]")
    public WebElement activatedBoxForMyUser;




    // Details of MY USER on View Page

    @FindBy(xpath = "//span[.='lily_team02']")
    public WebElement loginOfMyUserOnViewPage;

    @FindBy(xpath = "//dd[text()='Lily']")
    public WebElement firstNameOfMyUserOnViewPage;

    @FindBy(xpath = "//dd[text()='Brown']")
    public WebElement lastNameOfMyUserOnViewPage;

    @FindBy(xpath = "//dd[text()='lily_brown@gmail.com']")
    public WebElement emailOfMyUserOnViewPage;

    @FindBy(xpath = "//dd[text()='English']")
    public WebElement languageOfMyUserOnViewPage;

    @FindBy(xpath = "//dd[text()='adminteam02']")
    public WebElement createdByForMyUserOnViewPage;

    @FindBy(xpath = "//dd[text()='adminteam02']")
    public WebElement modifiedByForMyUserOnViewPage;

    @FindBy(xpath = "//span[.='Profiles']")
    public WebElement profile;

    @FindBy(xpath = "//ul/li[.='ROLE_STAFF']")
    public WebElement roleStaffUserOnViewPage;

    @FindBy(xpath = "//ul/li[.='ROLE_PATIENT']")
    public WebElement rolePatientUserOnViewPage;

    @FindBy(xpath = "//ul/li[.='ROLE_ADMIN']")
    public WebElement roleAdminUserOnViewPage;

    @FindBy(xpath = "//ul/li[.='ROLE_USER']")
    public WebElement roleUserOnViewPage;

    @FindBy(xpath = "//span[text()='Back']")
    public WebElement backButtonOnUserViewPage;

    @FindBy(xpath = "//a[text()='»»']")
    public WebElement lastPageOnUserManagementPage;

    @FindBy(xpath = "//a[@aria-label='Previous']")
    public WebElement previousPageOnUserManagementPage;

    // Details of MY USER on Edit Page

    @FindBy(id = "firstName")
    public WebElement firstNameOnEditUserPage;

    @FindBy(id = "lastName")
    public WebElement lastNameonEditUserPage;

    @FindBy(id = "email")
    public WebElement emailOnEditUserPage;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButtonOnEditUserPage;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement successMessageForEditingUser;

}
