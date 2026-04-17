package Entrada_de_datos;

public class Clase_Math {
    public static void main (String[] args){
        //Raiz cuadrada de un numero
        double raiz = Math.sqrt(36.67);
        //Ahora com int
        //double raiz = (int) Math.sqrt(9);

        //Para elevar dos numeros de una base a una determinada potencia
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);

        //Redondear un numero ejemplo aqui lo va a rendondear al 5
        double numero =  4.56;
        long resultado1 = Math.round(numero);

//        float numero =  4.56;
//        int resultado1 = Math.round(numero); para que sea un tipo float lo cambiamos directo al momento de poner math

        //Elije un numero random
        double numero1 = Math.random();

        System.out.println(numero1);
    }
}
