
package com . mycompany . cap4e23 ;
import java . util . Scanner ;
public class cap4e23 {
    public static void main ( String [] args ) {
        Scanner scanner = new Scanner ( System . in ) ;

        System . out . println (" Ingrese el coeficiente A:") ;
        double A = scanner . nextDouble () ;

        System . out . println (" Ingrese el coeficiente B:") ;
        double B = scanner . nextDouble () ;

        System . out . println (" Ingrese el coeficiente C:") ;
        double C = scanner . nextDouble () ;

        double discriminante = B * B - 4 * A * C ;


        if ( discriminante > 0) {
            double x1 = ( - B + Math . sqrt ( discriminante ) ) / (2 * A ) ;
            double x2 = ( - B - Math . sqrt ( discriminante ) ) / (2 * A ) ;
            System . out . println ("Las soluciones son:") ;
            System . out . println ("x1 = " + x1 ) ;
            System . out . println ("x2 = " + x2 ) ;
        } else if ( discriminante == 0) {
            double x = -B / (2 * A ) ;
            System . out . println ("La solucion doble es:") ;
            System . out . println ("x = " + x ) ;} else {
            System . out . println ("La ecuacion no tiene soluciones reales .") ;}
        scanner . close () ;
    }
}