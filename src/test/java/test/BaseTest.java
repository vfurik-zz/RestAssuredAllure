package test;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;

public class BaseTest {

    public RequestSpecBuilder requestSpecBuilder;

    public BaseTest() {
        requestSpecBuilder = new RequestSpecBuilder()
                .setBaseUri("https://www.google.com")
                .setUrlEncodingEnabled(true)
                .log(LogDetail.ALL)
                .addFilter(new AllureRestAssured());
    }


}
