package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio12 {
    public static void main (String[] args){
        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Dime tu calificacion"));

        switch (nota){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            break;
            case 6: JOptionPane.showMessageDialog(null,"Nota suficiente");
            break;
            case 7: JOptionPane.showMessageDialog(null,"Suficiente");
            break;
            case 8: JOptionPane.showMessageDialog(null,"Bien");
            break;
            case 9: JOptionPane.showMessageDialog(null,"Notable");
            break;
            case 10: JOptionPane.showMessageDialog(null,"Sobresaliente");
            break;
            default:JOptionPane.showMessageDialog(null,"Esa nota no existe");
            break;

        }
    }

    }
