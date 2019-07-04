package com.stackroute.pe1;
import java.util.Scanner;
public class Numberiteration {
    public static void main(String[] args) {
        int i,j,n;


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a no: ");
        n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(i);
        }

    }
}
