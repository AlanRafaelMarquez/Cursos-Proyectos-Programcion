package Condicionales;

import javax.swing.*;

public class If_else {
    public static void main (String[] args){

        int numero, dato =5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("igite un numero: "));
        if (numero <= dato){
            JOptionPane.showMessageDialog(null,"El numero es  5 o menor ");
        }else {
            JOptionPane.showMessageDialog(null,"El numero es mayor a 5 ");
        }
        /*
        * ==: Igualdad
        * !=: Diferencia
        * >: Mayor
        * >=: Mayor o igual
        * <: Menor
        * <=: Menor o igual
        * */

    }

}
