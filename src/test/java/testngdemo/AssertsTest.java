package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertsTest {
    @Test
    public void hardAssertExample(){
        int numero1 = 5;
        int numero2 = 10;

        String expectedResult = "hard assert";
        String actualResult = "soft assert";

        Assert.assertEquals(expectedResult, actualResult);

        System.out.println("This shoudl not be executed");
    }

    @Test
    public void softAssertExample(){
        SoftAssert softAssertion = new SoftAssert();
        softAssertion.assertEquals(1,2,"los numero no son iguales");
        softAssertion.assertEquals(1,3,"los numero no son iguales2");
        softAssertion.assertEquals(1,5,"los numero no son iguale3s");
        softAssertion.assertEquals(5,5,"los numero SI son iguale3s");

        // Esto lo que hara es evaluar y deterner si fallaron

        System.out.println("This should not be executed");
        try{
            softAssertion.assertAll();
        }catch (Exception e){
            System.out.println("ERROR");

        }

        System.out.println("This should be executed");
    }
}
