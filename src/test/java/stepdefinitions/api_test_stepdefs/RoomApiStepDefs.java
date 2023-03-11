package stepdefinitions.api_test_stepdefs;

import base_url.AppBaseUrl;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import stepdefinitions.ui_test_stepdefs.RoomPageStepDefs;
import utilities.MedunnaAuthentication;
import static base_url.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;


public class RoomApiStepDefs {
    RoomPageStepDefs roomPageStepDefs = new RoomPageStepDefs();
    AppBaseUrl appBaseUrl = new AppBaseUrl();
    Response response;
    static String token = "";

    @When("\"Admin\"verify {string} from API")
    public void admin_verify_from_api(String string) {
        String endpoint = "https://medunna.com/api/rooms/"+roomPageStepDefs.getIdNumber();

        response = given().
                headers("Authorization","Bearer "+ MedunnaAuthentication.generateToken(),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).
                when().get(endpoint);

        JsonPath actualData = response.jsonPath();
        System.out.println(roomPageStepDefs.getIdNumber());
        System.out.println(actualData.getString("id"));
        Assert.assertEquals(roomPageStepDefs.getIdNumber(), actualData.getString("id"));




    }


    @Then("{string} verify roomNumber from API")
    public void verifyRoomNumberFromAPI(String arg0) {
        String endpoint = "https://medunna.com/api/rooms/"+roomPageStepDefs.getIdNumber();

        response = given().
                headers("Authorization","Bearer "+ MedunnaAuthentication.generateToken(),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).
                when().get(endpoint);

        response.prettyPrint();
        String expectedData = String.valueOf(roomPageStepDefs.getRoomNumber());
        JsonPath actualData = response.jsonPath();
        Assert.assertEquals(expectedData, actualData.getString("roomNumber"));

    }

    @Then("Admin verify room_type is {string} from API")
    public void adminVerifyRoom_typeIsFromAPI(String arg0) {
        String endpoint = "https://medunna.com/api/rooms/"+roomPageStepDefs.getIdNumber();

        response = given().
                headers("Authorization","Bearer "+ MedunnaAuthentication.generateToken(),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).
                when().get(endpoint);

        JsonPath actualData = response.jsonPath();
        Assert.assertEquals(arg0, actualData.getString("roomType"));
    }

    @Then("{string} verify status is {string} from API")
    public void verifyStatusIsFromAPI(String arg0, String arg1) {
        String endpoint = "https://medunna.com/api/rooms/"+roomPageStepDefs.getIdNumber();

        response = given().
                headers("Authorization","Bearer "+ MedunnaAuthentication.generateToken(),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).
                when().get(endpoint);

        JsonPath actualData = response.jsonPath();
        Assert.assertEquals(arg1, actualData.getString("status"));
    }


    @Then("Admin verify {string} from API")
    public void adminVerifyFromAPI(String arg0) {
        String endpoint = "https://medunna.com/api/rooms/"+roomPageStepDefs.getIdNumber();

        response = given().
                headers("Authorization","Bearer "+ MedunnaAuthentication.generateToken(),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).
                when().get(endpoint);

        JsonPath actualData = response.jsonPath();
        System.out.println(actualData.getString(arg0));
        System.out.println(arg0);
        Assert.assertEquals(roomPageStepDefs.getRoomPrice(),
                String.valueOf(actualData.getString(arg0)).substring(0,3));
    }
}
