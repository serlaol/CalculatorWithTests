package org.iesfm.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class Calculator implements ICalculator {
    private static Logger log = LoggerFactory.getLogger(Calculator.class);

    /**
     * It sums parameter a and b
     * Suma el parámetro a y b
     *
     * @param a El primer sumando
     * @param b El segundo sumando
     * @return Devuelve la suma
     */
    @Override
    public double sum(double a, double b) {
        log.info("A sum has been executed: "+ a + " + " + b);
        return a + b;
    }

    @Override
    public double substract(double a, double b) {
        return 0;
    }

    @Override
    public double div(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException("Can't divide by zero");
        } else {
            return a / b;
        }
    }

    @Override
    public double multiply(double a, double b) {
        return 0;
    }

    @Override
    public double neg(double a) {
        return 0;
    }
}
