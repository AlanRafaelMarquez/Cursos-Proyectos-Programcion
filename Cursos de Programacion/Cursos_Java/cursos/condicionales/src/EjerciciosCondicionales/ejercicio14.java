package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio14 {
    public static void main (String[] args){

        float unidadKg,g,mg,lb,oz,t;
        int opciones;
        unidadKg = Float.parseFloat(JOptionPane.showInputDialog("Dime los kilos que quieres convertir:  "));

        opciones = Integer.parseInt(JOptionPane.showInputDialog("Dime como quieres convertir tus: "+unidadKg+"\n"
                +"1. Gramos\n"
                +"2. Miligramos\n"
                +"3. Libras\n"
                +"4. Onzas\n"
                +"5. Toneladas\n"
                +"6. Salir"));

        switch (opciones){
            case 1: g =  unidadKg * 100;
            JOptionPane.showMessageDialog(null,"La conversion es de: "+g);
            break;
            case 2: mg =  unidadKg * 1000000;
            JOptionPane.showMessageDialog(null,"La conversion es de: "+mg);
            break;
            case 3: lb = (float) (unidadKg * 2.20462);
                JOptionPane.showMessageDialog(null,"La conversion es de: "+lb);
                break;
            case 4: oz = (float) (unidadKg * 35.274);
                JOptionPane.showMessageDialog(null,"La conversion es de: "+oz);
                break;
            case 5: t = (float) (unidadKg * 0.001);
                JOptionPane.showMessageDialog(null,"La conversion es de: "+t);
                break;
            case 6:
                break;
            default: JOptionPane.showMessageDialog(null,"Te equivocaste de opcion mi niño");

        }


    }

    }
