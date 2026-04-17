package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio6 {
    public static void main (String[] args){
        int num1,num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Dime el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Dime el primer numero: "));

        if (num1 % 2 == 0 && num2 % 2 == 0){
            JOptionPane.showMessageDialog(null,"Los dos numeros son pares");

        }else{
            JOptionPane.showMessageDialog(null,"Algun numero de los dos es impar");
        }
    }

    }
