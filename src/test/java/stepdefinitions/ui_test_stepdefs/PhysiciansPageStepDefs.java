package stepdefinitions.ui_test_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.PhysicianPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class PhysiciansPageStepDefs {
    HomePage homePage = new HomePage();
    PhysicianPage physicianPage = new PhysicianPage();
    public static int examFee;

    @And("{string} clicks Physician")
    public void clicksPhysician(String arg0) {
        homePage.physicianOption.click();
    }

    @And("{string} clicks create a new Physician button")
    public void clicksCreateANewPhysicianButton(String arg0) {
        physicianPage.createPhysician.click();
    }

    @And("Admin clicks Use Search check box")
    public void adminClicksUseSearchCheckBox() {
        physicianPage.ssnCheckBox.click();
    }

    @And("Admin enters {string} into SSN field")
    public void adminEntersIntoSSNField(String arg0) {
        physicianPage.searchSSN.sendKeys(arg0);
    }

    @And("Admin clicks Search User button")
    public void adminClicksSearchUserButton() {
        physicianPage.searchButton.click();
    }

    @And("Admin verify physicians name is {string}")
    public void adminVerifyPhysiciansNameIs(String arg0) {
        ReusableMethods.waitFor(1);
        Assert.assertEquals(physicianPage.firstname.getAttribute("value"),arg0);
    }

    @And("Admin enters {string} into firstname field")
    public void adminEntersIntoFirstnameField(String arg0) {
        physicianPage.firstname.clear();
        ReusableMethods.waitFor(1);
        physicianPage.firstname.sendKeys(arg0);

    }

    @And("Admin enters {string} into lastname field")
    public void adminEntersIntoLastnameField(String arg0) {
        physicianPage.lastname.clear();
        physicianPage.lastname.sendKeys(arg0);
    }

    @And("Admin enters {string} into birthday field")
    public void adminEntersIntoBirthdayField(String arg0) {
        physicianPage.birthdate.sendKeys(arg0);
    }

    @And("Admin select {string} from speciality field")
    public void adminSelectFromSpecialityField(String arg0) {
        Select select = new Select(physicianPage.speciality);
        select.selectByVisibleText(arg0);
    }

    @And("Admin upload photo image field")
    public void adminUploadPhotoImageField() {
        physicianPage.file_image.sendKeys("D:\\HealthProjectSprint2\\src\\test\\resources\\testdata\\Dr_Bart_Simpson.jpg");
    }

    @And("Admin enters exam fee")
    public void adminEntersExamFee() {
        examFee = Faker.instance().number().numberBetween(300,600);
        physicianPage.examFee.sendKeys(String.valueOf(examFee));
    }

    @And("Admin select {string} from user field")
    public void adminSelectFromUserField(String arg0) {
        Select select = new Select(physicianPage.physician_user);
        select.selectByVisibleText(arg0);


    }

    @Then("Admin verify firstname is {string}")
    public void adminVerifyFirstnameIs(String arg0) {
        ReusableMethods.waitFor(1);
        Assert.assertEquals(arg0,physicianPage.pageFirstname.getText());
    }

    @Then("Admin verify lastname is {string}")
    public void adminVerifyLastnameIs(String arg0) {
        Assert.assertEquals(arg0,physicianPage.pageLastname.getText());
    }

    @Then("Admin verify birthdate is {string}")
    public void adminVerifyBirthdateIs(String arg0) {
        Assert.assertEquals(arg0,physicianPage.pageBirthdate.getText());
    }

    @Then("Admin verify speciality is {string}")
    public void adminVerifySpecialityIs(String arg0) {
        Assert.assertEquals(arg0,physicianPage.pageSpeciality.getText());
    }

    @Then("Admin verify pictures is uploaded")
    public void adminVerifyPicturesIsUploaded() {
        Assert.assertTrue(physicianPage.pageFileImage.isDisplayed());
    }

    @Then("Admin verify existing user is {string}")
    public void adminVerifyExistingUserIs(String arg0) {
        ReusableMethods.waitFor(1);
        Assert.assertEquals(arg0,physicianPage.pageUser.getText());
    }

    @Then("Admin verify exam fee")
    public void adminVerifyExamFee() {
        Assert.assertEquals(String.valueOf(examFee), physicianPage.pageExamFee.getText());
    }

    @And("Admin clicks first physicians view button")
    public void adminClicksFirstPhysiciansViewButton() {
        physicianPage.firstViewButton.click();
        ReusableMethods.waitFor(7);
    }

    @And("Admin clicks first physicians edit button")
    public void adminClicksFirstPhysiciansEditButton() {
        physicianPage.firstEditButton.click();
    }

    @And("Admin change firstname with {string}")
    public void adminChangeFirstnameWith(String arg0) {
        ReusableMethods.waitFor(1);
        physicianPage.firstname.clear();
        physicianPage.firstnameForEdit.sendKeys(arg0);
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(physicianPage.saveButtonForEdit);

    }

    @When("Admin clicks delete button")
    public void adminClicksDeleteButton() {
        physicianPage.firstDeleteButton.click();
    }

    @And("Admin confirm deletion")
    public void adminConfirmDeletion() {
        ReusableMethods.waitFor(1);
        physicianPage.deleteConfirmButton.click();
    }

    @Then("Admin verify deletion")
    public void adminVerifyDeletion() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(physicianPage.deleteConfirmMessage.isDisplayed());
    }

    @And("{string} clicks save button")
    public void clicksSaveButton(String arg0) {
        JSUtils.moveToElementJS(physicianPage.examFee);
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(physicianPage.saveButton);
        ReusableMethods.waitFor(1);
    }

    @And("Admin enters {string} into phone number field")
    public void adminEntersIntoPhoneNumberField(String arg0) {
        physicianPage.phone.sendKeys(arg0);

    }
}
