package chapter2.exercise9;

public final class Car {
    /*Should this be an immutable class?
    Класс Car должен быть immutable, чтобы параметры объекта не могли быть
    изменены без вызова соответствующих методов.
    Т.е. реалистично моделировать поведение автомобиля
    (чтобы автомобиль резко не менял свои координаты в ходе движения)
     */
    private double x;
    private double fuelLevel;
    private double fuelEfficiency; // miles/gallons

    public Car(double fuelLevel, double fuelEfficiency) {
        x = 0;
        this.fuelLevel = fuelLevel;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void drive(double miles){
        if ((fuelLevel - miles/fuelEfficiency) >= 0) {
            x += miles;
            fuelLevel -= miles/fuelEfficiency;
        }
        else{
            System.out.println("Not enough fuel");
        }
    }

    public void addFuel(double gallons){
        fuelLevel += gallons;
    }

    public double getCurrentDistance() {
        return x;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}
