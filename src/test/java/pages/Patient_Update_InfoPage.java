package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Patient_Update_InfoPage {

    public Patient_Update_InfoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement save;

    @FindBy(id="account-menu")
    public WebElement updatedUserInfo;


}
