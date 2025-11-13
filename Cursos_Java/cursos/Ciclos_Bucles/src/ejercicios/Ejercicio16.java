package ejercicios;

import javax.swing.*;

public class Ejercicio16 {
    public static void main (String[] args) {
        int numero, res;

         numero = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero entre 1-10: "));

         if (numero <= 10){
             for (int i = 1; i <= 10; i++ ){
                 res = numero * i;
                 System.out.println(""+numero+" X "+i+" = "+res);

             }

         }else{
             System.out.println("El numero no coincide");
         }
    }

    }
