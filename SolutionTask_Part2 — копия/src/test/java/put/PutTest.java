package put;

import api.config.JsonPlaceHolder_TestConfig;
import org.testng.annotations.Test;

import static constans.JsonPlaceHolder_Constans.Actions.JsonPlaceHolder_PUT;
import static io.restassured.RestAssured.given;

public class PutTest extends JsonPlaceHolder_TestConfig {

    //Пример запроса PUT
    @Test
    public void putWithJson(){
        String putBodyJson = "{\n" +
                "      \"id\": 1,\n" +
                "      \"title\": \"foo\",\n" +
                "      \"body\": \"bar\",\n" +
                "      \"userId\": 1\n" +
                "    }";
        given().header("Content-Type", "application/json").body(putBodyJson).log().uri().
                when().put(JsonPlaceHolder_PUT).
                then().log().body().statusCode(200);
    }

    //Пример запроса PUT
    @Test
    public void putWithJsonRefact(){
        String putBodyJson = "{\n" +
                "      \"id\": 1,\n" +
                "      \"title\": \"foovika\",\n" +
                "      \"body\": \"bar\",\n" +
                "      \"userId\": 1\n" +
                "    }";
        given().spec(requestSpecification).header("Content-Type", "application/json").body(putBodyJson).log().uri().
                when().put(JsonPlaceHolder_PUT).
                then().log().body().statusCode(200);
    }

}