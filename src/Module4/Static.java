package Assignment2.Module4;

public class Static {
    static void main(String[] args) {
        int i = 5, j = 0, k;
        try {
            k = i / j;
        } catch (ArithmeticException e) {
            System.out.println("we cannot divide any number by zero");
        }
    }
}
