package ClasesMetodosAbstractos;

public class Principal {
    public static void main (String[] args){
        Planta planta = new Planta();
        AnimalCarniboro animalCarniboro = new AnimalCarniboro();
        AnimalHerbivoro animalHerbivoro = new AnimalHerbivoro();

        animalCarniboro.alimentarse();
        planta.alimentarse();
        animalHerbivoro.alimentarse();
    }
}
