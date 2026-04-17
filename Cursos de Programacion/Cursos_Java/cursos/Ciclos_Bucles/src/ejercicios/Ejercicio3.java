package ejercicios;

import javax.swing.*;

public class Ejercicio3 {
    public static void main (String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));

        while (numero != 0 ){
            if (numero % 2 == 0){
                System.out.println("El numero "+numero+" es Par ");
            }else {
                System.out.println("El numero "+numero+" es Impar");

            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero: "));

        }
    }

    }
