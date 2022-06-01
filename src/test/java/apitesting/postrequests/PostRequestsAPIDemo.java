package apitesting.postrequests;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import utils.ExecuteRequest;
import utils.GlobalVariables;

public class PostRequestsAPIDemo {

    @Test(dataProviderClass = BodyGenerationDataProvider.class,
            dataProvider = "generateBodyContentMainClass",
            groups = {"postMethod"})
    public void postMethod(JSONObject bodyContent){
        String url = GlobalVariables.apiHost +  "/users/add";
        System.out.println(url);
        Response responsePost = ExecuteRequest.makePostRequest(url,bodyContent.toString());
        System.out.println(responsePost.asString());
    }

}