package Ejercicio4;

public class Atleta {
        private int numero;
        private String nombre;
        private double tiempo;

        public Atleta(int numero, String nombre, double tiempo) {
            this.numero = numero;
            this.nombre = nombre;
            this.tiempo = tiempo;
        }

        public int getNumero() {
            return numero;
        }

        public String getNombre() {
            return nombre;
        }

        public double getTiempo() {
            return tiempo;
        }

        public void mostrarDatos() {
            System.out.println("Número: " + numero);
            System.out.println("Nombre: " + nombre);
            System.out.println("Tiempo: " + tiempo + " segundos");
        }
    }

