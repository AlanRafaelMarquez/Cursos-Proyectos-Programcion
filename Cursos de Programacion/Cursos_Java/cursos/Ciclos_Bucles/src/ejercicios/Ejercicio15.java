package ejercicios;

import javax.swing.*;

public class Ejercicio15 {
    public static void main (String[] args) {
         int edad,suma_edad=0, conteo_mayor18=0, contador_mayor175=0;
         float altura,suma_altura=0,media_edad,media_altura;

         for (int i = 1;i<=5; i++){
             edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+" \nDigita su edad: "));
             altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+" \nDigita su estatura"));

             suma_edad += edad;
             suma_altura += altura;

             if(edad > 18){
                 conteo_mayor18++;
             }
             if(altura > 1.75){
                 contador_mayor175++;
             }
         }
         media_edad = (float) suma_edad/5;
         media_altura =  suma_altura/5;

        System.out.println("La edad en promedio es: "+media_edad);
        System.out.println("La estatura promedio es: "+media_altura);
        System.out.println("Cantidad de alumnos a 18 años: "+conteo_mayor18);
        System.out.println("Cantidad de alumnos que miden mas de 1.75 es: "+contador_mayor175);

    }

    }
