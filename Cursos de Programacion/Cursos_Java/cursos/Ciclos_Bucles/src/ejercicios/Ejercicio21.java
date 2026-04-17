package ejercicios;

import javax.swing.*;

public class Ejercicio21 {
    public static void main (String[] args) {
        int numero;
        boolean hay_negtivos = false;

        for (int i = 1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
            if (numero < 0 ){
                hay_negtivos = true;
            }
        }
        if (hay_negtivos == true){
            System.out.println("Si existe un numero negativo");
        }else {
            System.out.println("No existe ningun numero negativo");
        }
    }


    }
