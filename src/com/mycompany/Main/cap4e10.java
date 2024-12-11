package com.mycompany.Main;
import java.util.Scanner ;

public class cap4e10 {
    public static void main ( String [] args ) {
        Scanner scanner = new Scanner ( System . in ) ;

        System . out . println (" Ingrese el numero de inscripcion :") ;
        String numeroInscripcion = scanner . nextLine () ;
        System . out . println (" Ingrese el nombre del estudiante :") ;
        String nombres = scanner . nextLine () ;
        System . out . println (" Ingrese el patrimonio del estudiante :") ;
        double patrimonio = scanner . nextDouble () ;
        System . out . println (" Ingrese el estrato social del estudiante :") ;
        int estrato = scanner . nextInt () ;
        double pagoMatricula = 50000;
        if ( patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += 0.03 * patrimonio ;}

        System . out . println ("\nEl estudiante con numero de inscripcion " +
                numeroInscripcion + " y nombre " + nombres + " debe pagar : $" + pagoMatricula ) ;
        scanner . close () ;
    }
}