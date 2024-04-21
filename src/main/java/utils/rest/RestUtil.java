package utils.rest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestUtil {
    public static Response get(String url) {
        Response response = given()
                .when()
                .get(url);
        return response;
    }
}
