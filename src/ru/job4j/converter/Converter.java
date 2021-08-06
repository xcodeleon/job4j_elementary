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
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedTestEuro = (expectedEuro == outEuro);
        System.out.println("140 rubles are 2. Test result: " + passedTestEuro);

        float inDollar = 180;
        float expectedDollar = 3;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedTestDollar = (expectedDollar == outDollar);
        System.out.println("180 rubles are 3. Test result: " + passedTestDollar);
    }
}
