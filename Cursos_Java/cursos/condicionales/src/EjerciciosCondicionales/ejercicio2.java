package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio2 {
    public static void main (String[] args){
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Dime el primer numero:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Dime el primer numero:"));

        if (numero1 > numero2){
            JOptionPane.showMessageDialog(null,"El primer numero es mayor");

        } else if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null,"El segudo es mayor");

        }else {
            JOptionPane.showMessageDialog(null,"Los dos numeros son iguales");
        }


    }


    }
