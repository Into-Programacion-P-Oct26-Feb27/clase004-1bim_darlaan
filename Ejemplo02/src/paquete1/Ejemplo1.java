/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner var1 = new Scanner(System.in);
        var1.useLocale(Locale.US); // para ingresar los decimales con 
                                        // punto
                                        // no con coma
        // declarar las variables
        String nombreAsignatura1;
        String nombreAsignatura2;
        double notaAsignatura1;
        double notaAsignatura2;
        
        System.out.println("Ingrese nombre de asignatura 1");
        nombreAsignatura1 = var1.nextLine();
        System.out.println("Ingrese nota de asignatura 1");
        notaAsignatura1 = var1.nextDouble();
        System.out.println("Ingrese nombre de asignatura 2");
        nombreAsignatura2 = var1.nextLine();
        System.out.println("Ingrese nota de asignatura 2");
        notaAsignatura2 = var1.nextDouble();
        
        System.out.printf("Asignatura 1: %s\nNota 1:%.2f\nAsignatura 2:%s\n"
                + "Nota 2: %.2f\n",
                nombreAsignatura1,
                notaAsignatura1,
                nombreAsignatura2,
                notaAsignatura2);
   
    }
    
}
