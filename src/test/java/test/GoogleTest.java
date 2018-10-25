package test;

import io.restassured.RestAssured;
import org.testng.annotations.Test;


public class GoogleTest extends BaseTest {

    public GoogleTest() {
        RestAssured.requestSpecification = super.requestSpecBuilder
                .setBasePath("")
                .build();
    }


    @Test
    public void test1() {
        RestAssured.given()
                .formParam("param1", "value1")
                .formParam("param2", "value2")
                .when()
                .post()
                .then()
                .statusCode(405);
    }

}
