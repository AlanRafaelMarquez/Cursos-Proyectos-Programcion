package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];

        System.out.println("Dime 5 numeros: ");

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Dime el numero: ");
            numeros[i] = entrada.nextFloat();

        }

        System.out.println("Los numeros son: ");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);

        }
    }

    }
