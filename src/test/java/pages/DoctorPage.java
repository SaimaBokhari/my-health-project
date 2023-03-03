package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorPage {
    public DoctorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//*[.='MY PAGES'])[1]")
    public WebElement myPagesOption;

    @FindBy(xpath = "(//*[.='My Appointments'])[1]")
    public WebElement myAppointmentIcon;

    @FindBy(xpath = "(//*[.='Edit'])[1]")
    public WebElement editButton;

    @FindBy(linkText ="Request A Test")
    public WebElement requestATestButton;

    @FindBy(id = "fromDate")
    public WebElement fromDate;

    @FindBy(id = "toDate")
    public WebElement toDate;

    @FindBy(xpath = "//tr//td")
    public WebElement ids;

    @FindBy(xpath = "//*[.='Test Items']")
    public WebElement isTestSuccess;

}
