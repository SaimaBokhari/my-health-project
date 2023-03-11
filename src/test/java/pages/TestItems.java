package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestItems {
    public TestItems() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "jh-create-entity")
    public WebElement createNewTestItem;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[1]/a")
    public WebElement viewContainer;

    @FindBy(className = "btn btn-danger btn-sm")
    public WebElement deleteButton;

}
