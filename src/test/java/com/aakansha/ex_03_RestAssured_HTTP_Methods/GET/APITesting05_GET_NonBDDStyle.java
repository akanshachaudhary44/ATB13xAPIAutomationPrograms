package com.aakansha.ex_03_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting05_GET_NonBDDStyle {
    RequestSpecification r;//pre request - given part
    Response response;//making the request - when part
    ValidatableResponse vr;//post request - then
    @Test
    public void test_GET_NonBDD()
    {
        String pincode = "560048";

        //part 1
                r = RestAssured.given();
                r.baseUri("https://api.zippopotam.us");
                r.basePath("/IN/" + pincode);

                // part 2
        response = r.when().log().all().get();

        //part 3
        vr = response.then().log().all();
        vr.statusCode(200);

    }

}
