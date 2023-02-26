package stepdefinitions.api_test_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Room;

import static base_url.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US11_Api_StepDefs {
    Response response;

    @Given("doctor sends GET request to see appointments")
    public void doctor_sends_get_request_to_see_appointments() {
        // Set the URL
        spec.pathParams("first","api","second","appointments");

        // Set the expected data / payload
//        Room room = new Room();
//        room.setRoomNumber(Faker.instance().number().numberBetween(1000,1000000));
//        room.setRoomType("TWIN");
//        room.setStatus(true);
//        room.setPrice(100);
//        room.setDescription("Created by API");

        // Send the request and get the response
        response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();

    }


    @Then("HTTP status code should be {int}")
    public void http_status_code_should_be(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);

    }

    @Then("assert that user can see appointment list")
    public void assert_that_user_can_see_appointment_list() {

    }
    @Then("assert that user can see time slot")
    public void assert_that_user_can_see_time_slot() {

    }

}
