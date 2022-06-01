package apitesting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ExecuteRequest;
import utils.GlobalVariables;

import static io.restassured.RestAssured.given;

public class GetRequestsAPIDemo {

    @Test
    public void buildGetRequest(){
        RestAssured.baseURI = "http://localhost:7800";
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/users/findbyid/1")
                .then()
                .extract().response();

        System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void buildGetRequestEmail(){
        RestAssured.baseURI = "http://localhost:7800";
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/users/findbyemail/username3@test.com")
                .then()
                .extract().response();

        System.out.println(response.getBody().prettyPrint());
    }


    // Groups is used in the testng.xml in order to call and execute just the test specified by group and get
    @Test(groups = {"getAll","get"})
    public void getAllUsers(){
        String url = GlobalVariables.apiHost +  "/users/all";
        Response response =  ExecuteRequest.makeGetRequest(url);
        System.out.println(response.asString());
        JSONArray jsonArray = new JSONArray(response.asString());
        System.out.println(jsonArray.toString(10));
        if(jsonArray.length() > 10){
            Assert.fail("Length should be 10");
        }
    }

    @Test
    public void findById(){
        String url = GlobalVariables.apiHost +  "/users/findbyid/2";
        Response response = ExecuteRequest.makeGetRequest(url);
        System.out.println(response.asString());
        JSONObject jsonArray = new JSONObject(response.asString());
        System.out.println(jsonArray.toString(10));
        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(response.jsonPath().get("id").toString(), "2");
    }

}
