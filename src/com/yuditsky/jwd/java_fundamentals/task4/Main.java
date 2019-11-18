//Для данных областей составить линейную программу, которая печатает true,
// если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:

package com.yuditsky.jwd.java_fundamentals.task4;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        int[][] rectangle1 = {{-4, -3}, {-4, 0}, {4, 0}, {4, -3}};
        int[][] rectangle2 = {{-2, 0}, {-2, 4}, {2, 4}, {2, 0}};
        int x0 = 0, y0 = -1;
        double radius = 0.5;

        System.out.print("x = ");
        x = in.nextInt();

        System.out.print("y = ");
        y = in.nextInt();

        if (!belongingCircleCheck(x, y, x0, y0, radius) && (belongingRectangleCheck(x, y, rectangle1)
                || belongingRectangleCheck(x, y, rectangle2))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean belongingCircleCheck(int x, int y, int x0, int y0, double radius) {
        if (Math.pow(x - x0, 2) + Math.pow(y - y0, 2) < Math.pow(radius, 2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean belongingRectangleCheck(int x, int y, int[][] rectangle) {
        int[] checkingResult = new int[4];
        int x1, y1, x2, y2;

        for (int i = 0; i < 3; i++) {
            x1 = rectangle[i][0];
            y1 = rectangle[i][1];
            x2 = rectangle[i + 1][0];
            y2 = rectangle[i + 1][1];

            checkingResult[i] = locationCheck(x, y, x1, y1, x2, y2);
        }

        x1 = rectangle[3][0];
        y1 = rectangle[3][1];
        x2 = rectangle[0][0];
        y2 = rectangle[0][1];

        checkingResult[3] = locationCheck(x, y, x1, y1, x2, y2);

        if ((checkingResult[0] <= 0 && checkingResult[1] <= 0 && checkingResult[2] <= 0 && checkingResult[3] <= 0)
                || (checkingResult[0] >= 0 && checkingResult[1] >= 0 && checkingResult[2] >= 0 && checkingResult[3] >= 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int locationCheck(int x, int y, int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (y - y1) - (y2 - y1) * (x - x1);
    }
}
