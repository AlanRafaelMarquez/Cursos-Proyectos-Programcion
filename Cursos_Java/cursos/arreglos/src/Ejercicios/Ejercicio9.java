package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo [] = new  int[10];
        int posi9;
        System.out.println("Llenar un arreglo");
        for(int i = 0; i <10;i++){
            System.out.print(i+ ". Dime un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        posi9 = arreglo[9];



        for(int i = 8; i >= 0 ; i--){
            arreglo[i+1] = arreglo[i];
        }

        arreglo[0] = posi9;

        System.out.println("\nEl nuevo arreglo es");
        for(int i = 0; i<10;i++){
            System.out.println(i+"Numero: "+arreglo[i]);
        }

    }
    }
