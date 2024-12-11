package com . mycompany . cap4e13 ;
import java . util . Scanner ;
public class cap4e13 {
    public static void main ( String [] args ) {
        Scanner scanner = new Scanner ( System . in ) ;
        System.out.println (" Ingrese el valor de la compra :") ;
        double valorCompra = scanner . nextDouble () ;
        System . out . println (" Ingrese el color de la bolita (BLANCO , VERDE , AMARILLO , AZUL ):") ;
        String colorBolita = scanner . next () . toUpperCase () ;
        double porcentajeDescuento ;
        switch ( colorBolita ) {
            case " BLANCO ":
                porcentajeDescuento = 0;
                break;
            case " VERDE ":
                porcentajeDescuento = 10;
                break;
            case " AMARILLO ":
                porcentajeDescuento = 25;
                break;
            case " AZUL ":
                porcentajeDescuento = 50;
                break;
            default:
                porcentajeDescuento = 100;
                break;}
        double valorPagar = valorCompra - ( porcentajeDescuento *
                valorCompra / 100) ;
        System . out . println ("El cliente debe pagar : $" + valorPagar ) ;
        scanner . close () ;
    }
}