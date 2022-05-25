package testngdataproviders;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataProvider{
    @DataProvider(name = "staticDp")
    public static Object[][] staticDp(){
        return  new Object[][]{
                {2,3,5},
                {3,3,6},
                {9,9,3},
                {4,6,10},
                {1,-1,2}
        };
    }


    @Test(groups = {"dataproviders", "staticDP","all"},
            dataProvider = "staticDp")
    public void dataProviderTest(int value1, int value2, int expectedResult){
        int currentResult = value1 + value2;
        Assert.assertEquals(expectedResult, currentResult,"la suma de los numeros no es la esperada");
    }
}
