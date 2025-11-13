package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo [] = new  int[12];
        int posi1,posi2,posi3,posi4,posi5,posi6,posi7,posi8,posi9,posiciones;
        System.out.println("Llenar un arreglo");
        for(int i = 0; i <10;i++){
            System.out.print(i+ ". Dime un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.print("Dime la posicion que quieres: ");
        posiciones = entrada.nextInt();

        posi9 = arreglo[9];
        posi8 = arreglo[8];
        posi7 = arreglo[7];
        posi6 = arreglo[6];
        posi5 = arreglo[5];
        posi4 = arreglo[4];
        posi3 = arreglo[3];
        posi2 = arreglo[2];
        posi1 = arreglo[1];



        switch (posiciones){
            case 1:
                for(int i = 8; i >= 0 ; i--){
                    arreglo[i+1] = arreglo[i];
                }
                arreglo[0] = posi9;
                break;
            case 2:
                for(int i = 7; i >= 0 ; i--){
                    arreglo[i+2] = arreglo[i];
                }
                arreglo[1] = posi9;
                arreglo[0] = posi8;

                break;
            case 3:
                for(int i = 6; i >= 0 ; i--){
                arreglo[i+3] = arreglo[i];
            }

                arreglo[2] = posi9;
                arreglo[1] = posi8;
                arreglo[0] = posi7;
                break;
            case 4:
                for(int i = 5; i >= 0 ; i--){
                    arreglo[i+4] = arreglo[i];
                }

                arreglo[0] = posi6;
                arreglo[3] = posi9;
                arreglo[2] = posi8;
                arreglo[1] = posi7;
                break;
            case 5:
                for(int i = 4; i >= 0 ; i--){
                    arreglo[i+5] = arreglo[i];
                }

                arreglo[0] = posi5;
                arreglo[1] = posi6;
                arreglo[4] = posi9;
                arreglo[3] = posi8;
                arreglo[2] = posi7;
                break;
            case 6:
                for(int i = 3; i >= 0 ; i--){
                    arreglo[i+6] = arreglo[i];
                }
                arreglo[0] = posi4;
                arreglo[1] = posi5;
                arreglo[2] = posi6;
                arreglo[5] = posi9;
                arreglo[4] = posi8;
                arreglo[3] = posi7;
                break;
            case 7:
                for(int i = 2; i >= 0 ; i--){
                    arreglo[i+7] = arreglo[i];
                }
                arreglo[0] = posi3;
                arreglo[1] = posi4;
                arreglo[2] = posi5;
                arreglo[6] = posi6;
                arreglo[5] = posi9;
                arreglo[4] = posi8;
                arreglo[3] = posi7;
                break;
            case 8:
                for(int i = 1; i >= 0 ; i--){
                    arreglo[i+8] = arreglo[i];
                }
                arreglo[0] = posi2;
                arreglo[1] = posi3;
                arreglo[2] = posi4;
                arreglo[3] = posi5;
                arreglo[4] = posi6;
                arreglo[7] = posi9;
                arreglo[6] = posi8;
                arreglo[5] = posi7;
                break;
            case 9:
                for(int i = 1; i >= 0 ; i--){
                    arreglo[i+9] = arreglo[i];
                }
                arreglo[0] = posi1;
                arreglo[1] = posi2;
                arreglo[2] = posi3;
                arreglo[3] = posi4;
                arreglo[4] = posi5;
                arreglo[5] = posi6;
                arreglo[8] = posi9;
                arreglo[7] = posi8;
                arreglo[6] = posi7;
                break;
            case 10:
                for(int i = 0; i<10;i++){
                    System.out.println(i+"Numero: "+arreglo[i]);
                }
            default:
                System.out.println("Esta pocision no existe");
        }





    }
}
