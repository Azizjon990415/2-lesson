package uz.lab.mathEx;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("x ni kiriting: ");
        double x=scanner.nextDouble();
        double y=0;
        y= - (4 / (3 * Math.pow(2* Math.pow(x,7),1./3)))
                +3 / (4 * Math.pow(x,7/4.));
        System.out.println("Javob : "+y);
    }
}
