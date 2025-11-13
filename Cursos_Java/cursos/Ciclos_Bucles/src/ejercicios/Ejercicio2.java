package ejercicios;

import javax.swing.*;

public class Ejercicio2 {
    public static void main (String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero positivo o negativo: "));

        while(num != 0){
            if (num >= 1){
            JOptionPane.showMessageDialog(null,"El numero "+num+" es positivo");
        }else{
                JOptionPane.showMessageDialog(null,"El numero "+num+" es negativo");

            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Dime otro numero positivo o negativo: "));

        }
    }

    }
