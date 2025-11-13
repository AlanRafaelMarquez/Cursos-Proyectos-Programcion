package ParametrosyArgumentos;

public class ParmetrosyArgumentos {
    int suma;
    int resta;
    int multi;
    double divi;

    //Metodos

    //Metodo para sumar dos numeros
    public void Sumar(int numero1, int numero2){
        suma = numero1 + numero2;
    }//Metodo para restar dos numeros
    public void Restar(int numero1, int numero2){
        resta = numero1 - numero2;
    }//Metodo para multiplicar dos numeros
    public void Multi(int numero1, int numero2){
        multi = numero1 * numero2;
    }//Metodo para dividir dos numeros
    public void Divi(int numero1, int numero2){
        divi = numero1 / numero2;
    }

    public void MostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La division es: "+divi);
    }

}
