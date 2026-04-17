package Ejercicios;


import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[5][9];
        System.out.println("Digite la matriz:");
        for(int i = 0; i <5; i++){
            for(int j=0;j<9;j++){
                System.out.print("Matriz["+i+"]"+"["+j+"]:");
                matriz[i][j] = entrada.nextInt();
            }
        }
        int aux;
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                aux= matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        System.out.println("La matriz tranpuesta es");
        for(int i = 0; i <5; i++){
            for(int j=0;j<9;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
}

    }
    }
