package org.iesfm.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    private Calculator calculator = new Calculator();

    private final static double DELTA = 0.000001;

    @Test
    public void sumPositiveNumbersTest() {
        // Configuración del escenario del test
        double a = 2;
        double b = 5;

        // Ejecución del test
        double res = calculator.sum(a, b);

        // Comprobaciones del test
        Assert.assertEquals(7, res, DELTA);
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

}
