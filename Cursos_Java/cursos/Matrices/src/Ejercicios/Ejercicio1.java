package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
          int matriz[][], nfilas,nColumas;
          boolean simetrica = true;

          nfilas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de filas de la matriz 1: "));
        nColumas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de columnas de matriz1: "));

        matriz = new int[nfilas][nColumas];

        System.out.println("Digita la matriz: ");

        for (int i = 0; i <nfilas; i++){
            for (int j = 0; j < nColumas;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }


        if(nfilas == nColumas){
            int i, j;
            i = 0 ;
            while (i<nfilas && simetrica == true){
                j = 0;
                while (j<i && simetrica == true){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica= false;

                    }
                    j++;
                }
                i++;
            }
            if (simetrica == true){
                JOptionPane.showMessageDialog(null,"La matriz es simetrica: ");
            }else {
                JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
            }
        }else{
            JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
        }





    }

    }
