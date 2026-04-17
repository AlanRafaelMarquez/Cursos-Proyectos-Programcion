package Ejercicios_de_operadores;

import java.util.Scanner;

/*Hacer un programa que calculer e imprima el salario semanal
de un empleado a partir de sus horas tarbajadas y de su salario por hora
* */
public class Ejercicio2 {
    public static void  main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int hora_trabajdas, salario_hora = 30, calcular ;

        System.out.println("Dime cuantas horas has trabajado esta semana: ");
        hora_trabajdas = entrada.nextInt();

        calcular = hora_trabajdas*salario_hora;

        System.out.println("El salario semanal es un total de: "+calcular);

    }
}
