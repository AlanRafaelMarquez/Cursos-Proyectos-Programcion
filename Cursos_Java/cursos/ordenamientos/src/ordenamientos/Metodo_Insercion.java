package ordenamientos;

import javax.swing.*;
import java.util.Scanner;

public class Metodo_Insercion {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo [], nElementos,pos,aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Figita el numero de elementos del arreglo:  "));

        arreglo = new int[nElementos];

        System.out.println("Digita el arreglo");

        for(int i = 0; i < nElementos;i++){
            System.out.print((i+1)+". Digita numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Ordenamiento por insercion
        for(int i = 0;i<nElementos;i++){
            pos = i;
            aux = arreglo[i];

            while ((pos>0) && (arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        System.out.println("\nOrden asendente ");

        for(int i = 0; i < nElementos; i++){
            System.out.print(arreglo[i]+" - ");
        }

        System.out.println("\nOrden desendente");

        for (int i = (nElementos-1); i >= 0; i--){
            System.out.print(arreglo[i]+" - ");
        }
    }
    }
