package Ejercicio6;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ingreso de los dos números complejos
            System.out.println("Ingrese el primer número complejo:");
            System.out.print("Parte real: ");
            double real1 = scanner.nextDouble();
            System.out.print("Parte imaginaria: ");
            double imag1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo número complejo:");
            System.out.print("Parte real: ");
            double real2 = scanner.nextDouble();
            System.out.print("Parte imaginaria: ");
            double imag2 = scanner.nextDouble();

            NumeroComplejo c1 = new NumeroComplejo(real1, imag1);
            NumeroComplejo c2 = new NumeroComplejo(real2, imag2);

            int opcion;
            do {
                System.out.println("\n Menú:");
                System.out.println("1. Sumar dos números complejos");
                System.out.println("2. Multiplicar dos números complejos");
                System.out.println("3. Comparar dos números complejos");
                System.out.println("4. Multiplicar un número complejo por un entero");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        NumeroComplejo suma = c1.sumar(c2);
                        System.out.println("Resultado: " + suma.mostrar());
                        break;
                    case 2:
                        NumeroComplejo producto = c1.multiplicar(c2);
                        System.out.println("Resultado: " + producto.mostrar());
                        break;
                    case 3:
                        if (c1.esIgual(c2)) {
                            System.out.println("Los números complejos son iguales.");
                        } else {
                            System.out.println("Los números complejos son diferentes.");
                        }
                        break;
                    case 4:
                        System.out.print("Ingrese el entero: ");
                        int entero = scanner.nextInt();
                        NumeroComplejo resultado = c1.multiplicarPorEntero(entero);
                        System.out.println("Resultado: " + resultado.mostrar());
                        break;
                    case 0:
                        System.out.println("Programa finalizado.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (opcion != 0);

            scanner.close();
        }
    }

