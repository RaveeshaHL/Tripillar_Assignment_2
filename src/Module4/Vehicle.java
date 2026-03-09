package Assignment2.Module4;

public interface Vehicle {
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("car is starting!");
    }

    static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
