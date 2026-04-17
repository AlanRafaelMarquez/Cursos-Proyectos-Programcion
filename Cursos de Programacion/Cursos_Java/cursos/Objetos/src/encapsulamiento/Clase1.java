package encapsulamiento;
//Encasulamieto y metodos accesores(Getters, Setters)
public class Clase1 {
    private int edad;
    private String nombre;


    //Metodo setter establecemos la edad
    public void setEdad(int edad){
        this.edad = edad;

    }

    //Metodo Getter Mostramos la edad
    public int getEdad (){
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
