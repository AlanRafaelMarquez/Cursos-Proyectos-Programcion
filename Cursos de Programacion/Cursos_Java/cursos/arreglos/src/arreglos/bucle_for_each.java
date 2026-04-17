package arreglos;

public class bucle_for_each {
    public static void main(String[]args){
        String[] nombres = {"Alejandro","Maria","Luisa","Juan","Alan","Luisa","Roberto","Flor","Rafael"};

        /*for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);

        }*/
        //Bucle for each
        for(String i : nombres){
            System.out.println("Nombres: "+i);
        }
    }

    }
