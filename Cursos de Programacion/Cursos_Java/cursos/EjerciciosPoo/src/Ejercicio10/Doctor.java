package Ejercicio10;

// Subclase Doctor
public class Doctor extends Persona {
    private String titulacion;
    private int aniosExperiencia;

    public Doctor(String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void curarLesion() {
        System.out.println(nombre + " cura una lesión con " + aniosExperiencia + " años de experiencia.");
    }
}