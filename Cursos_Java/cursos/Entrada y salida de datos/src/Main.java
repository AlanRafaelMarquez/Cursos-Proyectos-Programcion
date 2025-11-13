import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Guardar datos en varibles o en costantes
        Scanner entrada = new Scanner(System.in);
        //double numero;


        //System.out.println("Dime un numero: ");
        //Para guardar un tipo de Dato Entero
        //numero = entrada.nextInt();
        //Para Guardar un tipo de Dato Decimal
        //numero = entrada.nextFloat();
        //Para Guardar un tipo de Dato Decimal
        //numero = entrada.nextDouble();
        //System.out.println("El numero es: "+numero);
        char letra;
        System.out.println("Dime una letra: ");
        letra = entrada.next().charAt(0);
        System.out.println("El caracter es: "+ letra);



        /*String cadena;
        System.out.println("Digitame una cadena: ");
        cadena = entrada.nextLine();
        System.out.println("La cadena es: "+cadena);

         */

    }
}