package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][], nFilas,nColumnas,sumaFilas,summaColumnas;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digitael numero de filas"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digitael numero de columnas"));

        matriz = new int[nFilas][nColumnas];

        System.out.println("Digita la matriz");

        for(int i =0; i < nFilas; i++ ){
            for (int j = 0; j < nColumnas; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }


        System.out.println("\nLa matriz es: ");

        for (int i = 0; i<nFilas; i++){
            for(int j = 0; j < nColumnas; j++){
                System.out.print(matriz[i][j]+ "");
            }
            System.out.println("");
        }


        //sumar las filas de una matriz
        for(int i = 0; i <nFilas; i++){
            sumaFilas = 0;
            for (int j = 0; j < nColumnas;j++){
                sumaFilas += matriz[i][j];
            }
            System.out.print("\nLa suma de la fila["+i+"] es: "+sumaFilas);
        }

        //suma de columas
        for(int j = 0; j <nColumnas; j++){
            summaColumnas = 0;
            for (int i = 0 ; i<nFilas; i++){
                summaColumnas += matriz[i][j];
            }
            System.out.print("\nLa suma de la columna["+j+"] es: "+summaColumnas);

        }




    }
    }
