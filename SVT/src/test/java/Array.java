import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Array {

    public static void main(String[] args) {

        int[] expectedArray = {1, 2, 8};
        int[] actualArray = {1, 2, 8};
        assertArrayEquals(expectedArray, actualArray);


        String str1 = new String("Hello");
        String str2 = str1;
        assertSame(str1, str2);



        String expected = "hello\nmy_name\nis_safa";
        String actual = "is_safa\nhello\nmy_name";

        List<String> expectedLines = Arrays.asList(expected.split("\n"));
        List<String> actualLines = Arrays.asList(actual.split("\n"));

        expectedLines.sort(String::compareTo);
        actualLines.sort(String::compareTo);

        assertLinesMatch(expectedLines, actualLines);
    }
}
