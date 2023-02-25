package stepdefinitions.api_test_stepdefs;

import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static utilities.MedunnaAuthentication.generateToken;

public class US11_Api_StepDefs {
    Response response;
    RequestSpecification spec;

    @Given("user sends GET request to {string}")
    public void user_sends_get_request_to(String endPoint) {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/api").build();
        spec.pathParam("first",  "appointments");

        response= given().spec(spec).header("Authorization", "Bearer" + generateToken()).contentType(ContentType.JSON).when().get("/{first}");
        response.prettyPrint();

    }

    @Then("HTTP status code should be {int}")
    public void http_status_code_should_be(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);

    }
//    @Then("response body is like that:")
//    public void response_body_is_like_that() {
//
//    }
    @Then("assert that user can see appointment list")
    public void assert_that_user_can_see_appointment_list() {

    }
    @Then("assert that user can see time slot")
    public void assert_that_user_can_see_time_slot() {

    }

}
