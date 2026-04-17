package Constructor;

public class Persona {
    //Atributos

    String nombre;
    int edad;

    //Metodos

    //Metodo cosnstructor
    public Persona(String _nombre, int _edad){
        nombre = _nombre;
        edad = _edad;

    }
    /*Otra forma de hacer el metodo cosnstructor
    public Persona(String nombre, int edad){
        this.nombre = _nombre;
        this.edad = _edad;

    }
    */
    public void MostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
