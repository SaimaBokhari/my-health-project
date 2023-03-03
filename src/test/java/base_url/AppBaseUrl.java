package base_url;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utilities.ConfigReader;

import static utilities.MedunnaAuthentication.generateToken;

public class AppBaseUrl {
    public static RequestSpecification spec;

    public static void medunnaSetUp(){
        spec = new  RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunna_api_url")).
                build();


        // addHeader("Authorization","Bearer "+generateToken()).


    }
}
// We can put generateToken() in base_url class as well by assigning it in header
//

