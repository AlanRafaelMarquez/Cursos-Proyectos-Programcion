package Ejercicio5;

import java.util.Scanner;

public class Principal {

    public static double mayorArea(TriangulosIsoseles triangulos[]){
        double area;

        area = triangulos[0].obtnerArea();
        for(int i = 1; i < triangulos.length; i++ ){
            if (triangulos[i].obtnerArea() > area){
                area = triangulos[i].obtnerArea();
            }
        }
        return area;
    }
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        double base,lado;
        int nTriangulos;

        System.out.print("Digite elm numero de triangulos a ingresar: ");
        nTriangulos = entrada.nextInt();

        TriangulosIsoseles triangulos[] = new TriangulosIsoseles[nTriangulos];

        for (int i= 0; i < triangulos.length; i++){
            System.out.println("\nDigite los valores para el triangulo "+(i+1)+" : ");
            System.out.print("Intoduce la base: ");
            base = entrada.nextDouble();
            System.out.println("Introduce el lado: ");
            lado = entrada.nextDouble();

            triangulos[i] = new TriangulosIsoseles(base,lado);
            System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("\nEl area del triangulo es:  "+triangulos[i].obtnerArea());
        }

        System.out.println("\nEl are del triangulo de mayor superficie es : "+mayorArea(triangulos));

    }
}
