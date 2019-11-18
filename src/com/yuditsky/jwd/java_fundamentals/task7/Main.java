//Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h.
// Результат представить в виде таблицы, первый столбец которой – значения  аргумента,
// второй - соот¬ветствующие значения функции:

package com.yuditsky.jwd.java_fundamentals.task7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int bound = 100;

        int a = random.nextInt(bound);

        int b;
        do {
            b = random.nextInt(bound);
        } while (b <= a);

        int h;
        do {
            h = random.nextInt(bound) + 1;
        } while (h > b - a || (b - a) % h != 0);

        System.out.println("a = " + a + ", b = " + b + ", h = " + h);

        int x = a;
        double y;
        do {
            System.out.print(x + "|");

            y = (Math.pow(Math.sin(x), 2) - Math.cos(2 * x));
            System.out.println(y);

            x += h;
        } while (x <= b);
    }
}
