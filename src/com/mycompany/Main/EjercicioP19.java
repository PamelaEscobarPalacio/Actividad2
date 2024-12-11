package com.mycompany.EjercicioP19;
import java.util.Scanner;

public class EjercicioP19 {
    public static void main ( String [] args ) {
        Scanner scanner = new Scanner (System.in);

        System . out . println (" Ingrese el valor del lado del triangulo equilatero:");
        double lado = scanner . nextDouble();
        double perimetro = 3 * lado ;
        double altura = ( Math.sqrt (3) / 2) * lado;
        double area = ( Math.sqrt (3) / 4) * lado * lado;

        System . out . println ("\n Resultados :") ;
        System . out . println (" Perimetro : " + perimetro ) ;
        System . out . println (" Altura : " + altura ) ;
        System . out . println (" Area : " + area) ;
        scanner . close ();
    }
}
