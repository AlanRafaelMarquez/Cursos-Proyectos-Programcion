package Ciclos_bucles;

import java.util.Scanner;

public class Do_While {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i=1, contador;
        System.out.println("Digita la catidad de terminos: ");
        contador = entrada.nextInt();

        do{
            System.out.println(i);
            i+= 3;

        }while (i<=contador);
    }


}
