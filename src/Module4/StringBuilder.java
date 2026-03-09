package Assignment2.Module4;

public class StringBuilder {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        java.lang.StringBuilder sbf = new java.lang.StringBuilder("Hello");
        for (int i = 0;i<10000;i++){
            sbf.append("World");
        }
        long stopTime =System.currentTimeMillis();
        System.out.println("TimeTaken by SBF:"+(stopTime-startTime)+"ms");

        startTime=System.currentTimeMillis();
        java.lang.StringBuilder sbl = new java.lang.StringBuilder("Hello");
        for (int i=0;i<10000000;i++){
            sbl.append("World");
        }
        stopTime = System.currentTimeMillis();
        System.out.println("TimeTaken by SBL:"+(stopTime-startTime)+"ms");

    }

}
