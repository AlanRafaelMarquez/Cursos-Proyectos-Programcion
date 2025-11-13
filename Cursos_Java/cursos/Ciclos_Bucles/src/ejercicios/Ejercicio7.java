package ejercicios;

import javax.swing.*;

public class Ejercicio7 {
    public static void main (String[] args) {
        int numero, elementos = 0, suma = 0;
        float media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));

        while (numero >= 0){
            suma += numero;
            elementos ++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        }
        if (elementos == 0){
            System.out.println("Error de la divison el cero no existe");
        }else{
            media = (float)suma/elementos;
            System.out.println("La media es: "+media);
        }
    }

    }
