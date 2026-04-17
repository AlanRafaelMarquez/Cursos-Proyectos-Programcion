package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero, sitioNumero = 0, j = 0;

        System.out.println("Llenar el arreglo");
        do {
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + ". Dime numero: ");
                arreglo[i] = entrada.nextInt();
            }

            for (int i = 0; i < 4; i++) {
                if (arreglo[i] < arreglo[i + 1]) {
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("\nEl arreglo no esta en forma creciente, vuelva a digitar los numeros");
            }
        } while (creciente == false);

        System.out.print("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();

        while (arreglo[j]<numero && j <5){
            sitioNumero++;
            j++;
        }
        for (int i = 4;i> sitioNumero; i-- ){
            arreglo[i+1] = arreglo[i];

        }
        arreglo[sitioNumero] = numero;

        System.out.println("\nEl arreglo queda: ");

        for(int i = 0 ; i < 6; i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
    }
    }
