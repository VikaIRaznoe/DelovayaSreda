package get;

import api.config.JsonPlaceHolder_TestConfig;
import org.testng.annotations.Test;

import static constans.JsonPlaceHolder_Constans.Actions.JsonPlaceHolder_GET;
import static io.restassured.RestAssured.given;

public class GetTest extends JsonPlaceHolder_TestConfig {

    //Просто запрос GET
    @Test(description = "GET")
    public void get(){
        given().log().uri().
                when().get(JsonPlaceHolder_GET).
                then().log().body().statusCode(200);
    }

    //Просто запрос GET + requestSpecification
    @Test
    public void getSomeFieldInResponseAssertion(){
        given().spec(requestSpecification).log().uri()
                .when().get(JsonPlaceHolder_GET)
                .then().log().body();

    }

    //Тоже,что и впрошлом запросе + requestSpecification + передаем параметр в запросе
    @Test(description = "GET with params")
    public void getDataParam(){
        given().spec(requestSpecification).queryParam("postId",1).log().uri().
                when().get(JsonPlaceHolder_GET).then().log().body().statusCode(200);
    }
}
