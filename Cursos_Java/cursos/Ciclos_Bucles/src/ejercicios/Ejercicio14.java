package ejercicios;

import javax.swing.*;

public class Ejercicio14 {
    public static void main (String[] args) {
        int sueldos , conteo_Mayores=0, suma= 0;

        for (int i = 1; i <= 10; i++){
            sueldos = Integer.parseInt(JOptionPane.showInputDialog("Dime el "+i+" sueldo: "));
            suma += sueldos;
            if (sueldos > 1000){
                conteo_Mayores++;
            }
        }
        System.out.println("La suma de todos los suledos es: "+suma);
        System.out.println("La cantidad de sueldos de mayores es: "+conteo_Mayores);
    }

    }
