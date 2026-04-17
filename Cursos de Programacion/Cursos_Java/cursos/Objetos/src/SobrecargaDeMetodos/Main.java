package SobrecargaDeMetodos;

public class Main {
    public static void main (String[]args) {
        Persona persona1 = new Persona("Alan",18);
        Persona persona2 = new Persona("1231232131");
        persona1.correr();
        persona2.correr(100);
    }
    }
