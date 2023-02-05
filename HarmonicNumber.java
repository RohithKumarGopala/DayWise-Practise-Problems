package com.basicProgarmms;
import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String arg[])
    {
        double n,i;
        double sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextDouble();
        for( i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println("Harmonic value = "+sum);
}
}