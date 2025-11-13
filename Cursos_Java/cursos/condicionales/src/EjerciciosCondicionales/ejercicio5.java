package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio5 {
    public static void main (String[] args){
        int horasTrabajadas;
        float salarioTotal;

        horasTrabajadas  = Integer.parseInt(JOptionPane.showInputDialog("Dime las horas trabajadas"));

        if(horasTrabajadas <= 40){
            salarioTotal = horasTrabajadas * 16;
            JOptionPane.showMessageDialog(null,"El salario total es: "+salarioTotal);
        }else{
            salarioTotal = (40*16) + (horasTrabajadas-40)*20;
            JOptionPane.showMessageDialog(null,"El salario con tus horas extras es:"+salarioTotal);
        }

    }

    }
