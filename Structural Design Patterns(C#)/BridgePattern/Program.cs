namespace BridgePattern
{
    // Abstract class representing the concept of a Pizza
    public abstract class Pizza
    {
        // References to the different ways of making pizza (Italian and Mexican)
        protected ItalianWay italianWay;
        protected MexicanWay mexicanWay;

        // Constructor to initialize the pizza with the two different ways of preparation
        public Pizza(ItalianWay italianWay, MexicanWay mexicanWay)
        {
            this.italianWay = italianWay;
            this.mexicanWay = mexicanWay;
        }

        // Abstract method to be implemented by concrete pizza types
        public abstract void Make();
    }

    // Concrete class representing Chicken Pizza
    public class ChickenPizza : Pizza
    {
        // Constructor to initialize ChickenPizza with specific ways of preparation
        public ChickenPizza(ItalianWay italianWay, MexicanWay mexicanWay) : base(italianWay, mexicanWay) { }

        // Implementation of the Make method for Chicken Pizza
        public override void Make()
        {
            // Making Chicken Pizza the Italian way
            Console.WriteLine("\nMaking Chicken Pizza the Italian way");
            italianWay.PrepareDough("Chicken Pizza");
            italianWay.AddSauce("Chicken Pizza");
            italianWay.AddToppings("Chicken Pizza");
            italianWay.Bake("Chicken Pizza");
            Console.WriteLine("Chicken Pizza is ready");

            // Making Chicken Pizza the Mexican way
            Console.WriteLine("\nMaking Chicken Pizza the Mexican way");
            mexicanWay.PrepareDough("Chicken Pizza");
            mexicanWay.AddSauce("Chicken Pizza");
            mexicanWay.AddToppings("Chicken Pizza");
            mexicanWay.Bake("Chicken Pizza");
            Console.WriteLine("Chicken Pizza is ready");
        }
    }

    // Concrete class representing Pepperoni Pizza
    public class PeperroniPizza : Pizza
    {
        // Constructor to initialize PeperroniPizza with specific ways of preparation
        public PeperroniPizza(ItalianWay italianWay, MexicanWay mexicanWay) : base(italianWay, mexicanWay) { }

        // Implementation of the Make method for Pepperoni Pizza
        public override void Make()
        {
            // Making Pepperoni Pizza the Italian way
            Console.WriteLine("\nMaking Pepperoni Pizza the Italian way");
            italianWay.PrepareDough("Pepperoni Pizza");
            italianWay.AddSauce("Pepperoni Pizza");
            italianWay.AddToppings("Pepperoni Pizza");
            italianWay.Bake("Pepperoni Pizza");
            Console.WriteLine("Pepperoni Pizza is ready");

            // Making Pepperoni Pizza the Mexican way
            Console.WriteLine("\nMaking Pepperoni Pizza the Mexican way");
            mexicanWay.PrepareDough("Pepperoni Pizza");
            mexicanWay.AddSauce("Pepperoni Pizza");
            mexicanWay.AddToppings("Pepperoni Pizza");
            mexicanWay.Bake("Pepperoni Pizza");
            Console.WriteLine("Pepperoni Pizza is ready");
        }
    }

    // Interface representing the various ways to prepare a pizza
    public interface PizzaWay
    {
        void PrepareDough(string type);
        void AddSauce(string type);
        void AddToppings(string type);
        void Bake(string type);
    }

    // Concrete class for preparing pizza the Italian way
    public class ItalianWay : PizzaWay
    {
        public void PrepareDough(string type)
        {
            Console.WriteLine("Preparing the dough for " + type + " the Italian way");
        }
        public void AddSauce(string type)
        {
            Console.WriteLine("Adding sauce on " + type + " the Italian way");
        }
        public void AddToppings(string type)
        {
            Console.WriteLine("Adding Toppings on " + type + " the Italian way");
        }
        public void Bake(string type)
        {
            Console.WriteLine("Baking the " + type + " the Italian way");
        }
    }

    // Concrete class for preparing pizza the Mexican way
    public class MexicanWay : PizzaWay
    {
        public void PrepareDough(string type)
        {
            Console.WriteLine("Preparing the dough for " + type + " the Mexican way");
        }
        public void AddSauce(string type)
        {
            Console.WriteLine("Adding sauce on " + type + " the Mexican way");
        }
        public void AddToppings(string type)
        {
            Console.WriteLine("Adding Toppings on " + type + " the Mexican way");
        }
        public void Bake(string type)
        {
            Console.WriteLine("Baking the " + type + " the Mexican way");
        }
    }

    // Main program to test the Bridge Pattern
    internal class Program
    {
        static void Main(string[] args)
        {
            // Creating instances of the Italian and Mexican ways of making pizza
            ItalianWay italianWay = new ItalianWay();
            MexicanWay mexicanWay = new MexicanWay();

            // Creating Chicken Pizza and Pepperoni Pizza with both preparation ways
            Pizza chickenPizza = new ChickenPizza(italianWay, mexicanWay);
            Pizza pepperoniPizza = new PeperroniPizza(italianWay, mexicanWay);

            // Making Chicken Pizza with both Italian and Mexican styles
            Console.WriteLine("Testing Chicken Pizza:");
            chickenPizza.Make();

            // Making Pepperoni Pizza with both Italian and Mexican styles
            Console.WriteLine("\nTesting Pepperoni Pizza:");
            pepperoniPizza.Make();
        }
    }
}
