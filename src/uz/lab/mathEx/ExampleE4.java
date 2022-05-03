package uz.lab.mathEx;

import java.util.Scanner;

public class ExampleE4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x ni krting;");
        double x = scanner.nextDouble();
        double y = 0;
        y = -9 * Math.pow(3 * x - 5, 2);
        System.out.println("javob ;" + y);
        scanner = new Scanner(System.in);
        System.out.println("x ni krting;");
        x = scanner.nextDouble();
        double s = 0;
        s = -8 * x * Math.pow(Math.pow(x, 2) + 1, 3)
                + (Math.pow(x, 1. / 2) - 1) / Math.pow(x, 1. / 2);
        System.out.println("Javob  ;" + s);
//Math.pow()
//Math.abs()
//Math.sqrt()
//Math.max()
//Math.min()
        System.out.println(Math.random());

    }
}
