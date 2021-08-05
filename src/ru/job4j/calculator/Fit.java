package ru.job4j.calculator;
/*

Задание.
1. Доработайте методы manWeight и womanWeight.

Нужно дописать код, чтобы методы вычисляли идеальный вес для мужчины и женщины.
Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
 */
public class Fit {
    public static double manWeight(short height) {
        double idealManWeight = 1.15 * (height - 100);
        return idealManWeight;
    }

    public static double womanWeight(short height) {
        double idealWomanWeight = 1.15 * (height - 110);
        return idealWomanWeight;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
