package Ejercicio4;
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("¿Cuántos atletas participan? ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            Atleta[] atletas = new Atleta[cantidad];

            for (int i = 0; i < cantidad; i++) {
                System.out.println("\nDatos del atleta " + (i + 1));
                System.out.print("Número: ");
                int numero = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Tiempo (en segundos): ");
                double tiempo = scanner.nextDouble();
                scanner.nextLine(); // Limpiar buffer

                atletas[i] = new Atleta(numero, nombre, tiempo);
            }

            // Buscar al atleta con menor tiempo
            Atleta ganador = atletas[0];
            for (int i = 1; i < atletas.length; i++) {
                if (atletas[i].getTiempo() < ganador.getTiempo()) {
                    ganador = atletas[i];
                }
            }

            System.out.println("\n Atleta ganador:");
            ganador.mostrarDatos();

            scanner.close();
        }
    }

