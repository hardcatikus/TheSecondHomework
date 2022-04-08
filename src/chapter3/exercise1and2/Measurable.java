package chapter3.exercise1and2;

public interface Measurable {

    double getMeasure();
    String  getName();

    static double average(Measurable[] objects){
        double result = 0;
        for(Measurable object : objects){
            result += object.getMeasure();
        }
        return result / objects.length;
    }

    static Measurable largest(Measurable[] objects){
        Measurable largest = null;
        for(Measurable object : objects){
            if (largest == null || largest.getMeasure() < object.getMeasure()){
                largest = object;
            }
        }
        return largest;
    }
}
