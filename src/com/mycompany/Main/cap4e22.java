package com . mycompany . cap4e22 ;
import java . util . Scanner ;
public class cap4e22 {
    public static void main ( String [] args ) {Scanner scanner = new Scanner ( System . in );
        System . out . println (" Ingrese el nombre del empleado :") ;
        String nombre = scanner . nextLine () ;
        System . out . println (" Ingrese el salario basico por hora del empleado :") ;
        double salarioPorHora = scanner . nextDouble () ;
        System . out . println (" Ingrese el numero de horas trabajadas en el mes:") ;
        int horasTrabajadas = scanner . nextInt () ;
        double salarioMensual = salarioPorHora * horasTrabajadas ;
        if ( salarioMensual > 450000) {
            System . out . println (" Nombre del empleado : " + nombre ) ;
            System . out . println (" Salario mensual : $" + salarioMensual ) ;} else {
            System . out . println (" Nombre del empleado : " + nombre ) ;}
        scanner . close () ;
    }
}

