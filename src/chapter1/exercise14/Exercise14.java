package chapter1.exercise14;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        int[][] array = buildArray(4,4);
        printArray(array);
        System.out.println(isMagicSquare(array));
    }

    public static int[][] buildArray(int rows, int columns){
        Scanner input = new Scanner(System.in);
        int[][] array =new int[rows][columns];
        for(int indexRowArray=0; indexRowArray<rows; indexRowArray++){
            String[] inputElements = input.nextLine().trim().split(" ");
            if(inputElements[0].isBlank()) break; //проверка на пустую строку
            for (int indexInput=0; indexInput < inputElements.length; indexInput++) {
                array[indexRowArray][indexInput] = Integer.parseInt(inputElements[indexInput]);
            }
        }
        return array;
    }

    public static boolean isMagicSquare(int[][] array){
        if(array.length != array[0].length){
            return false;
        }
        //вычисление суммы элементов первой строки для дальнейшего сравнения с ней
        int sum = 0;
        for(int column=0; column < array[0].length; column++){
            sum += array[0][column];
        }
        final int targetSum = sum;
        //сравнение сумм каждой из строк с целевой суммой
        for(int row=1; row < array.length; row++){
            sum = 0;
            for(int column=0; column < array[0].length; column++){
                sum += array[row][column];
            }
            if(sum!=targetSum){
                return false;
            }
        }
        //сравнение сумм каждого из столбцов с целевой суммой
        for(int column=0; column < array[0].length; column++){
            sum = 0;
            for(int row=0; row < array.length; row++){
                sum += array[row][column];
            }
            if(sum!=targetSum){
                return false;
            }
        }
        //сравнение сумм диагоналей с целевой суммой
        sum=0;
        for(int row=0; row < array.length; row++){
            sum += array[row][row];
        }
        if(sum!=targetSum){
            return false;
        }
        sum=0;
        for(int row=0; row < array.length; row++){
            sum += array[row][array.length-1-row];
        }
        if(sum!=targetSum){
            return false;
        }
        return true;
    }

    public static void printArray(int[][] array){
        for(int[] row : array){
            System.out.println(Arrays.toString(row));
        }
    }
}
