package ejercicios;

import javax.swing.*;
import java.sql.SQLOutput;

public class Ejercicio17 {
    public static void main(String[] args) {
        int codigo, litros,litrosArticulo1=0,conteo_Mayor600 = 0;
        float precioLitro, importeFatura,faturacion_total = 0;

        for (int i =1; i <= 5; i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo"+i+"\nDigita el codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo"+i+"\nDigita la cantidad de los litros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo"+i+"\nDigita el precio por litro:"));
            importeFatura = (float) litros * precioLitro;
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
