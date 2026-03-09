package Assignment2.Module5;

public class ArithmeticException {
    static void main(String[] args) {
        int i = 1, j = 0, k;
        try {
            k = i / j;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("we cannot divide any number by zero");
        }
    }
}
