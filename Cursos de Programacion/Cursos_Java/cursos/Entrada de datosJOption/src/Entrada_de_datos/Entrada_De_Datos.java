package Entrada_de_datos;

import javax.swing.JOptionPane;

public class Entrada_De_Datos {
    public static void main (String[] args){
    String cadena;
    int entero;
    char letra;
    double decimal;

    cadena = JOptionPane.showInputDialog("Digite una cadena: ");
    entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
    letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
    decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));

    JOptionPane.showMessageDialog(null,"La cade es: "+ cadena);
    JOptionPane.showMessageDialog(null,"El numero entero es: "+ entero);
    JOptionPane.showMessageDialog(null,"La letra es: "+ letra);
    JOptionPane.showMessageDialog(null,"La decimal es: "+ decimal);

    }
}
