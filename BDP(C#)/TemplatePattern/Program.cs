using System.Runtime.ConstrainedExecution;

namespace TemplatePattern
{

    // Abstract class defining the template method and abstract steps
    public abstract class DrinkMaker
    {
        // Template method defining the sequence of steps
        public void MakeDrink()
        {
            PrepareIce();
            AddFruit();
            AddCondiments();
            Steer();
        }

        // Abstract methods to be implemented by subclasses
        public abstract void AddFruit();
        public abstract void AddCondiments();

        public void PrepareIce()
        {
            Console.WriteLine("Adding ice");
        }
        public void Steer()
        {
            Console.WriteLine("Steering juice");
        }
    }

    // Concrete class implementing the abstract methods
    public class Lemon : DrinkMaker
    {
        public override void AddFruit()
        {
            Console.WriteLine("Adding Lemon");
        }
        public override void AddCondiments()
        {
            Console.WriteLine("Adding Sugar and Mint");
        }
    }

    // Concrete class implementing the abstract methods
    public class Banana : DrinkMaker
    {
        public override void AddFruit()
        {
            Console.WriteLine("Adding Banana");
        }
        public override void AddCondiments()
        {
            Console.WriteLine("Adding Sugar and Milk");
        }
    }
    internal class Program
    {
        // Main function for testing
        static void Main(string[] args)
        {
            DrinkMaker lemonDrink = new Lemon();
            DrinkMaker bananaDrink = new Banana();

            Console.WriteLine("Making Lemon Drink:");
            lemonDrink.MakeDrink();

            Console.WriteLine("\nMaking Banana Drink:");
            bananaDrink.MakeDrink();
        }
    }
}
