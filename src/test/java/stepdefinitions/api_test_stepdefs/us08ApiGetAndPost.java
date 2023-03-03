package stepdefinitions.api_test_stepdefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.GeneralPojo;
import pojos.PatientPojo;
import pojos.postPojo;
import pojos.userPojo;
import utilities.MedunnaAuthentication;

import java.util.ArrayList;

import static base_url.AppBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class us08ApiGetAndPost {
    Response response;
    Response response2;

    @Given("user sends post request for appointments")
    public void user_sends_post_request_for_appointments() {
        spec.pathParams("first","api","second","appointments","third","request");

        postPojo postPojo = new postPojo("Special","2023-03-03T05:46:08.593Z","string@gmail.com","iko","male","aso","0555555555","21345152","324-24-5125","2023-03-03");
        response = given().headers("Authorization", "Bearer "+ MedunnaAuthentication.generateToken()).spec(spec).contentType(ContentType.JSON).body(postPojo).post("/{first}/{second}/{third}");
        response.prettyPrint();



    }
    @Then("status code must be {int} for post request")
    public void status_code_must_be_for_post_request(Integer int1) {


    }
    @Then("Get that appointment as a Get request")
    public void get_that_appointment_as_a_get_request() throws JsonProcessingException {
//Set the expected data
        ArrayList<Object> ctes = new ArrayList<>();
        userPojo userPojo = new userPojo("anonymousUser","2023-02-18T22:08:37.674114Z","patientjohn","Patient","John","patientjohn@gmail.com",true,"en",null,null,"456-58-9637");
        PatientPojo patientPojo = new PatientPojo("patientjohn","2023-02-18T22:36:49.996695Z","Patient","John",null,"444-444-4444",null,null,null,"patientjohn@gmail.com",null,userPojo,null,null,null);

        GeneralPojo generalPojo = new GeneralPojo("anonymousUser","2023-03-02T15:29:51.664392Z","13566","2024-02-21T00:00:00Z","2024-02-21T01:00:00Z","UNAPPROVED",null,null,null,null,null,null,patientPojo,ctes);

        spec.pathParams("first","api","second","appointments","third","13566");

        response2 = given().spec(spec).when().get("/{first}/{second}/{third}");
//        response2.prettyPrint();

        GeneralPojo actualData = new ObjectMapper().readValue(response2.asString(),GeneralPojo.class);

        Assert.assertEquals(generalPojo.getCreatedBy(),actualData.getCreatedBy());
        Assert.assertEquals(userPojo.getCreatedBy(),actualData.getPatient().getUser().getCreatedBy());

    }




}
