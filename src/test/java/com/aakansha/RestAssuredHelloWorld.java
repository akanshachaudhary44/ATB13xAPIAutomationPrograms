package com.aakansha;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestAssuredHelloWorld {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when()
                .log().all().get().
                then()
                .log().all().statusCode(201);


    }
}
