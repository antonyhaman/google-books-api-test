package com.github.kotvertolet.googleapitest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

public class BaseTest {

    private final String API_KEY = "";

    protected BaseTest() {
        setUp();
    }

    private void setUp() {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://www.googleapis.com/")
                .setBasePath("books/v1/")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.ANY)
                .addParam("key", API_KEY)
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();
    }

}
