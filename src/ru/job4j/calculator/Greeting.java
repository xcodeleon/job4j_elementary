package ru.job4j.calculator;
/*
Ниже приведен код класса ru.job4j.condition.Greeting.
Внутри метода main выполните следующие действия:
создайте переменную с именем idea типа String и присвойте ей значение "I like Java!";
выведите на консоль эту переменную через команду System.out.println(idea);
присоедините к переменной idea строку "But I am a newbie.";
создайте переменную year с типом int и присвойте ей текущий год.
присоедините к переменной idea переменную year;
выведите на консоль эту переменную через команду System.out.println(idea);
*/
public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);

        String str = "But I am a newbie.";
        idea = idea + str;
        System.out.println(idea);

        int year = 2021;
        idea = str + year;
        System.out.println(idea);

    }

}
