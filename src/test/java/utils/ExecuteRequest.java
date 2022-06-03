package utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ExecuteRequest {

    public static Response makeGetRequest(String url){
        Response response =  given()
                .header("Content-Type","application/json")
                .when()
                .get(url)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();
        return  response;
    }

    public static  Response makePostRequest(String url, String bodyContent){
        Response response =  given()
                .header("Content-Type","application/json")
                .when()
                .body(bodyContent)
                .post(url)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();
        return  response;
    }

    public static  Response makeDeleteRequest(String url){
        Response response =  given()
                .header("Content-Type","application/json")
                .when()
                .delete(url)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();
        return  response;
    }

}