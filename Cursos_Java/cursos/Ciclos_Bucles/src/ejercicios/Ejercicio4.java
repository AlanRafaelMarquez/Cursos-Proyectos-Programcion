package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contador = 0;
        System.out.println("Dime un numero positivo: ");
        numero = entrada.nextInt();
        while (numero >= 0 ){
            System.out.print("Dime otro numero positivo: ");
            numero = entrada.nextInt();
            contador ++;
        }
        System.out.println("La numero de veces que se introcujo un numero es: "+contador);

    }

    }
