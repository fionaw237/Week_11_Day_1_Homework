import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void canSubtract(){
        int result = calculator.subtract(3, 5);
        assertEquals(-2, result);
    }

    @Test
    public void canMultiply(){
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test
    public void canDivide(){
        double result = calculator.divide(11, 5);
        assertEquals(2.2, result, 0);
    }
}



