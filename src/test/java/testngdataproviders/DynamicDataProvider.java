package testngdataproviders;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DynamicDataProvider {
    @DataProvider(name = "dynamicDp")
    public static Iterator<Object[]> dynamicDp(){
        List<Object[]> data = new ArrayList<>();
        for(int i = 0; i < 200; i++){
            int sumValue =  i + i;
            if(sumValue == 100){
                sumValue = 10;
            }
            data.add(new Object[]{i,i,sumValue});
        }
        return data.iterator();
    }


    @Test(groups = {"dataproviders", "dynamicDp","all"},
            dataProvider = "dynamicDp")
    public void dataProviderTest(int value1, int value2, int expectedResult){
        int currectResult = value1 + value2;
        Assert.assertEquals(expectedResult, currectResult,"la suma de los numeros no es lo esperada");
    }
}
