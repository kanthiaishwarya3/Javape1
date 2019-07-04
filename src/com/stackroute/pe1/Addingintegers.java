package com.stackroute.pe1;

import java.util.Scanner;

import java.util.Scanner;
public class Addingintegers{

    public static void main(String args[])
    {
        sum();
    }
    static void sum()
    {
        int sum=0;

        Scanner input=new Scanner(System.in);
        int no_of_times=input.nextInt();
        for(int i=0;i<no_of_times;i++)
        {

            int digit=input.nextInt();
            sum=sum+digit;
        }
        System.out.println(sum);
    }


}