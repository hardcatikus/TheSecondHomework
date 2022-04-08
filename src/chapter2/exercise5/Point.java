package chapter2.exercise5;

public final class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double moveX, double moveY){
        x += moveX;
        y += moveY;
        return this;
    }

    public Point scale(double scale){
        x *= scale;
        y *= scale;
        return this;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
