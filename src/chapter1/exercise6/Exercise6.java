package chapter1.exercise6;

import java.math.BigInteger;

public class Exercise6 {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(factorial(n));
    }

    public static BigInteger factorial(int n){
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 2; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
