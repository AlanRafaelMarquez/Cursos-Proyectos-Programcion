package Ejercicios_de_operadores;

import java.util.Scanner;

public class Ejercicio4 {
    public static void  main (String[] args){
        Scanner entrada = new Scanner(System.in);
        double salario_mensual = 1000, comision = 150, valor_Venta = 40000, Carros_Vendidos, Operacion1,Operacion2, Salario_Vendedor;

        System.out.println("Cuantos carros vendiste este mes: ");
        Carros_Vendidos = entrada.nextFloat();

        Operacion1 = comision*Carros_Vendidos;
        Operacion2 = valor_Venta * 0.05;

        Salario_Vendedor = salario_mensual+Operacion1+Operacion2;

        System.out.println("El salario mensual del vendedor es:"+Salario_Vendedor);




    }
}
