import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(0, Calculator.add(-2, 2));
        assertEquals(-5, Calculator.add(-2, -3));

    }

    @Test
    void subtract() {
        assertEquals(5, Calculator.subtract(8, 3));
        assertEquals(0, Calculator.subtract(2, 2));
        assertEquals(-5, Calculator.subtract(-2, 3));
    }

    @Test
    void multiply() {
        assertEquals(6, Calculator.multiply(2, 3));
        assertEquals(0, Calculator.multiply(2, 0));
        assertEquals(-6, Calculator.multiply(2, -3));
    }

    @Test
    void divide() {
        assertEquals(2, Calculator.divide(6, 3));
        assertEquals(0, Calculator.divide(0, 3));
        assertEquals(-2, Calculator.divide(6, -3));
    }
}