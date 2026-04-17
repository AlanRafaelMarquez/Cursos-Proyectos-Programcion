package Matrices;

import javax.swing.*;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int matriz [][], nFilas,nColumnas;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de columnas: "));
        matriz = new int[nFilas][nColumnas];

        System.out.println("Digita la matriz");

        for (int i = 0; i < nFilas; i++){
            for(int j = 0; j<nColumnas; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for(int i = 0;i<nFilas;i++){//Numero de filas
            for (int j = 0; j<nColumnas; j++){//Numero de columnas
                System.out.print(matriz[i][j]);

            }
            System.out.println();
        }
    }


}
