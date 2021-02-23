package org.iesfm.calculator;

import org.junit.Assert;
import org.junit.Test;

import java.rmi.server.ExportException;
import java.util.Random;
import java.util.Scanner;

public class CalculatorTests {

    private Calculator calculator = new Calculator();

    private final static double DELTA = 0.000001;

    @Test
    public void divideTest() {
        double a = 3;
        double b = 5;

        double res = calculator.div(a, b);

        Assert.assertEquals(0.6, res, DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest() throws ArithmeticException {
        double a = 3;
        double b = 0;
        calculator.div(a, b);
    }

    @Test
    public void sumNegativeNumbersTest() {
        // Configuración del escenario del test
        double a = -2;
        double b = -5;

        // Ejecución del test
        double res = calculator.sum(a, b);

        // Comprobaciones del test
        Assert.assertEquals(-7, res, DELTA);
    }

    /* TODO: Mejorar la estructura del método tests */    
    @Test
    public void tests() {

        try {
            Scanner scan = new Scanner(System.in);
            String a = "a";

            int number = Integer.parseInt(a);

            System.out.println(number / number);
        } catch (NumberFormatException e) {
            System.out.println("No ha introducido un entero: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir 0 entre 0");
        } catch(Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

    }

}
