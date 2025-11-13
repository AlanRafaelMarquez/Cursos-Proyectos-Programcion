package TratamientoExepciones;

import java.util.Scanner;

public class TratamientoExepciones {
    public static void main (String[] args){
       /* int num1 = 5, num2 = 0;

        int resultado = num1/num2;

        System.out.println("El resultado es: "+resultado);
        System.out.println("Hola  mundo");*/

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digita un numero: ");
        int numero = entrada.nextInt();

        System.out.println(numero);
    }
}
