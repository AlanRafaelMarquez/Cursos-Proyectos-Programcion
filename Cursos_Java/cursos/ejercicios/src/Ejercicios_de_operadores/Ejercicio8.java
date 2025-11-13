package Ejercicios_de_operadores;

import java.util.Scanner;

public class Ejercicio8 {
    public static void  main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a,b,c,eleb,multiA,multiC,restACyelB,raiz,multiA2,arriba,arriba2,resultado1,resultado2;

        System.out.println("Dime el valor de a:");
        a = entrada.nextDouble();
        System.out.println("Dime el valor de b:");
        b = entrada.nextDouble();
        System.out.println("Dime el valor de c:");
        c = entrada.nextDouble();

        eleb = Math.pow(b,2);
        multiA = 4 * a;
        multiC = c * multiA;

        restACyelB = eleb - multiC;
        multiA2 = 2 * a;
        raiz = Math.sqrt(restACyelB);
        arriba = -b + raiz;
        arriba2 = -b - raiz;
        resultado1 = arriba / multiA2;
        resultado2 = arriba2 / multiA2;

        System.out.println("El primer resultado es: "+resultado1);
        System.out.println("El segudo resultado es: "+resultado2);


    }
    }
