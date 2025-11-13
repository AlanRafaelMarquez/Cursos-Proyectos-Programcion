package EjerciciosCondicionales;

import javax.swing.*;

public class ejercicio10 {
    public static void main (String[] args){
        int dia,mes,año;

        año = Integer.parseInt(JOptionPane.showInputDialog("Digita el año"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digita el mes"));
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digita el dia"));



        if (año != 0) {
            if (mes >= 1 && mes <= 12) {
                switch (mes){
                    case 1: if ( dia >= 1 && dia <= 31) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dia es incorrecto");
                    }
                        break;
                    case 2: if ( dia >= 1 && dia <= 28) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dia es incorrecto");
                    }
                        break;
                    case 3: if ( dia >= 1 && dia <= 31) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dia es incorrecto");
                    }
                        break;
                    case 4: if ( dia >= 1 && dia <= 30) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dia es incorrecto");
                    }
                        break;
                    case 5: if ( dia >= 1 && dia <= 31) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dia es incorrecto");
                    }
                        break;
                    case 6: if ( dia >= 1 && dia <= 30) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dia es incorrecto");
                    }
                        break;
                    case 7: if ( dia >= 1 && dia <= 31) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dia es incorrecto");
                    }
                        break;
                    case 8: if ( dia >= 1 && dia <= 31) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dia es incorrecto");
                    }
                        break;
                    case 9: if ( dia >= 1 && dia <= 30) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dia es incorrecto");
                    }
                        break;
                    case 10: if ( dia >= 1 && dia <= 31) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dia es incorrecto");
                    }
                        break;
                    case 11: if ( dia >= 1 && dia <= 30) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dia es incorrecto");
                    }
                        break;
                    case 12: if ( dia >= 1 && dia <= 31) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dia es incorrecto");
                    }
                        break;
                    default:JOptionPane.showMessageDialog(null,"El numero no esta en el rango de 1-5 ");
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "El mes es incorrecto ");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El año es incorrecta");
        }
    }

    }
