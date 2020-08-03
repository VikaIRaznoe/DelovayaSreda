package post;

import api.config.JsonPlaceHolder_TestConfig;
import org.testng.annotations.Test;

import static constans.JsonPlaceHolder_Constans.Actions.JsonPlaceHolder_POST;
import static io.restassured.RestAssured.given;

public class PostTest extends JsonPlaceHolder_TestConfig {
    
    @Test
    public void postWithJson(){
        String postBodyJSON = "{\n" +
                "      \"title\": \"foo\",\n" +
                "      \"body\": \"bar\",\n" +
                "      \"userId\": 1\n" +
                "    }";

        given().header("Content-Type", "application/json").body(postBodyJSON).log().uri().
                when().post(JsonPlaceHolder_POST).
                then().log().body().statusCode(201);
    }
}

