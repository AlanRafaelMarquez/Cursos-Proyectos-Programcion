package Ejercicio10;

// Subclase Futbolista
public class Futbolista extends Persona {
    private int dorsal;
    private String posicion;

    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public void entrenar() {
        System.out.println(nombre + " entrena como " + posicion + ".");
    }

    public void jugarPartido() {
        System.out.println(nombre + " juega el partido con el dorsal " + dorsal + ".");
    }

    public void entrevista() {
        System.out.println(nombre + " da una entrevista como futbolista.");
    }
}