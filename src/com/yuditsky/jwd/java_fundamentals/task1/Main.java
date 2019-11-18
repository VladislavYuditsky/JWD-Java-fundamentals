//Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
// и false — в противном случае:
//Сумма двух первых цифр заданного четырехзначного числа
//равна сумме двух его последних цифр.

package com.yuditsky.jwd.java_fundamentals.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number;

        do {
            number = random.nextInt();
        } while (number < 1000 || number > 9999);

        System.out.println("Number: " + number);

        int sum1 = 0;
        int sum2 = 0;
        int buffer;

        for (int i = 0; i < 4; i++) {
            buffer = number % 10;

            if (i < 2) {
                sum1 += buffer;
            } else {
                sum2 += buffer;
            }

            number /= 10;
        }

        System.out.println(sum1 == sum2);
    }
}
