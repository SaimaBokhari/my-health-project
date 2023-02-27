package stepdefinitions.api_test_stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import pojos.Appointments;

import java.io.IOException;

import static base_url.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class US11_Api_StepDefs {
    Response response;
    Appointments[] appointments;

    Appointments appointmentPojo = new Appointments();

    @Given("doctor sends GET request to see appointments")
    public void doctor_sends_get_request_to_see_appointments() {
        // Set the URL
        spec.pathParams("first","api","second","appointments");
        // Remember to add the annotation of this test in Hooks class because setUp() is added to Hooks class

        // Set the expected data / payload



        // Send the request and get the response
        response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();

    }


    @Then("HTTP status code should be {int}")
    public void http_status_code_should_be(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);

    }

    @Then("assert that user can see appointment list")
    public void assert_that_user_can_see_appointment_list() throws IOException {
        // De-serialisation

        ObjectMapper objectMapper = new ObjectMapper();
        appointments= objectMapper.readValue(response.asString(), Appointments[].class);

        System.out.println("Total appointments = " + appointments.length);

        assertTrue(appointments!=null);


        boolean flag = false;
        for (int i = 0; i < appointments.length; i++) {
            System.out.println("Appointment id : " + appointments[i].getId());
            if (appointments[i].equals(1280)){
                flag = true;
            }

        }
        assertTrue(flag);



    }

}
