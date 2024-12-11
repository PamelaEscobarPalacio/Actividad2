package com.mycompany.cap4e11 ;
import java.util.Scanner ;
public class cap4e11 {
    public static void main ( String [] args ) {
        Scanner scanner = new Scanner ( System . in ) ;
        System.out.println (" Ingrese el primer numero :") ;
        int numero1 = scanner . nextInt () ;
        System.out.println (" Ingrese el segundo numero :") ;
        int numero2 = scanner . nextInt () ;
        System.out.println (" Ingrese el tercer numero :") ;
        int numero3 = scanner . nextInt () ;
        int mayor ;
        if ( numero1 > numero2 && numero1 > numero3 ) {
            mayor = numero1 ;} else if ( numero2 > numero3 )
            {mayor = numero2 ;} else {mayor = numero3;}
        System.out.println ("El valor mayor entre " + numero1 + ", " +
                numero2 + " y " + numero3 + " es: " + mayor ) ;
        scanner . close () ;
    }
}
