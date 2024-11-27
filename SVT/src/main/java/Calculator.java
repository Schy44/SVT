import java.util.Random;

public class Calculator {

    public Integer add(int a, int b){
        return a+b;
    }


    public Integer divide(int a, int b) {
        if (b == 0) {
           // return null;
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
}
