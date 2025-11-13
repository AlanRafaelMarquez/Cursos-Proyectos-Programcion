package ejercicios;

import javax.swing.*;

public class Ejercicio22 {
    public static void main (String[] args) {
        int calificaciones;
        boolean suspedio=false;

        for(int i = 1; i <= 5; i++){
            calificaciones = Integer.parseInt(JOptionPane.showInputDialog("Dime la "+i+" calificacion: "));

            if(calificaciones <= 5){
                suspedio = true;
            }
        }
        if(suspedio == true){
            System.out.println("Algun alumno reprobo");
        }else {
            System.out.println("Ningun alumno reprobo");
        }
    }

    }
