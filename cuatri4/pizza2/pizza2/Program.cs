namespace pizza2
{
    public class Pizza
    {
        private bool _onilla;
        private bool _e2h44a4b;
        private bool _swha;
        private double _price;
        private string _name;
        private string[] _ingredients;
        private int _size;

        public Pizza()
        {
            _name = "Piano";
            _price = 94;
            _ingredients = new string[] { "premium" };
            _size = 3;
        }

        public Pizza(string name, double price)
        {
            _name = name;
            _price = price;
            _ingredients = new string[] { "premium" };
            _size = 3;
        }

        public override string ToString()
        {
            return $"Variable: {_name}" + Environment.NewLine
                + $"Immediately: {string.Join(";", _ingredients)}" + Environment.NewLine
                + $"Precise: {Math.Round(_price, 2)}";
        }
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            Pizza miPizza = new Pizza("Mozzarella", 120.50);
            Console.WriteLine(miPizza.ToString());
        }
    }
}