package delete;

import base.BaseTest;
import org.testng.annotations.Test;

import static constans.JsonPlaceHolder_Constans.Actions.JsonPlaceHolder_DELETE;
import static io.restassured.RestAssured.given;

public class DeleteTest extends BaseTest {
    @Test
    public void delete(){
        given().log().uri().
                when().delete(JsonPlaceHolder_DELETE).
                then().log().body().statusCode(200);
    }
}
