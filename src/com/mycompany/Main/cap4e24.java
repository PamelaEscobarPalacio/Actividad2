package com . mycompany . cap4e24 ;
import java . util . Scanner ;

public class cap4e24 {
    public static void main ( String [] args ) {
        Scanner scanner = new Scanner ( System . in ) ;
        System . out . println (" Ingrese el peso de la esfera A:") ;
        double pesoA = scanner . nextDouble () ;

        System . out . println (" Ingrese el peso de la esfera B:") ;
        double pesoB = scanner . nextDouble () ;

        System . out . println (" Ingrese el peso de la esfera C:") ;
        double pesoC = scanner . nextDouble () ;

        if ( pesoA > pesoB && pesoA > pesoC ) {
            System . out . println ("La esfera A es la de mayor peso con un peso de " + pesoA ) ;
        }
        else if ( pesoB > pesoA && pesoB > pesoC ) {System . out . println ("La esfera B es la de mayor peso con un peso de " + pesoB ) ;}
        else if ( pesoC > pesoA && pesoC > pesoB ) {System . out . println ("La esfera C es la de mayor peso con un peso de " + pesoC ) ;} else {
            System . out . println ("Las esferas tienen pesos iguales .") ;}
        scanner . close () ;
    }
}


