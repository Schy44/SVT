import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestVerify {
    private final Calculator calculator = new Calculator();

    @Test
    void ThrowsExceptionForZero() {
        int a = 10, b = 0;

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(a, b),
                "Expected an ArithmeticException for division by zero"
        );
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    void ThrowExceptionForValidInputs() {
        int a = 10, b = 2;
        assertDoesNotThrow(
                () -> calculator.divide(a, b),
                "Division with valid inputs should not throw an exception"
        );
    }
}