//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.

package com.yuditsky.jwd.java_fundamentals.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        double a = in.nextDouble();

        System.out.print("b = ");
        double b = in.nextDouble();

        double s = 0.5 * a * b;
        System.out.println("S = " + s);

        double p = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("P = " + p);
    }
}
