package com . mycompany . cap4e12 ;
import java . util . Scanner ;
public class cap4e12 {
    public static void main ( String [] args ) {
        Scanner scanner = new Scanner ( System . in ) ;
        System . out . println (" Ingrese el nombre del trabajador :") ;
        String nombre = scanner . nextLine () ;
        System . out . println (" Ingrese el numero de horas trabajadas :") ;
        int horasTrabajadas = scanner . nextInt () ;
        System . out . println (" Ingrese el valor de la hora normal de trabajo : ") ;
        double valorHoraNormal = scanner . nextDouble () ;
        double salario ;
        if ( horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            if ( horasExtras > 8) {
                int horasExtrasExcedentes = horasExtras - 8;
                salario = 40 * valorHoraNormal + 16 * valorHoraNormal + horasExtrasExcedentes * 3 * valorHoraNormal ;}
            else {salario = 40 * valorHoraNormal + horasExtras * 2 * valorHoraNormal ;}} else {
            salario = horasTrabajadas * valorHoraNormal ;}
        System . out . println ("El trabajador " + nombre + " devengo : $" +
                salario ) ;
        scanner . close () ;
    }
}
