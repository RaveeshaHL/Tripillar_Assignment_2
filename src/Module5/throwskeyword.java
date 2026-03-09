package Assignment2.Module5;

import java.lang.ArithmeticException;

public class throwskeyword {
    static void divide(int a, int b) throws java.lang.ArithmeticException {
        int result = a / b;
        System.out.println("Result = " + result);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled: Cannot divide by zero");
        }
    }
}
