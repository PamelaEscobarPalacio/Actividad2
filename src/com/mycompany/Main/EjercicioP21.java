package com.mycompany.EjercicioP21;
import java.util.Scanner ;
public class EjercicioP21 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println (" Ingrese la longitud del primer lado del triangulo:");
        double lado1 = scanner . nextDouble();
        System.out.println (" Ingrese la longitud del segundo lado del triangulo:");
        double lado2 = scanner.nextDouble();
        System.out.println (" Ingrese la longitud del tercer lado del triangulo:");
        double lado3 = scanner.nextDouble();
        double perimetro = lado1 + lado2 + lado3;
        double semiperimetro = perimetro / 2;
        double area = Math . sqrt ( semiperimetro * ( semiperimetro - lado1 ) * ( semiperimetro - lado2 ) * ( semiperimetro - lado3 ) ) ;

        System . out . println ("\n Resultados :") ;
        System . out . println (" Perimetro : " + perimetro ) ;
        System . out . println (" Semiperimetro : " + semiperimetro ) ;
        System . out . println (" Area : " + area ) ;
        scanner . close () ;
    }
}