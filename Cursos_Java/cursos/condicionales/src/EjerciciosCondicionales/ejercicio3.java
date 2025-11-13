package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio3 {
    public static void main (String[] args){
        char letra;

        letra = JOptionPane.showInputDialog("Digita una letra: ").charAt(0);

        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"Es una letra mayuscula");

        }else {
            JOptionPane.showMessageDialog(null,"Es una letra minuscula");

        }
    }

    }
