package ru.job4j.condition;

/*
1. Создайте класс ru.job4j.condition.Point. Допишите метод distance.
2. Доработайте метод main. Нужно добавить в него вызов метода distance с различными аргументами.
 */

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double resultX = Math.pow((x2 - x1), 2);
        double resultY = Math.pow((y2 - y1), 2);
        double distancePoint = Math.sqrt(resultX + resultY);
        return distancePoint;
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 7, 10, 8);
        System.out.println("result (5, 7) to (10, 8) " + result);
    }
}
