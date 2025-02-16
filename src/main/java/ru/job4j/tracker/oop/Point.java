package ru.job4j.tracker.oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return Math.sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println(distance);
        Point c = new Point(3, 2, 4);
        Point v = new Point(7, 5, 7);
        double distance3d = c.distance3d(v);
        System.out.println(distance3d);
    }
}
