package Ejercicios;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int trimestre1 [] = new int[5];
        int trimestre2 [] = new int[5];
        int trimestre3 [] = new int[5];
        int a=0,b=0,c=0,media1,media2,media3,suma=0,numero,mediaalumno;
        System.out.println("Primer Trimestre");
        for(int i=0;i<trimestre1.length;i++){
            System.out.print("Alumno #"+(i+1)+" Digite su calificacion:");
            trimestre1[i] = entrada.nextInt();
            a++;
        }
        for (int i = 0; i < trimestre1.length; i++) {
            suma += trimestre1[i];
        }
        media1 = suma/a;
        System.out.println("La media del cuatrimestre 1 es:"+media1);
        System.out.println("Segundo Trimestre");
        for(int i=0;i<trimestre2.length;i++){
            System.out.print("Alumno #"+(i+1)+" Digite su calificacion:");
            trimestre2[i] = entrada.nextInt();
            b++;
        }
        suma = 0;
        for (int i = 0; i < trimestre2.length; i++) {
            suma += trimestre2[i];
        }
        media2 = suma/b;
        System.out.println("La media del cuatrimestre 2 es:"+media2);
        System.out.println("Tercer Trimestre");
        for(int i=0;i<trimestre3.length;i++){
            System.out.print("Alumno #"+(i+1)+" Digite su calificacion:");
            trimestre3[i] = entrada.nextInt();
            c++;
        }
        suma=0;
        for (int i = 0; i < trimestre3.length; i++) {
            suma += trimestre3[i];
        }
        media3 = suma/c;
        System.out.println("La media del cuatrimestre 3 es:"+media3);

        System.out.print("Digite del 0-4 alumnos para encontrar su media:");
        numero = entrada.nextInt();
        //Buscamos el numero del arreglo
        int x=0;
        while (x<trimestre1.length && trimestre1[x]<numero){
            x++;
        }
        int y =0;
        while (y <trimestre2.length && trimestre2[y]<numero){
            y++;
        }
        int z =0;
        while (z <trimestre3.length && trimestre3[z]<numero){
            z++;
        }
        mediaalumno = (trimestre1[x]+trimestre2[y]+trimestre3[z])/3;
        System.out.print("La media del alumno elejido es:"+mediaalumno);
}

}
