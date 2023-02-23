package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DoctorsPage {
    public DoctorsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "entity-menu")
    public WebElement myPages;

    @FindBy(linkText = "My Appointments")
    public WebElement myAppointments;

    @FindBy(xpath = "//tbody//td[1]")
    public WebElement patientId;

    @FindBy(xpath = "//tbody//td[1]")
    public List<WebElement> patientIdList;

    @FindBy(id = "fromDate")
    public WebElement timeSlotFrom;

    @FindBy(id = "toDate")
    public WebElement timeSlotTo;

    @FindBy(xpath = "//tbody//td[2]")
    public WebElement startDateAndTime;

    @FindBy(xpath = "//tbody//td[3]")
    public WebElement endDateAndTime;

    @FindBy(xpath = "//tbody//td[4]")
    public WebElement appointmentStatus;

    @FindBy(xpath = "//tbody//td[4]")
    public List<WebElement> appointmentStatusList;

    @FindBy(xpath = "//tbody//td[5]")
    public WebElement anamnesis;

    @FindBy(xpath = "//tbody//td[6]")
    public WebElement treament;

    @FindBy(xpath = "//tbody//td[7]")
    public WebElement diagnosis;

    @FindBy(xpath = "//tbody//td[8]")
    public WebElement prescription;

    @FindBy(xpath = "//tbody//td[9]")
    public WebElement description;

    @FindBy(xpath = "//tbody//td[10]")
    public WebElement createdDate;

    @FindBy(xpath = "//tbody//td[11]")
    public WebElement physician;

    @FindBy(xpath = "//tbody//td[12]")
    public WebElement patient;



}
