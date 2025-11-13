package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio8 {
    public static void main (String[] args){
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero del 0 al 99999 y te digo las cifras que tiene: "));

        if (numero > 0 && numero <= 9){
            JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene una cifra");

        }
        else if (numero > 10 && numero <= 99){
            JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene dos cifras");

        } else if (numero >= 100 && numero <= 999) {
            JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene tres cifras");
        } else if (numero >= 1000 && numero <= 9999) {
            JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene cuatro cifras");

        }else if (numero >= 10000 && numero <= 99999) {
            JOptionPane.showMessageDialog(null,"El numero "+numero+" tiene cinco cifras");

        }else {
            JOptionPane.showMessageDialog(null,"El numero "+numero+" no coincide ");
        }

    }

    }
