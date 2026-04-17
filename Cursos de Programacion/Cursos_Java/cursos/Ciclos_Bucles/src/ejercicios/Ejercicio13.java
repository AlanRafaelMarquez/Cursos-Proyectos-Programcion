package ejercicios;

import javax.swing.*;

public class Ejercicio13 {
    public static void main (String[] args) {
        int numero, suma_positivos = 0, conteo_pos = 0, suma_nega = 0, conteo_nega = 0, conteos_cero = 0;
        float media_pos, media_nega;

        for(int i=1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
            if (numero == 0){
                conteos_cero ++;
            } else if (numero>0) {
                suma_positivos += numero;
                conteo_pos ++;

            }else {
                suma_nega += numero;
                conteo_nega ++;
            }


        }

        if (conteo_pos == 0){
            System.out.println("No se puede sacar la media de los positivos");
        }else {
            media_pos = (float) suma_positivos/conteo_pos;
            System.out.println("La media de los numeros positivos es: "+media_pos);
        }

        if(conteo_nega == 0){
            System.out.println("No se puede sacar la media de los negativos");
        }else {
            media_nega = (float) suma_nega / conteo_nega;
            System.out.println("La media de los negativos es: "+media_nega);
        }
        System.out.println("La cantidad de ceros es: "+conteos_cero);
    }

    }
