//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

package com.yuditsky.jwd.java_fundamentals.task8;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int n = random.nextInt(9) + 1;
        int k = random.nextInt(9) + 1;
        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99) + 1;

            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("k = " + k);
        System.out.println("sum = " + sum);
    }
}

