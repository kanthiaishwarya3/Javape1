package com.stackroute.pe1;



import java.util.Scanner;
public class Repeatlastchar {
    public static void main(String[] args)
    {
        String str; int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        str=input.nextLine();
        System.out.println("Enter a number");
        n=input.nextInt();
        Repeatlastchar obj=new Repeatlastchar();
        obj.charrepeat(str,n);
    }
    public void charrepeat(String str,int n)
    {
        int i;

        String str1=str.substring(str.length()-n);

        for(i=0;i<n;i++)
        {
            str += str1;
        }
        System.out.println(str);

    }
}

