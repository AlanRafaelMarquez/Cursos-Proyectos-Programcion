package SobrecargaDeMetodos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    //Metodos


    public Persona(String dni) {
        this.dni = dni;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" de edad y estoy corriendo una maraton");
    }

    public void correr(int km){
        System.out.println("He corrido "+km+" Kilometros");
    }
}
