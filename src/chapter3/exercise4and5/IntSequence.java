package chapter3.exercise4and5;

import java.util.ArrayList;
import java.util.List;

public interface IntSequence {

    List<Integer> getSequence();

    //method of() with anonymous inner class
    static IntSequence of(int... args){
        return new IntSequence(){
            List<Integer> sequence = new ArrayList<>();
            @Override
            public List<Integer> getSequence(){
                for(int arg : args){
                    sequence.add(arg);
                }
                return sequence;
            }
        };
    }

    //method constant() with lambda expression
    static IntSequence constant(int value){
        return () -> {
            List<Integer> sequence = new ArrayList<>();
            for (int i=1; i <=1000; i++){
                sequence.add(value);
            }
            return sequence;
        };
    }
}
