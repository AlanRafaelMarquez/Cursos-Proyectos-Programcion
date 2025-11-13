package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio11 {
    public static void main (String[] args){

        int numero1,numero2,suma,resta,multi,div;
        char operacion;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digitame el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digitame el primer numero: "));

        operacion = JOptionPane.showInputDialog("Digita la operacion que deseas realizar").charAt(0);


        switch (operacion){
            case 's':
            case 'S': suma = numero1+numero2;
                      JOptionPane.showMessageDialog(null,"La suma es: "+suma);
                      break;
            case 'r':
            case 'R': resta = numero1-numero2;
                JOptionPane.showMessageDialog(null,"La resta es: "+resta);
                break;

            case 'm':
            case 'M':
            case 'p':
            case 'P': multi = numero1*numero2;
                JOptionPane.showMessageDialog(null,"La multiplicacion es: "+multi);
                break;
            case 'd':
            case 'D': div = numero1/numero2;
                JOptionPane.showMessageDialog(null,"La division es: "+div);
                break;
            default: JOptionPane.showMessageDialog(null,"Error, no esta la operacion");



    }
    }

    }
