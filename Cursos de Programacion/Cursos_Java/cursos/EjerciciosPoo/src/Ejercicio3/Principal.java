package Ejercicio3;

import java.util.Scanner;

public class Principal {
    public static int indiceCocheMBarato(Vehiculo coches[]){
        float precio;
        int indice=0;

        precio = coches [0].getPrecio();
        for(int i = 1; i<coches.length; i++){
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos,indiceBarato;

        System.out.print("Digita la cantidad de Vehiculos: ");
        numeroVehiculos = entrada.nextInt();

        Vehiculo coches[] = new Vehiculo [numeroVehiculos];

        for (int i = 0; i < coches.length; i++){
            entrada.nextLine();
            System.out.println("\nDigita las caracteristicas del coche "+(i+1)+" : ");
            System.out.print("Intuduzca su marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca el modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Intruduzca el precio: ");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculo(marca,modelo,precio);
        }

        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coches mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
