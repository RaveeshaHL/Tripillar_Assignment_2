package Assignment2.Module5;

class runnable implements Runnable {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("thread is running");
        }
    }
    static void main(String[] args) {
        runnable obj = new runnable();
        Thread t1 = new Thread(obj);
        t1.start();
        for(int i=0;i<10;i++){
            System.out.println("main threasd is running");
        }
    }

}
