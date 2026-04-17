package Ejercicios_de_operadores;

import java.util.Scanner;

//Hacer un pograma que calcule el cuadrado de una suma
public class Ejercicio6 {
    public static void  main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1, num2,cuadrado,resultado;

        System.out.println("Dime el primer numero: ");
        num1 = entrada.nextFloat();
        System.out.println("Dime el segundo numero: ");
        num2 = entrada.nextFloat();

        cuadrado = num1+num2;
        resultado = (float) Math.pow(cuadrado,2);

        System.out.println("El cuadrado del la suma de los dos numeros es: "+resultado);

    }
    }
