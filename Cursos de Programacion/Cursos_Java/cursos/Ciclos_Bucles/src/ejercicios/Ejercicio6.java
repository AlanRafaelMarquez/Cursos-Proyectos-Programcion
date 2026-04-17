package ejercicios;

import javax.swing.*;

public class Ejercicio6 {
    public static void main (String[] args) {
        int numero,suma = 0 ;


        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Dime los numeros y te los estare sumando: "));
            suma += numero;
        }while (numero != 0);
        System.out.println("La suma de todos los numero es: "+ suma);
    }
    }
