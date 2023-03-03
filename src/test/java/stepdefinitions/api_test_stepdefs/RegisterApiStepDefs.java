package stepdefinitions.apiTestStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_url.AppBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.MedunnaAuthentication.generateToken;

public class RegisterApiStepDefs {

    Response response;


    @Given("user sends get request for registrant")
    public void user_sends_get_request_for_registrant() {

        spec.pathParams("first", "api", "second", "account");

        response = given(). headers("Authorization", "Bearer "+generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON).spec(spec).contentType(ContentType.JSON).get("/{first}/{second}");
        response.prettyPrint();
    }
    @Then("user gets  registrant data and validate them")
    public void user_gets_registrant_data_and_validate_them() {

        JsonPath jsonPath = response.jsonPath();
        assertEquals(200,response.statusCode());
        assertEquals("application/json",response.contentType());

        assertEquals("mark_twain",jsonPath.getString("login"));
        assertEquals("231-56-0987",jsonPath.getString("ssn"));
        assertEquals("true",jsonPath.getString("activated"));

    }
}
/*
                                                                    {
                                                                        "id": 7110,
                                                                        "login": "mark_twain",
                                                                        "firstName": "Mark",
                                                                        "lastName": "Twain",
                                                                        "ssn": "231-56-0987",
                                                                        "email": "marktwain@gmail.com",
                                                                        "imageUrl": null,
                                                                        "activated": true,
                                                                        "langKey": "en",
                                                                        "createdBy": "anonymousUser",
                                                                        "createdDate": "2023-02-25T07:11:15.162088Z",
                                                                        "lastModifiedBy": "adminteam01",
                                                                        "lastModifiedDate": "2023-02-25T07:12:10.006604Z",
                                                                        "authorities": [
                                                                            "ROLE_ADMIN"
                                                                        ]
                                                                    }
 */
