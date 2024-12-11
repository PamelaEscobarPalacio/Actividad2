package com . mycompany . cap4e14 ;
import java . util . Scanner ;
public class cap4e14 {
public static void main ( String [] args ) {
    Scanner scanner = new Scanner ( System . in ) ;
    System . out . println (" Ingrese las ventas del departamento 1:") ;
    double ventasDpto1 = scanner . nextDouble () ;
    System . out . println (" Ingrese las ventas del departamento 2:") ;
    double ventasDpto2 = scanner . nextDouble () ;
    System . out . println (" Ingrese las ventas del departamento 3:") ;
    double ventasDpto3 = scanner . nextDouble () ;
    System . out . println (" Ingrese el salario de los vendedores :") ;
    double salarioBase = scanner . nextDouble () ;
    double totalVentas = ventasDpto1 + ventasDpto2 + ventasDpto3 ;
    double porcentajeVentas = 0.33 * totalVentas ;
    double salarioDpto1 = ( ventasDpto1 > porcentajeVentas ) ?
            salarioBase * 1.2 : salarioBase ;
    double salarioDpto2 = ( ventasDpto2 > porcentajeVentas ) ?
            salarioBase * 1.2 : salarioBase ;
    double salarioDpto3 = ( ventasDpto3 > porcentajeVentas ) ?
            salarioBase * 1.2 : salarioBase ;
    System . out . println (" Salario vendedores departamento 1: $" +
            salarioDpto1 ) ;
    System . out . println (" Salario vendedores departamento 2: $" + salarioDpto2 ) ;
    System . out . println (" Salario vendedores departamento 3: $" + salarioDpto3 ) ;
    scanner . close () ;
}}