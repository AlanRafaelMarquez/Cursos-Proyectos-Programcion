package RetornoDeValores;

public class RetornoDeValores {

    //Metodos

    //Metodo para sumar dos numeros
    public int Sumar(int numero1, int numero2){
       int suma = numero1 + numero2;
       return suma;
    }//Metodo para restar dos numeros
    public int Restar(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }//Metodo para multiplicar dos numeros
    public int Multi(int numero1, int numero2){
        int multi = numero1 * numero2;
        return multi;
    }//Metodo para dividir dos numeros
    public int Divi(int numero1, int numero2){
       int divi = numero1 / numero2;
       return divi;
    }

    /*public void MostrarResultados(int suma, int resta, int multi, int divi){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La division es: "+divi);
    }*/

}
