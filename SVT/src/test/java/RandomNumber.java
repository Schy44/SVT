import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.RepeatedTest;

public class RandomNumber {


    Calculator calculator = new Calculator();

    @RepeatedTest(5)
    void testGenerateRandomNumberWithinRange() {
        // Generate a random number
        int randomNumber = calculator.generateRandomNumber();

        // Check if the number is within the expected range (1 to 100)
        assertTrue(randomNumber >= 1 && randomNumber <= 100,
                "Generated number " + randomNumber + " is out of range.");
    }
}
