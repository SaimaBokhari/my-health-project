package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AppointmentStatusPage {


    public AppointmentStatusPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="appointment-status")
    public WebElement appointmentStatus;

    @FindBy(id="save-entity")
    public WebElement saveButton;

    @FindBy(className="//div[@class='Toastify__toast-body']")
    public WebElement statusMessage;



}
