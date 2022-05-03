package uz.lab.ifconditions;

import java.util.Scanner;

public class Exesrice2 {
    public static void main(String[] args) {
        //Lucky number

        int number= (int) (Math.random() * 10);
        System.out.println("omadli raqamingizni krting" +
                "");
        Scanner scanner=new Scanner(System.in);
        double x=scanner.nextDouble();
        System.out.println(number);
        double y=0;
        if (number==x){
            System.out.println("siz yutingiz");
        }else {
            System.out.println("siz yutqazdingiz");
        }


    }
}
