package Assignment2.Module4;

public class GarbageCollection {
    public void finalize() {
        System.out.println("garbage collected");
    }

    static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            GarbageCollection obj = new GarbageCollection();
            obj = null;
        }
        System.gc();
    }
}
