package utilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;

public  class PatientGenerateToken {

    public static void main(String[] args) {
        generateToken();
    }

    public static String generateToken() {
        HashMap<String, Object> hashMap = new HashMap();
        hashMap.put("password", "Abc12345.");
        hashMap.put("rememberMe", true);
        hashMap.put("username", "emreteam2");
        Response response = (Response) RestAssured.given().contentType(ContentType.JSON).body(hashMap).when().post("https://medunna.com/api/authenticate", new Object[0]);
        String token = response.jsonPath().getString("id_token");
        System.out.println("token = " + token);
        return token;
    }
}











