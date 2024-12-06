import java.util.Random;

public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }


    public int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}

