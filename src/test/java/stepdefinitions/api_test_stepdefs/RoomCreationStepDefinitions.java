package stepdefinitions.api_test_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.RoomCreationPojo;

import static base_url.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.MedunnaAuthentication.generateToken;

public class RoomCreationStepDefinitions {
    RoomCreationPojo expectedData = new RoomCreationPojo();
    Response response;
    int roomNumber;
    @When("User makes POST request")
    public void user_makes_post_request() {

        spec.pathParams("first","api","second", "rooms");
        roomNumber = Faker.instance().number().numberBetween(1000,1000000);
        expectedData.setStatus(true);
        expectedData.setRoomType("PREMIUM_DELUXE");
        expectedData.setRoomNumber(roomNumber);
        expectedData.setPrice(1907);
        System.out.println(expectedData);

        response = given().headers("Authorization", "Bearer " + generateToken(),
                        "Content-Type", ContentType.JSON, "Accept",ContentType.JSON).
                spec(spec).
                contentType(ContentType.JSON).
                body(expectedData).
                when().
                post("/{first}/{second}");

        response.prettyPrint();

    }
    @Then("Validate room creation by using API")
    public void validateRoomCreationByUsingAPI() {

        assertEquals(201,response.statusCode());
        response.then().assertThat().body(    "price",equalTo(1907),
                "roomType",equalTo("PREMIUM_DELUXE"),
                "roomNumber", equalTo(roomNumber),
                "status",equalTo(true));

        RoomCreationPojo actualData = response.as(RoomCreationPojo.class);
        assertEquals(expectedData.getRoomNumber(),actualData.getRoomNumber());
        assertEquals(expectedData.getRoomType(),actualData.getRoomType());
        assertEquals(expectedData.getPrice(),actualData.getPrice());
        assertEquals(expectedData.getStatus(),actualData.getStatus());
    }
}
