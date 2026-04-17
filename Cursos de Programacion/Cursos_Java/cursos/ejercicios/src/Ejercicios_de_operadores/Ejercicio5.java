package Ejercicios_de_operadores;

import java.util.Scanner;

public class Ejercicio5 {
    public static void  main (String[] args){
        Scanner entrada = new Scanner(System.in);
        float participacion, primerExamen, segundoExamen, examenFinal, NotaFinal;

        System.out.println("Digite la primera nota");
        participacion = entrada.nextFloat();
        System.out.println("Digitime del primer examen parcial");
        primerExamen = entrada.nextFloat();
        System.out.println("Digitame la nota del segundo examen parcial");
        segundoExamen = entrada.nextFloat();
        System.out.println("Digitame la nota del ultimo examen parcial");
        examenFinal = entrada.nextFloat();

        participacion *=  0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;

        NotaFinal = participacion+primerExamen+segundoExamen+examenFinal;

        System.out.println("\n La nota final es: "+NotaFinal);





    }
    }
