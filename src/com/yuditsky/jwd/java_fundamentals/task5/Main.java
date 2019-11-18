//Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны,
// и в четвертую степень — отрицательные.

package com.yuditsky.jwd.java_fundamentals.task5;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 3;
        double[] num = new double[size];

        for (int i = 0; i < size; i++) {
            num[i] = random.nextDouble();
            if (random.nextBoolean()) {
                num[i] *= -1;
                System.out.println(num[i]);
                num[i] = Math.pow(num[i], 4);
            } else {
                System.out.println(num[i]);
                num[i] = Math.pow(num[i], 2);
            }
        }

        System.out.println(Arrays.toString(num));
    }
}
