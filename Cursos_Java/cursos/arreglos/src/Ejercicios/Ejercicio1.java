package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        float [] numeros = new float[5];

        System.out.println("Guardando los datos de un arreglo");
        for(int i = 0; i<5;i++){
            System.out.println("Digita el "+(i+1)+" numero: ");
            numeros[i] = entrada.nextFloat();

        }
        System.out.println("\nImrimir los elementos del arreglo");

        for(float i: numeros){
            System.out.println(i);
        }

    }

    }
