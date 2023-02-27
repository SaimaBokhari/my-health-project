package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    @FindBy(name = "activated")
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
}
