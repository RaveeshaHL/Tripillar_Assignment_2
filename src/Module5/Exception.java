package Assignment2.Module5;

public class Exception extends RuntimeException {
    Exception(String msg) {     //constructor
        super(msg);
    }
    static void num(int i) {
        int[] arr = {1, 2, 3, 4,};
        if (i > 3) {
            throw new Exception("the index u given is greater");
        }
        System.out.println("the index is" + arr[i]);
    }
    static void main(String[] args) {
        num(5);
    }

    }
