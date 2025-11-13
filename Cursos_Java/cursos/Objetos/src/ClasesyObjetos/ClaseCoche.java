package ClasesyObjetos;

public class ClaseCoche {
    String color;
    String marca;
    int km;

    public static void main(String[]args){
        ClaseCoche  coche1 = new ClaseCoche();
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.println("El color del coche es: "+coche1.color);
        System.out.println("La marca del coche es: "+coche1.marca);
        System.out.println("Los Km del coche es: "+coche1.km);
        System.out.println(" ");

        ClaseCoche  coche2 = new ClaseCoche();

        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;

        System.out.println("El color del coche es: "+coche2.color);
        System.out.println("La marca del coche es: "+coche2.marca);
        System.out.println("Los Km del coche es: "+coche2.km);
    }
}
