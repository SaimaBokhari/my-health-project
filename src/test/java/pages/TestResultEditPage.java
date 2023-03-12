package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestResultEditPage {

    public TestResultEditPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "c-test-result-id")
    public WebElement idOfTestResult;

    @FindBy(id = "c-test-result-date")
    public WebElement dateOfTestResult;

    @FindBy(id = "c-test-result-result")
    public WebElement resultInput;

    @FindBy(id = "c-test-result-description")
    public WebElement descriptionOfTestResult;

    @FindBy(id = "c-test-result-createdDate")
    public WebElement createdDateOfTestResult;

    @FindBy(id="c-test-result-cTestItem")
    public WebElement testItemOnTestResult;

    @FindBy(id="c-test-result-cTest")
    public WebElement testInput;

    @FindBy(id="save-entity")
    public WebElement saveButton;

    @FindBy(xpath="(//span[.='Back'])[1]")
    public WebElement backButton;


}
