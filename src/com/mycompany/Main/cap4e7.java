package com.mycompany.cap4e7;
import java.util.Scanner;

public class cap4e7 {
    public static void main ( String [] args ) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el valor de A:");
        int A = scanner.nextInt();
        System.out.println("Ingrese el valor de B:");
        int B = scanner.nextInt();
        if (A>B) {
            System . out . println ("A es mayor que B") ;} else if ( A == B )
            {System . out . println ("A es igual a B") ;} else
            {System . out . println ("A es menor que B") ;}
        scanner . close () ;
    }
}
