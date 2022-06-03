package apitesting;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ExecuteRequest;
import utils.GlobalVariables;

public class DeleteRequestsAPIDemo {

    @Test
    public void removeUser(){
        String url = GlobalVariables.apiHost +  "/users/removebyid/28";
        Response response = ExecuteRequest.makeDeleteRequest(url);
        System.out.println(response.asString());
        Assert.assertEquals(response.statusCode(), 200);
    }

}
