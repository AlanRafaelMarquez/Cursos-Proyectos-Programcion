package Ejercicios;

import java.util.Scanner;


public class Ejercicio14 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        int arrglo1 [] = new int[10];
        int arrglo2 [] = new int[10];
        int[] arrglo3 = new int[20];

        System.out.println("Dime el primer arreglo");
        for(int i = 0; i <10; i++){
            System.out.print((i+1)+". Digite un numero: ");
            arrglo1[i] = entrada.nextInt();
            arrglo3[i] = arrglo1[i];
        }




        System.out.println("Dime el segundo arreglo");
        for(int i = 0; i <10; i++){
            System.out.print((i+1)+". Digite un numero: ");
            arrglo2[i] = entrada.nextInt();
            arrglo3[i + 10] = arrglo2[i];

    }


        for (int i = 0; i < arrglo3.length - 1; i++) {
            for (int j = 0; j < arrglo3.length - i - 1; j++) {
                if (arrglo3[j] > arrglo3[j + 1]) {
                    // Intercambiar
                    int temp = arrglo3[j];
                    arrglo3[j] = arrglo3[j + 1];
                    arrglo3[j + 1] = temp;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < 20; i++){
            System.out.println(arrglo3[i]);
        }



    }

    }
