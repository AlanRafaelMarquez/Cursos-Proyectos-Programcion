package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];
        a = new int[10];
        b = new int[10];
        c = new int[20];

        System.out.println("Digita el primer arreglo: ");

        for(int i =0 ; i < 10;i++){
            System.out.print((i+1)+". Digita un numero: ");
            a[i] = entrada.nextInt();
        }

        System.out.println("\nDigita el segundo arreglo: ");

        for(int i =0 ; i < 10;i++){
            System.out.print((i+1)+". Digita un numero: ");
            b[i] = entrada.nextInt();
        }
        int j = 0;
        for(int i = 0; i<10;i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }

        System.out.print("El tercer arreglo es: ");
        for(int i = 0; i<20;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }

    }
