package Ejercicio10;

import java.util.Scanner;

public class EquipoFutbol {
    public static void main(String[] args) {
        Futbolista jugador = new Futbolista("Carlos", "Ramírez", 25, 10, "Delantero");
        Entrenador entrenador = new Entrenador("Luis", "Martínez", 45, "4-4-2");
        Doctor doctor = new Doctor("Ana", "Gómez", 38, "Fisioterapeuta", 12);

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú del Equipo de Fútbol ---");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de fútbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesión");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    jugador.viajar();
                    entrenador.viajar();
                    doctor.viajar();
                    break;
                case 2:
                    jugador.entrenar();
                    break;
                case 3:
                    jugador.jugarPartido();
                    break;
                case 4:
                    entrenador.planificarEntrenamiento();
                    break;
                case 5:
                    jugador.entrevista();
                    break;
                case 6:
                    doctor.curarLesion();
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
