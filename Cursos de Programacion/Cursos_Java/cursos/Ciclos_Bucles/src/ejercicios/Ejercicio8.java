package ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=0, contador;

        System.out.print("Digita cuantos numeros quiere en la pantalla: ");
        contador = entrada.nextInt();

        while ( i <= contador){
            System.out.println(i);
            i ++ ;
        }
    }

    }
