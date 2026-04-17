package Ciclos_bucles;

import java.util.Scanner;

public class For {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador;
        System.out.print("Digitame la cantidad de terminos: ");
        contador = entrada.nextInt();

        for (int i= 2; i<=contador; i+=2 ){
            System.out.println(i);
        }
    }

    }
