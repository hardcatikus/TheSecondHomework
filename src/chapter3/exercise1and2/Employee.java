package chapter3.exercise1and2;

public class Employee implements Measurable{

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }
}
