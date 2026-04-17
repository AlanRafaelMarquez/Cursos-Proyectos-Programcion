package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nColumnas,nFilas1,nColumnas1,matriz2[][];

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de filas: "));

        matriz= new int[nFilas][nColumnas];

        System.out.println("    La Matriz     ");

        for(int i = 0; i<nFilas; i++){
            for(int j = 0; j<nColumnas;j++){
                System.out.print("["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        nFilas1 = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de filas: "));
        nColumnas1 = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de filas: "));
        matriz2= new int[nFilas1][nColumnas1];

        System.out.println("    La Matriz     ");

        for(int i = 0; i<nFilas1; i++){
            for(int j = 0; j<nColumnas1;j++){
                System.out.print("["+i+"]["+j+"]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        int[][] matrizResultado = new int[3][3];

        // Sumamos elemento por elemento
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }

        // Mostramos el resultado
        System.out.println("Matriz resultado:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizResultado[i][j] + "\t");
            }
            System.out.println();
        }



    }
}
