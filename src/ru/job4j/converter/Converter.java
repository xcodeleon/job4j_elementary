package ru.job4j.converter;

/*
Задание.

1. Реализовать метод конвертации рублей в евро и доллары.

Вам нужно заменить -1 на формулу для вычисления валюты.

1 доллар = 60 рублей.
1 евро = 70 рублей.

2. Доработайте метод main. Добавьте в него примеры выводов всех видов конвертаций.
 */
public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
    }
}
