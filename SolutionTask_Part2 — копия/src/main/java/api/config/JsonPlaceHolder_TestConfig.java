package api.config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import static constans.JsonPlaceHolder_Constans.RunVariable.server;
import static constans.JsonPlaceHolder_Constans.Servers.JsonPlaceHolder_URL;
import static org.hamcrest.Matchers.containsString;

public class JsonPlaceHolder_TestConfig {

    protected ResponseSpecification responseSpecificationForGet = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();

    protected RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri(JsonPlaceHolder_URL)
            .build();

    protected ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectBody(containsString("employee_name"))
            .build();

    @BeforeClass
    public void setUp(){
        RestAssured.baseURI = server;
    }
}