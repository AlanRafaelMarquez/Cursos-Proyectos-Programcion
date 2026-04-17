package Ejercicios_de_operadores;

import java.util.Scanner;

public class Ejercicio7 {
    public static void  main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horasTotales, semana, dias, horas;

        System.out.println("Digite el numero de horas: ");
        horasTotales = entrada.nextInt();

        semana = horasTotales / 168;
        dias = horasTotales%168 /24;
        horas = horasTotales% 24;

        System.out.println("\n El equivalente es: ");
        System.out.println("Semanas:"+semana);
        System.out.println("Dias:"+dias);
        System.out.println("Horas:"+horas);
    }
}

