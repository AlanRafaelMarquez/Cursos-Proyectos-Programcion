package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];

        a = new int [12];
        b = new int [12];
        c = new int [24];



        System.out.println("Dime los datos del primer arreglo: ");

        for(int i = 0; i<12; i++){
            System.out.print((i+1)+". Dime el numero: ");
            a[i] = entrada.nextInt();

        }

        System.out.println("Dime los datos del segundo arreglo: ");

        for(int i = 0; i <12; i++){
            System.out.print((i+1)+". Dime el numero: ");
            b[i] = entrada.nextInt();

        }

        int j = 0;
        for(int i = 0; i < 12; i += 3){
            // Copiar 3 elementos de a
            for(int k = 0; k < 3; k++){
                c[j] = a[i + k];
                j++;
            }
            // Copiar 3 elementos de b
            for(int k = 0; k < 3; k++){
                c[j] = b[i + k];
                j++;
            }
        }
        System.out.print("El tercer arreglo es: ");
        for(int i = 0; i<24;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }

    }
