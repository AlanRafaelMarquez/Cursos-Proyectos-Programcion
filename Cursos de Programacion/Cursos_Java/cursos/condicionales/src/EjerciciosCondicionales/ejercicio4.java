package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio4 {
    public static void main (String[] args){
        float compra,resultado, resultado2;




        compra = Integer.parseInt(JOptionPane.showInputDialog("Dime la catidad de la compra"));

        resultado = (float) (compra * 0.20);
        resultado2 = compra - resultado;
        if(compra > 300){
            JOptionPane.showMessageDialog(null,"Tienes un descuento del 20% de tu compra solo pagas"+resultado2);
        }else{
            JOptionPane.showMessageDialog(null,"Tu compra es de: "+compra);
        }

    }

    }
