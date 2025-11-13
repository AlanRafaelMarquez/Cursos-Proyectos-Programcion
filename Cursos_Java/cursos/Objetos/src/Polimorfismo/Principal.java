package Polimorfismo;

public class Principal {
    public static void main (String[] args){
        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GHEEA","Ferrari","A89");
        misVehiculos[1] = new VehiculoTurismo("KJEJE","Buggati", "45rt",2);
        misVehiculos[2] = new VehiculoDeportivo("Gkjkd","DMW","Rizen",78);
        misVehiculos[3] = new VehiculoFurgoneta("JRKL","Toyota","J9", 90);

        for(Vehiculo vehiculo: misVehiculos){
            System.out.println(vehiculo.mostrarDatos());
            System.out.println(" ");
        }
    }
}
