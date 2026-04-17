package ejercicios;

import javax.swing.*;

public class Ejercicio18 {
    public static void main (String[] args) {
            int codigo, litros,litrosArticulo1=0,conteo_Mayor600 = 0;
            float importeFatura = 0,faturacion_total = 0,litro1= 0.6F,litro2=3,litro3=1.25F;

            for (int i =1; i <= 3; i++){
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo"+i+"\nDigita el codigo: "));
                litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo"+i+"\nDigita la cantidad de los litros: "));
                if (i == 1){
                    importeFatura = (float) litros * litro1;
                } else if (i == 2) {
                    importeFatura = (float) litros * litro2;

                }else{
                    importeFatura = (float) litros * litro3;

                }
                faturacion_total += importeFatura;

                if (codigo == 1){
                    litrosArticulo1 += litros;

                }
                if (importeFatura >= 600){
                    conteo_Mayor600++;
                }
            }
            System.out.println("Resumen de Ventas");
            System.out.println("Facturacion Total: "+faturacion_total);
            System.out.println("Cantidad en litros vendidos del articulo: "+litrosArticulo1);
            System.out.println("Cantidad de facturas mayores a $600: "+conteo_Mayor600);
    }

    }
