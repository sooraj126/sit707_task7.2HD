package calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class Calculatortest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(30, calculator.multiply(5, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(5.0, calculator.divide(10, 2), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2, 3), 0.001);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, calculator.squareRoot(25), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSquareRoot() {
        calculator.squareRoot(-25);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFactorial() {
        calculator.factorial(-5);
    }
}