package apitesting.postrequests;

import org.json.JSONObject;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BodyGenerationDataProvider {

    @DataProvider(name = "generateBodyContentMainClass", parallel = true)
    public static Iterator<Object[]> generateBodyContentMainClass(){
        List<Object[]> data = new ArrayList<>();
        for(int i = 0; i < 500; i++){
            JSONObject jsonObject =  new JSONObject();
            jsonObject.put("username",String.format("UserName%s",i));
            jsonObject.put("firstname",String.format("firstname%s",i));
            jsonObject.put("lastname",String.format("lastname%s",i));
            jsonObject.put("email",String.format("email%s",i));
            data.add(new Object[]{jsonObject});
        }
        return data.iterator();
    }

}
