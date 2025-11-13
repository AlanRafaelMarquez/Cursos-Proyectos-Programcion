package Poo.MetodosyAtributos;

import javax.swing.*;

public class MetodosyAtributos {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multi;
    double divi;

    //Metodos
    //Metodo para pedirle al usuarip que digite dos numeros
    public void LeerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));

    }
    //Metodo para sumar dos numeros
    public void Sumar(){
        suma = numero1+numero2;
    }//Metodo para restar dos numeros
    public void Restar(){
        resta = numero1-numero2;
    }//Metodo para multiplicar dos numeros
    public void Multi(){
        multi = numero1*numero2;
    }//Metodo para dividir dos numeros
    public void Divi(){
        divi = numero1/numero2;
    }

    public void MostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La division es: "+divi);
    }




}
