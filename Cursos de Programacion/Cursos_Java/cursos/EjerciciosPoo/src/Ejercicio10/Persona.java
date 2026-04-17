package Ejercicio10;

    // Superclase Persona
    public class Persona {
        protected String nombre;
        protected String apellido;
        protected int edad;

        public Persona(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        public void viajar() {
            System.out.println(nombre + " " + apellido + " está viajando con el equipo.");
        }
    }

