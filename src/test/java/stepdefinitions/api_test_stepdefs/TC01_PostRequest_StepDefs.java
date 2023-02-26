package stepdefinitions.api_test_stepdefs;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import pojos.Room;

import java.io.IOException;
import java.util.HashMap;

import static base_url.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;


public class TC01_PostRequest_StepDefs {

    Response response;
    Room room = new Room();
    int roomNumber = Faker.instance().number().numberBetween(100,1000000);
    @Given("user sends POST request for room data")
    public void user_sends_post_request_for_room_data() {
        //We put the setUp() in Hooks class
        // Set the URL
        spec.pathParams("first","api","second","rooms");

        // Set the expected data / payload
        room.setRoomNumber(roomNumber);
        room.setRoomType("DELUXE");
        room.setStatus(true);
        room.setPrice(100);
        room.setDescription("Team02 room!");

        // Send the request and get the response
         response = given().spec(spec).contentType(ContentType.JSON).body(room).post("/{first}/{second}");

        response.prettyPrint();
    }
    @Then("user validates the room data")
    public void user_validates_the_room_data() throws IOException {
        assertEquals(201, response.getStatusCode());

        //1st way: soft assertion  OR

        response.
                then().
                assertThat().
                body("roomNumber", equalTo(roomNumber),
                        "roomType", equalTo("DELUXE"),
                        "status", equalTo(true),
                        "price", equalTo(100),
                        "description", equalTo("Team02 room!"));

        // 2nd way: JsonPath
        JsonPath jsonPath = response.jsonPath();
        assertEquals(room.getRoomNumber(), jsonPath.getInt("roomNumber"));
        assertEquals(room.getRoomType(), jsonPath.getString("roomType"));
        assertEquals(room.getStatus(), jsonPath.getBoolean("status"));
        assertEquals(room.getPrice(), jsonPath.getInt("price"));
        assertEquals(room.getDescription(), jsonPath.getString("description"));

        // 3rd way   use HashMap
        HashMap<String, Object> actualDataMap = response.as(HashMap.class);
        // System.out.println("actualDataMap = " + actualDataMap);

        assertEquals(room.getRoomNumber(), actualDataMap.get("roomNumber"));
        assertEquals(room.getRoomType(), actualDataMap.get("roomType"));
        assertEquals(room.getStatus(), actualDataMap.get("status"));
        assertEquals(room.getPrice(), actualDataMap.get("price"));
        assertEquals(room.getDescription(), actualDataMap.get("description"));

        // 4th way   use POJO CLASS

//        Room actualDataPojo = response.as(Room.class);  // For this conversion we need @JsonIgnoreProperties(ignoreUnknown = true) from import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//        //System.out.println("actualDataPojo = " + actualDataPojo);
//
//        assertEquals(room.getRoomNumber(), actualDataPojo.getRoomNumber());
//        assertEquals(room.getRoomType(), actualDataPojo.getRoomType());
//        assertEquals(room.getStatus(), actualDataPojo.getStatus());
//        assertEquals(room.getPrice(), actualDataPojo.getPrice());
//        assertEquals(room.getDescription(), actualDataPojo.getDescription());

        //5th way ObjectMapper with Pojo class
        ObjectMapper objectMapper = new ObjectMapper();
        Room actualRoom = objectMapper.readValue(response.asString(), Room.class);  // // For this conversion we need @JsonIgnoreProperties(ignoreUnknown = true) from import org.codehaus.jackson.annotate.JsonIgnoreProperties;

        assertEquals(room.getRoomNumber(), actualRoom.getRoomNumber());
        assertEquals(room.getRoomType(), actualRoom.getRoomType());
        assertEquals(room.getStatus(), actualRoom.getStatus());
        assertEquals(room.getPrice(), actualRoom.getPrice());
        assertEquals(room.getDescription(), actualRoom.getDescription());

        // 6th way: Use GSON Object (newer version) this handles the exception by itself
        Gson gson = new Gson();
        Room gsonActualPojo = gson.fromJson(response.asString(), Room.class);
        System.out.println("gsonActualPojo = " + gsonActualPojo);

        assertEquals(room.getRoomNumber(), gsonActualPojo.getRoomNumber());
        assertEquals(room.getRoomType(), gsonActualPojo.getRoomType());
        assertEquals(room.getStatus(), gsonActualPojo.getStatus());
        assertEquals(room.getPrice(), gsonActualPojo.getPrice());
        assertEquals(room.getDescription(), gsonActualPojo.getDescription());


    }


}

// JsonPath is query language for JSON as XPath is for xml