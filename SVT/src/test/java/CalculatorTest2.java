import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest2 {

    private Calculator calculator;

    @BeforeAll
    void setUpBeforeAll() {
        calculator = new Calculator();
    }

    @Test
    void testDivide() {
        int a = 10, b = 2;

        // Perform division
        Integer result = calculator.divide(a, b);

        // Assertions
        assertNotNull(result, "Result should not be null ");
        assertEquals(5, result, " result is incorrect");
        assertNotEquals(6, result, "result should not match incorrect value");
        assertTrue(result > 0, "should be positive");
        assertFalse(result < 0, "should not be negative");
    }

    @Test
    void testDivideByZero() {
        int a = 10, b = 0;
        Integer result = calculator.divide(a, b);
        assertNull(result, "Result should be null when dividing by zero");
    }
}
