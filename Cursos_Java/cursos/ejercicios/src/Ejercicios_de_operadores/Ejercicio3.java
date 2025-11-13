package Ejercicios_de_operadores;

import java.util.Scanner;

public class Ejercicio3 {
    public static void  main (String[] args){
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;

        System.out.println("Dime la cantidad que tiene guillermo: ");
        guillermo = entrada.nextFloat();

        luis = guillermo/2;
        juan = (guillermo+luis)/2;
        total = guillermo+luis+juan;
        //Con el sout y tab podemos poner el system mas facil


        System.out.println("\nLa cantidad de dinero de los tres es: "+total);
    }
}
