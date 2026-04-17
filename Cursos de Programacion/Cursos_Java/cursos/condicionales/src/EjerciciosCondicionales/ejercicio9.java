package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio9 {
    public static void main (String[] args){
        int dia,mes,año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digita el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digita el mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digita el año"));

        if (dia >= 1 && dia <= 30) {
            if (mes >= 1 && mes <= 12) {
                if (año != 0) {
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "El año es incorrecto");

                }

            } else {
                JOptionPane.showMessageDialog(null, "El mes es incorrecto ");
            }
        }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecta");
            }
        }
    }


