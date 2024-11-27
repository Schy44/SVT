import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvTest {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "5, 3, 8",
            "-1, -1, -2",
            "0, 0, 0",
            "100, 200, 300"
    })
    void testAdd(int a, int b, int expectedSum) {

        assertEquals(expectedSum, calculator.add(a, b));
    }
}
