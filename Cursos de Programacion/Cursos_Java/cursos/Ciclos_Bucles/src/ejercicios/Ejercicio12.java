package ejercicios;

import javax.swing.*;

public class Ejercicio12 {
    public static void main (String[] args) {
        long numero, multiplicacion = 1  ;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Dime el numero y te dire el factorial: "));

        for (int i = 1; i <= numero; i++){
            multiplicacion *= i;
        }

        System.out.println("El factorial del numero es: "+ multiplicacion);

    }

    }
