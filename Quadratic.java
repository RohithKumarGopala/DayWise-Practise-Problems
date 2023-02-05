package com.basicProgarmms;
import java.util.Scanner;

import static java.lang.Math.*;

public class Quadratic
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;    //Quadratic Variables Declaration
        System.out.println("Enter the value of a..");
        a=sc.nextInt();   //Quadratic Variables Initialization
        System.out.println("Enter the value of b..");
        b=sc.nextInt();    //Quadratic Variables Initialization
        System.out.println("Enter the value of c..");
        c=sc.nextInt();;   //Quadratic Variables Initialization
        quadraticRoots(a,b,c);   //Function Call

    }

    static void quadraticRoots(int a,int b,int c)
    {
        //Check whether roots are possible or not
        if (a == 0)
        {
            System.out.println("The value of a cannot be 0.");
            return;
        }
        //calculating discriminant (d)
        int d = b * b - 4 * a * c;
        double D = sqrt(abs(d));
        if (d > 0)
        {
            System.out.println("The roots of the equation are real and different. \n");
            System.out.println((double)(-b + D) / (2 * a) + "\n"+ (double)(-b - D) / (2 * a));
        }
        else if (d == 0)
        {
            System.out.println("The roots of the equation are real and same. \n");
            System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));
        }
        // executes if d < 0
        else
        {
            System.out.println("The roots of the equation are complex and different. \n");
            System.out.println(-(double)b / (2 * a) + " + i"+ D + "\n"+ -(double)b / (2 * a)+ " - i" + D);
        }
       }
}