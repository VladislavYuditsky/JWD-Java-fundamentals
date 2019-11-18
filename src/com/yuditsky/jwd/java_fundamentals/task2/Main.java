//Вычислить значение выражения по формуле (все переменные принимают действительные значения):

package com.yuditsky.jwd.java_fundamentals.task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double a = random.nextDouble();
        double b = random.nextDouble();
        double c = random.nextDouble();
        double result;

        result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println(result);
    }
}
