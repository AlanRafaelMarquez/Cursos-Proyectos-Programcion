package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo [] = new int[10];
        int numero;

        System.out.println("Dime diez numeros ");

        for(int i = 0; i<10; i++){
            System.out.print((i+1)+". Dime el numero: ");
            arreglo[i] = entrada.nextInt();

        }
        System.out.println("Dime la posicion que quieres eliminar: ");
        numero = entrada.nextInt();
        int[] nuevoArreglo = new int[arreglo.length - 1];
        //Se sustituye el numero que elejimos
        for (int i = 0, j = 0; i < arreglo.length; i++) {
            if (i != numero) {
                nuevoArreglo[j++] = arreglo[i];
            }
        }

        for(int i = 0 ; i < nuevoArreglo.length; i++){
            System.out.println(nuevoArreglo[i]);
        }
    }

    }
