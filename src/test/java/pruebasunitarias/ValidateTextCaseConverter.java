package pruebasunitarias;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateTextCaseConverter {

    @Test
    public void validarMayusculas(){
        System.out.println("\n####################### MAYÚSCULAS #############################");
        String expectedResult = "INTRO A TESTNG";
        String inputText = "Intro a TestNG";
        TextCaseConvert textCaseConvert = new TextCaseConvert();
        String actualResult = textCaseConvert.convertirTextoMayusculas(inputText);
        System.out.println("Input text: " + inputText);
        System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        System.out.println("#################################################################");
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void validarMinusculas(){
        System.out.println("\n####################### MINÚSCULAS #############################");
        String expectedResult = "intro a testng";
        String inputText = "Intro a TestNG";
        TextCaseConvert textCaseConvert = new TextCaseConvert();
        String actualResult = textCaseConvert.convertirTextoMayusculas(inputText);
        System.out.println("Input text: " + inputText);
        System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        System.out.println("#################################################################");
        Assert.assertEquals(actualResult,expectedResult);
    }

}
