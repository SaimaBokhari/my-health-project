package stepdefinitions.ui_test_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.RoomDetailsPage;
import pages.RoomsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class RoomPageStepDefs {
    RoomsPage roomsPage = new RoomsPage();
    RoomDetailsPage roomDetailsPage = new RoomDetailsPage();
    static int roomNumber ;
    static String idNumber = "";
    Select select;
    static String roomPrice = Faker.instance().number().digits(3);

    public String getRoomPrice() {
        return roomPrice;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    @When("\"Admin\"clicks create a new room button")
    public void admin_clicks_create_a_new_room_button() {
        roomsPage.createButton.click();
    }

    @When("\"Admin\"enters room number")
    public void admin_enters_room_number() {
        roomNumber = Faker.instance().number().numberBetween(12000, 18000);
        roomsPage.roomNumber.sendKeys(String.valueOf(roomNumber));
    }

    @When("\"Admin\"enters room price")
    public void admin_enters_room_price() {
        roomsPage.priceInput.sendKeys(roomPrice);
    }

    @When("\"Admin\"clicks save button")
    public void admin_clicks_save_button() {
        JSUtils.clickElementByJS(roomsPage.saveButton);

    }

    @When("{string} clicks ID for sort list")
    public void clicks_id_for_sort_list(String string) {
        JSUtils.clickElementByJS(roomsPage.sortById);
        ReusableMethods.waitFor(1);
    }

    @When("\"Admin\" get room id")
    public void admin_get_room_id() {
        idNumber = roomsPage.firstRoomID.getText();
        System.out.println(idNumber);

    }

    @When("{string} verify {string} from Rooms Page")
    public void verify_from_rooms_page(String string, String string2) {

        System.out.println(roomsPage.firstRoomNumber.getText());
        System.out.println("roomNumber = " + roomNumber);
        Assert.assertTrue(roomsPage.firstRoomNumber.getText().equals(String.valueOf(roomNumber)));
    }


    @And("{string} verify {string} field is required.")
    public void verifyFieldIsRequired(String arg0, String arg1) {
        roomsPage.roomNumber.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(2);
        roomsPage.roomNumber.clear();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(roomsPage.requiredFieldMessage.isDisplayed());
    }

    @And("{string}select room type {string}")
    public void selectRoomType(String arg0, String arg1) {
        select = new Select(roomsPage.roomType);
        select.selectByValue(arg1);
    }

    @And("{string}verify {string} is selected")
    public void verifyIsSelected(String arg0, String arg1) {
        System.out.println(select.getAllSelectedOptions().toString());
        Assert.assertTrue(select.getAllSelectedOptions().toString().equals(arg1));
    }

    @Then("Admin verify room_type is {string} from Rooms Page")
    public void adminVerifyRoom_typeIsFromRoomsPage(String arg0) {
        Assert.assertTrue(roomsPage.firstRoomType.getText().equals(arg0));
    }

    @And("{string} clicks status")
    public void clicksStatus(String arg0) {
        roomsPage.statusCheckBox.click();
    }

    @Then("{string} verify status from Rooms Page")
    public void verifyStatusFromRoomsPage(String arg0) {
        Assert.assertTrue(roomsPage.firstRoomStatus.getText().equals("Full"));
    }

    @And("Admin verify {string} field is required.")
    public void adminVerifyFieldIsRequired(String arg0) {
        roomsPage.priceInput.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(2);
        roomsPage.priceInput.clear();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(roomsPage.requiredFieldMessage.isDisplayed());
    }

    @Then("Admin verify earlier date can typed")
    public void adminVerifyEarlierDateCanTyped() {

        Assert.assertEquals("2000-12-12T00:00",roomsPage.createdDateInput.getAttribute("value"));
    }


    @And("Admin enters {string} in Created Date field")
    public void adminEntersInCreatedDateField(String arg0) {
        roomsPage.createdDateInput.sendKeys(arg0);
    }

    @And("{string} verify all rooms on the page has {string} header")
    public void verifyAllRoomsOnThePageHasHeader(String arg0, String arg1) {
        Actions actions = new Actions(Driver.getDriver());
        for (int i = 1; i < 7 ; i++) {
            Driver.getDriver().findElement(By.xpath("//tbody/tr["+i+"]/td[1]")).click();
//            actions.moveToElement(Driver.getDriver().findElement(By.xpath("//tbody/tr["+i+"]/td[1]"))).click().perform();

            Assert.assertTrue(roomDetailsPage.roomNumber.isDisplayed());
            Assert.assertTrue(roomDetailsPage.roomType.isDisplayed());
            Assert.assertTrue(roomDetailsPage.status.isDisplayed());
            Assert.assertTrue(roomDetailsPage.price.isDisplayed());
            Assert.assertTrue(roomDetailsPage.description.isDisplayed());
            Assert.assertTrue(roomDetailsPage.createdDate.isDisplayed());
            System.out.println(Driver.getDriver().findElement(By.xpath("//h2")).getText());

            roomDetailsPage.backButton.click();
            ReusableMethods.waitFor(1);

            if (i>6){
                actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
                ReusableMethods.waitFor(1);
            }
            if (i>12){
                actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
                ReusableMethods.waitFor(1);
            }


        }

    }

    @And("{string} click edit button of lastest room")
    public void clickEditButtonOfLastestRoom(String arg0) {
        roomsPage.firstEditButton.click();
    }

    @And("{string} change {string}")
    public void change(String arg0, String arg1) {
        roomNumber = Faker.instance().number().numberBetween(12000, 18000);
        roomsPage.roomNumber.clear();
        roomsPage.roomNumber.sendKeys(String.valueOf(roomNumber));
    }
}
