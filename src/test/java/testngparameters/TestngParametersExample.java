package testngparameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParametersExample {

    @Test
    @Parameters({"FirstNumber", "SecondNumber"})
    public void sumarNumeros(int numero1, int numero2){
        //public void sumarNumeros(@Optional String numero1, String numero2){
        int resultado = numero1 + numero2;
        System.out.println("El resultado de la suma " + numero1 + " + " + numero2 + " es = " + resultado );
        //System.out.println("El resultado de la suma " + numero1 + " + " + numero2);
    }

}
