package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[]args) {
        Scanner entrada =  new Scanner(System.in);
        int arreglo[] = new int[8];
        int posicion, nuevoNumero;


        System.out.println("Dime 8 numeros  ");

       for(int i = 0; i < 8;i++ ) {
           System.out.print((i+1)+". Dime el numero: ");
           arreglo[i] = entrada.nextInt();
       }

        System.out.println("Dime un numero: ");
       nuevoNumero = entrada.nextInt();

        System.out.println("Dime en que posicion quieres ese numero: ");
        posicion = entrada.nextInt();

        int[] nuevoArreglo = new int[arreglo.length + 1];

        for (int i = 0; i < posicion; i++) {
            nuevoArreglo[i] = arreglo[i];
        }

        nuevoArreglo[posicion] = nuevoNumero;

        for (int i = posicion; i < arreglo.length; i++) {
            nuevoArreglo[i + 1] = arreglo[i];
        }



        for(float i: nuevoArreglo){
            System.out.println(i);
        }
    }
    }
