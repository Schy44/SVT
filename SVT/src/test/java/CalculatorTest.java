import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {

    private Calculator calculator;

   @BeforeAll
    void setUpBeforeAll() {
        calculator = new Calculator();
    }

    @BeforeEach
    void setUp() {
        System.out.println("Setting up before each test...");
    }

    @Test
    void add() {
        int a = 4;
        int b = 4;
        assertEquals(8, calculator.add(a, b));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after each test...");
    }

    @AfterAll
    void setUpAfterAll() {
        System.out.println("Cleaning up after all tests...");
    }
}
