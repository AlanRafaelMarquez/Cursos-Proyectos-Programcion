package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int[10];
        System.out.println("Digitas los numeros ");

        for(int i = 0; i<10; i++){
            System.out.print((i+1)+". Dime numero:  ");
            numeros[i] = entrada.nextInt();

        }
        System.out.println("Los numeros son: ");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);

        }

    }

    }
