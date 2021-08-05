package ru.job4j.condition;

/*
Задание.

1. Создайте класс ru.job4j.condition.SqArea. Допишите метод square.
2. Доработайте метод main с демонстрацией работы программы с параметрами p = 6, k = 2, площадь должна быть 2.

h = p / (2 * (k + 1));

L = h * k;

s = L * h;
 */

public class SqArea {
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;

        double squareTriangle = length * height;
        return squareTriangle;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
