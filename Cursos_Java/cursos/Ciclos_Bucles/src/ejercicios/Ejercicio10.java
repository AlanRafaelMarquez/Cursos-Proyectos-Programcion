package ejercicios;

import javax.swing.*;

public class Ejercicio10 {
    public static void main (String[] args) {
        int suma = 0,numero = 0;
        for (int i = 1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Dime el numero: "+i));
            suma += numero;

        }
        System.out.println("La suma de los numeros es: "+suma);
    }

    }
