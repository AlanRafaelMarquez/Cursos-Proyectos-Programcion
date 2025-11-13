namespace PizzaApp
{
    // Clase Pizza definida fuera del método Main
    public class Pizza
    {
        // Atributos
        public int CodigoPizza { get; set; }
        public int Sabor { get; set; }
        public bool ExtraQueso { get; set; }
        public int Tamaño { get; set; }
        public string[] Ingredientes { get; set; }
        public double Precio { get; set; }
        public string Nombre { get; set; }

        // Constructor por defecto
        public Pizza()
        {
            CodigoPizza = 0;
            Sabor = 0;
            ExtraQueso = false;
            Tamaño = 0;
            Precio = 0.0;
            Nombre = "";
            Ingredientes = new string[3] { "", "", "" };
        }

        // Sobrecarga: solo nombre
        public Pizza(string nombre)
        {
            Nombre = nombre;
            Ingredientes = new string[3] { "", "", "" };
        }

        // Sobrecarga: solo precio
        public Pizza(double precio)
        {
            Precio = precio;
            Ingredientes = new string[3] { "", "", "" };
        }

        // Sobrecarga: ingredientes y nombre
        public Pizza(string[] ingredientes, string nombre)
        {
            Ingredientes = ingredientes;
            Nombre = nombre;
        }

        // Sobrecarga: solo tamaño
        public Pizza(int tamaño)
        {
            Tamaño = tamaño;
            Ingredientes = new string[3] { "", "", "" };
        }
    }

    // Clase principal con método Main
    internal class Program
    {
        static void Main(string[] args)
        {
            // Ejemplo de uso
            Pizza miPizza = new Pizza("Hawaiana");
            miPizza.Precio = 120.50;
            miPizza.Tamaño = 2;
            miPizza.Ingredientes = new string[] { "Piña", "Jamón", "Queso" };

            Console.WriteLine($"Pizza: {miPizza.Nombre}, Precio: {miPizza.Precio}, Tamaño: {miPizza.Tamaño}");
        }
    }
}