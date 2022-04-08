package chapter3.exercise1and2;

import java.util.Locale;

public class Exercise1 {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Ivan",20000);
        Employee emp2 = new Employee("Anna",25000);
        Employee emp3 = new Employee("Viktor",30000);

        Employee[] empArray = {emp1,emp2,emp3};

        System.out.print("Средняя зарплата: ");
        System.out.printf(Locale.US, "%.2f%n",Measurable.average(empArray));

        System.out.println("Работник с самой высокой зарплатой: " + Measurable.largest(empArray).getName());

    }
}
