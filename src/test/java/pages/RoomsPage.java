package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomsPage {
    public RoomsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "jh-create-entity")
    public WebElement createButton;

    @FindBy(id = "room-roomNumber")
    public WebElement roomNumber;

    @FindBy(id = "room-roomType")
    public WebElement roomType;

    @FindBy(id = "room-status")
    public WebElement statusCheckBox;

    @FindBy(id = "room-price")
    public WebElement priceInput;

    @FindBy(id = "room-description")
    public WebElement description;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[.='Created Date']")
    public WebElement createdDate;

    @FindBy(id = "room-createdDate")
    public WebElement createdDateInput;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement firstRoomNumber;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement firstRoomType;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement firstRoomID;

    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public WebElement firstRoomStatus;

    @FindBy(xpath = "//span[.='ID']")
    public WebElement sortById;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement requiredFieldMessage;

    @FindBy(xpath = "//tbody/tr[1]/td[8]/div/a[2]")
    public WebElement firstEditButton;

}
