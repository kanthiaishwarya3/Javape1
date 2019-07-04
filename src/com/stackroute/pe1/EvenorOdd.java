package com.stackroute.pe1;
import java.util.Scanner;

public class EvenorOdd {

    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        if(n>20&&n<30) {
            if(n%2==0) {
                System.out.println("Jerry");
            }
            else
            {
                System.out.println("Tom");
            }
        }
        else
        {
            System.out.println("not in given range");
        }

//System.out.println((n>20&&n<=0)?((n%2)==0?"Jerry":"Tom"):"not in range");

    }
}