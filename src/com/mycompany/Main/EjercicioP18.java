package com.mycompany.EjercicioP18;
import java.util.Scanner;

public class EjercicioP18 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese el codigo del empleado");
        int codigo_empleado=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese los nombres del empleado");
        String nombres=scanner.nextLine();

        System.out.println ("Ingrese el numero de horas trabajadas al mes:"
        );
        int horasTrabajadas = scanner.nextInt();

        System.out.println ("Ingrese el valor de la hora trabajada:");
        double valorHora = scanner.nextDouble ();

        System.out.println ("Ingrese el porcentaje de retencion en la fuente:");
        double retencionFuente = scanner.nextDouble();

        double salarioBruto = horasTrabajadas * valorHora ;
        double retencion = salarioBruto * (retencionFuente / 100);
        double salarioNeto = salarioBruto - retencion ;

        System . out . println ("\n Informacion del empleado :") ;
        System . out . println (" Codigo : " + codigo_empleado) ;
        System . out . println (" Nombres : " + nombres ) ;
        System . out . println (" Salario Bruto : $" + salarioBruto ) ;
        System . out . println (" Salario Neto : $" + salarioNeto ) ;

        scanner . close () ;
    }
}