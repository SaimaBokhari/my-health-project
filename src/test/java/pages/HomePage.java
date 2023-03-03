package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(id = "login-item")
    public WebElement signInOption;

    @FindBy(id = "entity-menu")
    public WebElement itemsAndTitles;

    @FindBy(linkText = "Room")
    public WebElement roomOption;

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signInOptionButton;
    @FindBy(xpath = "//*[@data-icon='user']")
    public WebElement menuIcon;
    @FindBy(id = "username")
    public WebElement usernameInput;
    @FindBy(name = "password")
    public WebElement passwordInput;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signInButton;

}
