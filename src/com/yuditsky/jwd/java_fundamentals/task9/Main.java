//Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого.

package com.yuditsky.jwd.java_fundamentals.task9;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] firstArray = new int[random.nextInt(10)];
        int[] secondArray = new int[random.nextInt(10)];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(100);
        }

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = random.nextInt(100);
        }

        System.out.println("First array: ");
        System.out.println(Arrays.toString(firstArray));
        System.out.println("Second array: ");
        System.out.println(Arrays.toString(secondArray));

        int k = random.nextInt(firstArray.length);
        System.out.println("k = " + k);

        int[] buffer = new int[firstArray.length + secondArray.length];
        for (int i = 0; i <= k; i++) {
            buffer[i] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            buffer[i + k + 1] = secondArray[i];
        }

        for (int i = k + 1; i < firstArray.length; i++) {
            buffer[i + secondArray.length] = firstArray[i];
        }

        firstArray = buffer;

        System.out.println(Arrays.toString(firstArray));
    }
}
