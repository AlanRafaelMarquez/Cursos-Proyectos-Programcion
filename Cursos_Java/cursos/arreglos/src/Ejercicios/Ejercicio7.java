package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[]args) {
        Scanner  entrada = new Scanner(System.in);
        int arreglo [] = new int[10];
        boolean creciente =false,decreciente = false;

        System.out.println("Llenar los arreglos: ");
        for(int i = 0; i<10;i++){
            System.out.print((i+1)+". Digita un numero: ");
            arreglo[i] = entrada.nextInt();

        }
        for(int i = 0;i<9; i++){
            if(arreglo[i] < arreglo[i+1]){
                creciente = true;
            }
            if(arreglo[i] > arreglo[i+1]){
                decreciente = true;
            }

        }
        if (creciente == true && decreciente == false){
            System.out.println("\nEl arreglo esta en forma creciente ");
        } else if (creciente == false && decreciente == true) {
            System.out.println("\nEl arreglo esta en forma decreciente");
        } else if (creciente == true && decreciente == true) {
            System.out.println("\nEl arreglo esta desordenado");
        }else if (creciente == false && decreciente == false){
            System.out.println("\nTodos los numeros del arreglo son iguales");
        }


    }

    }
