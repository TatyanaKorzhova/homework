package ru.stqu.pft.points;

public class PointsOfThePlane {

    public static void main(String[] args) {

        Point p1 = new Point(3,4);
        Point p2 = new Point(5,6);
        System.out.println("Координаты 1 точки " + p1);
        System.out.println("Координаты 2 точки " + p2);
        System.out.println("Расстояние между точкой 1 и 2 = " + p2.distance(p1));
    }

}