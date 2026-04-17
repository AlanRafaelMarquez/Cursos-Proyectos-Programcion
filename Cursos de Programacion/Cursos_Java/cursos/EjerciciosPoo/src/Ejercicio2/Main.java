package Ejercicio2;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            ObjetoMovil objeto = new ObjetoMovil();
            Scanner scanner = new Scanner(System.in);
            String direccion;

            System.out.println("Introduce una dirección (ARRIBA, ABAJO, IZQUIERDA, DERECHA). Escribe SALIR para terminar.");

            while (true) {
                System.out.print("Dirección: ");
                direccion = scanner.nextLine();

                if (direccion.equalsIgnoreCase("SALIR")) {
                    System.out.println("Programa finalizado.");
                    break;
                }

                objeto.mover(direccion);
            }

            scanner.close();
        }
    }

