package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianPage {
    public PhysicianPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "entity-menu")
    public WebElement myPagesDropDown;

    @FindBy(xpath = "//span[.='My Appointments']")
    public WebElement myAppointment;

    @FindBy(xpath = "//span[.='My Patients']")
    public WebElement myPatients;

    @FindBy(xpath = "//span[.='My Inpatients']")
    public WebElement myInpatients;

}
