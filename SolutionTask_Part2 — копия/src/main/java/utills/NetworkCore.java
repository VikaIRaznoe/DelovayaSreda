package utills;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.json.JSONObject;
import static io.restassured.RestAssured.given;
import org.testng.Assert;

public class NetworkCore {

    protected Response response;
    protected RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
    protected JSONObject responseBody;

    //Метод занимается отправкой запроса, получением ответа и проверка statusCode
    public void sendRequestAndGetResponse(Method method, int code){
        response = given().spec(requestSpecBuilder.build()).log().uri().log().parameters()
                .when().request(method);
        response.then().log().body().assertThat().statusCode(code);
        try {
            responseBody = new JSONObject(response.getBody().asString());
        } catch (Exception e){
            Assert.fail("Can't get response body");
        }
    }
}
