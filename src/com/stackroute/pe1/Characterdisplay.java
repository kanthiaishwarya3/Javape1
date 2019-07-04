package com.stackroute.pe1;


import java.util.Scanner;

public class Characterdisplay
{
    public static void main(String args[])
    {
        System.out.println("Enter the character input"); //Accepting user input
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a>='A' && a<='Z') //Validating Capital Letters
        {
            System.out.println("Capital Letter");
        }
        else if(a>='a' && a<='z')  // Validating Small Case Letters
        {
            System.out.println("Small Case Letter");
        }
        else if(a>='0' && a<='9')  // Digits validation
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.print("Special Symbol");  // Special Symbols
        }
    }
}