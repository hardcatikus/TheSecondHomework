package chapter1.exercise13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise13 {
    public static void main(String[] args) {
        printLotteryCombination();
    }

    public static void printLotteryCombination(){
        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=49; i++){
            numbers.add(i);
        }
        int[] result = new int[6];
        for(int i=1; i<=6; i++){
            int element = (int) (Math.random() * numbers.size());
            result[i-1] = numbers.get(element);
            numbers.remove(element);
        }
        Arrays.sort(result);
        System.out.println("Lottery Combination:" + Arrays.toString(result));
    }
}
