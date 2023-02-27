package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(linkText = "Register")
    public WebElement registerButton;

    @FindBy(id = "firstPassword")
    public WebElement newPasswordField;

    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrengthBar1;

    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement passwordStrengthBar2;

    @FindBy(xpath = "(//li[@class='point'])[3]")
    public WebElement passwordStrengthBar3;

    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement passwordStrengthBar4;

    @FindBy(xpath = "(//span[.='Register'])[2]")
    public WebElement RegisterSubmitButton;

    @FindBy(xpath = "//div[.='Your password is required.']")
    public WebElement errorMessagePassRequired;

    @FindBy(id="register-submit")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "//div[.='Your password is required to be at least 4 characters.']")
    public WebElement errorMessagePassAtLeast4Char;


}
