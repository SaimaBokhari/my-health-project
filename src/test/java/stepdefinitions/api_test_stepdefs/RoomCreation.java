package stepdefinitions.api_test_stepdefs;

import base_url.AppBaseUrl;
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

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.MedunnaAuthentication.generateToken;

public class RoomCreation extends AppBaseUrl {

    Room room = new Room();
    Faker faker =new Faker();
    Response response;
    int roomNumber = Faker.instance().number().numberBetween(1000,1000000);
    @Given("user send post request for room data")
    public void user_send_post_request_for_room_data() {
// set the url

        spec.pathParams("first", "api", "second", "rooms");

        //  Room room = new Room();  // we creat this under class
        room.setRoomNumber(roomNumber);
        room.setRoomType("TWIN");
        room.setStatus(true);
        room.setPrice(100);
        room.setDescription("This room is created by API");

        response = given().
                headers("Authorization", "Bearer "+generateToken(),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).
                spec(spec).
                contentType(ContentType.JSON).
                body(room).
                post("/{first}/{second}");
        response.prettyPrint();

    }

    @Then("user gets the room data and validates")
    public void user_gets_the_room_data_and_validates() throws IOException {


        assertEquals(201, response.getStatusCode());

        //1. Validation
        response.then().assertThat().body("roomNumber", equalTo(roomNumber)).
                body("roomType", equalTo("TWIN")).
                body("status", equalTo(true)).
                body("price", equalTo(100)).
                body("description", equalTo("This room is created by API"));


        //2. Validation
        JsonPath jsonPath = response.jsonPath();

        assertEquals(room.getRoomNumber(), jsonPath.getInt("roomNumber"));
        assertEquals(room.getRoomType(), jsonPath.getString("roomType"));
        assertEquals(room.getStatus(), jsonPath.getBoolean("status"));
        assertEquals(room.getPrice(), jsonPath.getInt("price"));
        assertEquals(room.getDescription(), jsonPath.getString("description"));

        //3. Validation
        HashMap<String, Object> actualDataMap = response.as(HashMap.class);

        assertEquals(room.getRoomNumber(), actualDataMap.get("roomNumber"));
        assertEquals(room.getRoomType(), actualDataMap.get("roomType"));
        assertEquals(room.getStatus(), actualDataMap.get("status"));
        assertEquals(room.getPrice(), actualDataMap.get("price"));
        assertEquals(room.getDescription(), actualDataMap.get("description"));

        //4. Validation
//        Room actualDataPojo = response.as(Room.class);
//
//        assertEquals(room.getRoomNumber(), actualDataPojo.getRoomNumber());
//        assertEquals(room.getRoomType(), actualDataPojo.getRoomType());
//        assertEquals(room.getStatus(), actualDataPojo.getStatus());
//        assertEquals(room.getPrice(), actualDataPojo.getPrice());
//        assertEquals(room.getDescription(), actualDataPojo.getDescription());

        //5. Validation
        ObjectMapper objectMapper = new ObjectMapper();

        Room actualRoom = objectMapper.readValue(response.asString(), Room.class);

        assertEquals(room.getRoomNumber(), actualRoom.getRoomNumber());
        assertEquals(room.getRoomType(), actualRoom.getRoomType());
        assertEquals(room.getStatus(), actualRoom.getStatus());
        assertEquals(room.getPrice(), actualRoom.getPrice());
        assertEquals(room.getDescription(), actualRoom.getDescription());

        //6. Validation
        Gson gson = new Gson();
        Room gsonActualPojo = gson.fromJson(response.asString(), Room.class);
        assertEquals(room.getRoomNumber(), gsonActualPojo.getRoomNumber());
        assertEquals(room.getRoomType(), gsonActualPojo.getRoomType());
        assertEquals(room.getStatus(), gsonActualPojo.getStatus());
        assertEquals(room.getPrice(), gsonActualPojo.getPrice());
        assertEquals(room.getDescription(), gsonActualPojo.getDescription());





    }









}


