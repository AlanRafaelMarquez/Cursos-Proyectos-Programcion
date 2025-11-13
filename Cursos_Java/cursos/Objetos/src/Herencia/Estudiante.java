package Herencia;

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float nota;

    //Contructor de la clase estudiante
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float nota){
        super (nombre,apellido,edad);
        this.codigoEstudiante = codigoEstudiante;
        this.nota = nota;

    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()
        +"\nCodigo del estudiante: "+codigoEstudiante+"\nNota final: "+nota);
    }

}
