package uz.lab;

import java.util.Scanner;

public class Example0 {
    public static void func(){
        // write your code here
        //263+85
/*        int u=263+85;
        System.out.println(u);

        //468+119
        long d=468+119;
        System.out.println(d);*/
        //y=0,5x
        Scanner scanner     =new Scanner (System.in);
         System.out.println("y ni krting");
         double x = scanner.nextDouble();
          double y=0;
         y=0.5*x;
         System.out.println ("javob  ;"  +y
         );
          scanner =new Scanner (System.in);
         System.out.println("y ni krting" );
          x= scanner.nextDouble();
         double d=0;
         d=-2*x-4;
         System.out.println("javob;"+ d);
         scanner =new Scanner (System.in);
         System.out.println("f ni krting" );
         double f=scanner.nextDouble();
         f=0;
         f=-3.5f;
         System.out.println("javob;"+f );
         scanner=new Scanner (System.in);
         System.out.println("a ni krting" );
         double a=scanner.nextByte();
         a=0;
         a=  2*x+2;
         System.out.println("javob"+a);
    }
}
