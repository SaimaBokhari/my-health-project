package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianDetailsPage {
    public PhysicianDetailsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "birthDate")
    public WebElement birthDate;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "speciality")
    public WebElement speciality;

    @FindBy(xpath = "//span[.='Back']")
    public WebElement backButton;





}
