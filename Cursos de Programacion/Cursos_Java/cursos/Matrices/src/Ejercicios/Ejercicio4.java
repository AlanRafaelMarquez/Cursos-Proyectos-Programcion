package Ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {

    int tamaño = 7;
    int[][] matriz = new int[tamaño][tamaño];

    // Asignar 1 en la diagonal principal
        for (int i = 0; i < tamaño; i++) {
        matriz[i][i] = 1;
    }

    // Mostrar la matriz
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
}}
