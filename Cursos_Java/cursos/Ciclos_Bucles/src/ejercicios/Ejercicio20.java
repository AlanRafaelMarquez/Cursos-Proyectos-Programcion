package ejercicios;

import javax.swing.*;

public class Ejercicio20 {
    public static void main (String[] args) {
        int cantidad_sueldos = 0, sueldos, mayor_sueldo = 0;
        cantidad_sueldos = Integer.parseInt(JOptionPane.showInputDialog("Dime cuantos sueldos quieres introduccir: "));
        for(int i = 1; i <= cantidad_sueldos; i++){
            sueldos = Integer.parseInt(JOptionPane.showInputDialog("Dime el sueldo: "));
            if (sueldos >= mayor_sueldo){
                mayor_sueldo = sueldos;

            }
        }
        System.out.println("El mayor sueldo es: "+mayor_sueldo);
    }

    }
