package chapter1.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        int angle1=360;
        int angle2=480;
        int angle3=-30;

        System.out.println(angle1 + " -> " + normalize(angle1));
        System.out.println(angle2 + " -> " + normalize(angle2));
        System.out.println(angle3 + " -> " + normalize(angle3));

        System.out.println(angle1 + " -> " + normalizeFloorMod(angle1));
        System.out.println(angle2 + " -> " + normalizeFloorMod(angle2));
        System.out.println(angle3 + " -> " + normalizeFloorMod(angle3));
    }

    //с помощью остатка от деления на 360
    public static int normalize(int angle){
        return (angle % 360 >= 0) ? angle % 360 : 360 + angle % 360;
    }

    //с помощью floorMod
    public static int normalizeFloorMod(int angle){
        return Math.abs(Math.floorMod(angle,360));
    }
}
