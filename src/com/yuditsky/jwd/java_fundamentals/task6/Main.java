//Написать программу нахождения суммы большего и меньшего из трех чисел.

package com.yuditsky.jwd.java_fundamentals.task6;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 3;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));

        int smaller = array[0];
        int lager = array[0];
        for (int i = 1; i < 3; i++) {

            if (smaller > array[i]) {
                smaller = array[i];
            }

            if (lager < array[i]) {
                lager = array[i];
            }
        }

        int sum = lager + smaller;
        System.out.println("sum = " + lager + " + " + smaller + " = " + sum);
    }
}
