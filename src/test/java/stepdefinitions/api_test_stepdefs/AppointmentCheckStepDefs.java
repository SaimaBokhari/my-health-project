package stepdefinitions.api_test_stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Appointments;
import pojos.Patient;

import static base_url.AppBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class AppointmentCheckStepDefs {

    @Given("User send post request for appointment")
    public void user_send_post_request_for_appointment() {
        //Set the url
        spec.pathParams("first","api","second","appointments");

        // Set the expected data / payload

        // Set the expected date
        Patient patient=new Patient(null,null,5975,"emre","Team2",null,"1234567890",null,null,null,null,null);
        Appointments appointments= new Appointments(null,null,null,"2023-03-06T00:00:00Z","2023-03-07T00:00:00Z","UNAPPROVED",null,null,null,null,null,null,patient);
        // String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbnRlYW0wMiIsImF1dGgiOiJST0xFX0FETUlOIiwiZXhwIjoxNjc3ODQ1OTY1fQ.MdsIP0Qf0hM342kDtDI3fdukv7985Ql-T4b0nuwhf5cHMZpyxIjyws3Y9B9n3vx_OhyPQIoqGIwJ5I-5Mt6I8Q";
        //Send the request and get the response
        Response response = given().
                spec(spec).
                contentType(ContentType.JSON).
                headers("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbnRlYW0wMiIsImF1dGgiOiJST0xFX0FETUlOIiwiZXhwIjoxNjc3OTM4ODE5fQ.GEwH7RvryxhD9fGM1vG_JKoMZ6LWVDiABPeOQRRcZBZjljnniUkibmewpRGDt1Q-mkM8eKGnzQDzkqJ7dudzWQ",
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).
                body(appointments).
                when().
                post("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("user send fetch request to change start date")
    public void user_send_fetch_request_to_change_start_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user verify to start date changed")
    public void user_verify_to_start_date_changed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
