package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomDetailsPage {
    public RoomDetailsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "roomNumber")
    public WebElement roomNumber;

    @FindBy(id = "roomType")
    public WebElement roomType;

    @FindBy(id = "status")
    public WebElement status;

    @FindBy(id = "price")
    public WebElement price;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(id = "createdDate")
    public WebElement createdDate;

    @FindBy(xpath = "//span[.='Back']")
    public WebElement backButton;
}
