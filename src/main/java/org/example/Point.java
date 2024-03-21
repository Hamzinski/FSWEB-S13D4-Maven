package org.example;

public class Point {

    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
    public double distance(Point p) {
        int deltaX = this.x - p.getX();
        int deltaY = this.y - p.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distance(int a, int b) {
        int deltaX = this.x - a;
        int deltaY = this.y - b;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));
    }
}
