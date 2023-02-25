package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class MedunnaAuthentication {
//    public static void main(String[] args) {
//        System.out.println(generateToken());
//    }

    public static String generateToken(){
        Map<String, Object> json = new HashMap<>();
        json.put("password", "Batch81+");
        json.put("rememberMe", true);
        json.put("username", "Batch81");

        Response response = given().contentType(ContentType.JSON).body(json).when().post("https://medunna.com/api/authenticate");
        return response.jsonPath().getString("id_token");


    }
}
