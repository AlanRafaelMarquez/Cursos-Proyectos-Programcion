package arreglos;

import javax.swing.*;
import java.util.Scanner;

public class Llenar_arreglo {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de elementos del arreglo:  "));

        char[] letras = new char[nElementos];
        System.out.println("Digita los elementos del arreglo: ");

        for (int i = 0; i < nElementos; i++){
            System.out.println((i+1)+". Digita un caracter");
            letras[i] = entrada.next().charAt(0);
        }


        System.out.println("\n Los caracteres del arreglo son: ");
        for (int i=0; i<nElementos;i++){
            System.out.println(letras[i]);
        }
    }

    }
