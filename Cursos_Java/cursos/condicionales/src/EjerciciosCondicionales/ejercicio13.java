package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio13 {
    public static void main (String[] args){
        final  int saldo_inicial = 1000;
        int opcion;
        float ingreso, saldo_actual,retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
                +"1. Ingresar numero a la cuenta\n"
                +"2. Retirar dinero de la cuenta\n"
                +"3. Salir"));
        switch (opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digita la catidad que desea ingresar en la cuenta: "));
            saldo_actual = saldo_inicial + ingreso;
            JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldo_actual);
            break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la catidad que desea retirar: "));
            if(retiro>saldo_inicial){
                JOptionPane.showMessageDialog(null,"No cuenta con el saldo suficiente con el retiro");
            }else{
            saldo_actual =   saldo_inicial - retiro;
            JOptionPane.showMessageDialog(null,"Dinero en cuenta: "+ saldo_actual);
        }
            break;
            case 3:break;
            default:JOptionPane.showMessageDialog(null,"Se equivo de opcion de menu");
        }


    }


    }
