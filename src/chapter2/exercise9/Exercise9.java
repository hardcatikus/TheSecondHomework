package chapter2.exercise9;

public class Exercise9 {
    public static void main(String[] args) {
        Car car = new Car(10,50);
        car.drive(300);
        System.out.println("Fuel level: " + car.getFuelLevel());
        System.out.println("Current distance: " + car.getCurrentDistance());
        car.drive(400);
        car.addFuel(5);
        car.drive(400);
        System.out.println("Fuel level: " + car.getFuelLevel());
        System.out.println("Current distance: " + car.getCurrentDistance());
    }
}
