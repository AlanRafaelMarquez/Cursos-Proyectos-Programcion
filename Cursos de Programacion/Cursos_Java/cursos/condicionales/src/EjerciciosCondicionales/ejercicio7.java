package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio7 {
    public static void main (String[] args){
        int n1,n2,n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));


        if (n1>n2 && n2>n3){
            JOptionPane.showMessageDialog(null,"Orden:"+n1+" - "+n2+" - "+n3);
        } else if (n1>n3 && n3>n2) {
            JOptionPane.showMessageDialog(null,"Orden:"+n1+" - "+n3+" - "+n2);
        }else if (n2>n1 && n1>n3) {
            JOptionPane.showMessageDialog(null,"Orden:"+n2+" - "+n1+" - "+n3);
        } else if (n2>n3 && n3>n1) {
            JOptionPane.showMessageDialog(null,"Orden:"+n2+" - "+n3+" - "+n1);
        }else if (n3>n1 && n1>n2) {
            JOptionPane.showMessageDialog(null,"Orden:"+n3+" - "+n1+" - "+n2);
        }else {
            JOptionPane.showMessageDialog(null,"Orden:"+n3+" - "+n2+" - "+n1);

        }
    }


    }
