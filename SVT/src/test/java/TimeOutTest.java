import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.Duration;

public class TimeOutTest {

    public void task() {
        try {

            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    void TimeLimit() {

        assertTimeout(Duration.ofMillis(1000), () -> task());
    }
}
