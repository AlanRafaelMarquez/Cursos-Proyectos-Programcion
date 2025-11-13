package ejercicios;

import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args) {
        int numero, aleatorio, contador = 0;


        aleatorio = (int) (Math.random()*100);

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
                    if (aleatorio > numero){
                        System.out.println("Digita un numero mayor: ");
                    }else {
                        System.out.println("Digita un numero menor: ");
                    }

                    contador++;
        }while (numero != aleatorio);
        System.out.println("Genial adivinaste el numero en "+contador+" intentos");
    }

    }
