package stepdefinitions.api_test_stepdefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.codehaus.jackson.map.ObjectMapper;
import io.restassured.response.Response;
import pojos.Appointments;

import java.io.IOException;

import static base_url.AppBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class US06_api_stepdefs {
//    Response response;
//    Appointments[] appointments;
//
//    @Given("patient sends GET request to see appointments")
//    public void patient_sends_get_request_to_see_appointments() {
//        // Set the URL
//        spec.pathParams("first", "api", "second", "appointments");
////        spec.queryParam("third", 13013);
//
////        // Send the request and get the response
//        response = given().spec(spec).when().get("/{first}/{second}");
//        System.out.println("Request successful");
//        response.prettyPrint();
//    }
//
//    @Then("HTTP status code must be {int}")
//    public void http_status_code_must_be(Integer statusCode) {
//        response.then().assertThat().statusCode(statusCode);
//    }
}
