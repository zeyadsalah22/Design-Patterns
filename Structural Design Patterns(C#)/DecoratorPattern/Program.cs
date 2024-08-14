using System.Runtime.Intrinsics.Arm;

namespace DecoratorPattern
{

    // Component interface: BurgerSandwich
    public interface BurgerSandwich {
        public string getDescription();
        public double getCost();
    }

    // Concrete Component: PlainBurgerSandwich
    public class  PlainBurgerSandwich : BurgerSandwich
    {
        public string getDescription()
        {
               return "Burger Sandwich";
        }
        public double getCost()
        {
            return 50;
        }
    }

    // Decorator abstract class implementing the same interface
    public abstract class BurgerDecorator : BurgerSandwich
    {
        protected BurgerSandwich decoratedBurger;
        public BurgerDecorator(BurgerSandwich decoratedBurger)
        {
            this.decoratedBurger = decoratedBurger;
        }
        public virtual string getDescription()
        {
            return decoratedBurger.getDescription();
        }
        public virtual double getCost()
        {
            return decoratedBurger.getCost();
        }
    }

    // Concrete Decorator: CheeseDecorator
    public class CheeseDecorator : BurgerDecorator
    {
        public CheeseDecorator(BurgerSandwich decoratedBurger) : base(decoratedBurger) { }
        public override string getDescription()
        {
            return base.getDescription() + ", Cheese";
        }
        public override double getCost()
        {
            return base.getCost() + 10;
        }
    }

    // Concrete Decorator: OnionsDecorator
    public class OnionsDecorator : BurgerDecorator
    {
        public OnionsDecorator(BurgerSandwich decoratedBurger) : base(decoratedBurger) { }
        public override string getDescription()
        {
            return base.getDescription() + ", Onions";
        }
        public override double getCost()
        {
            return base.getCost() + 3;
        }
    }

    // Concrete Decorator: TurkeyDecorator
    public class TurkeyDecorator : BurgerDecorator
    {
        public TurkeyDecorator(BurgerSandwich decoratedBurger) : base(decoratedBurger) { }
        public override string getDescription()
        {
            return base.getDescription() + ", Turkey";
        }
        public override double getCost()
        {
            return base.getCost() + 15;
        }
    }
    internal class Program
    {
        // Main function for testing
        static void Main(string[] args)
        {
            // Create a plain burger sandwich
            BurgerSandwich plainBurger = new PlainBurgerSandwich();
            Console.WriteLine(plainBurger.getDescription() + " Cost: " + plainBurger.getCost());

            // Add cheese to the plain burger
            BurgerSandwich cheeseBurger = new CheeseDecorator(plainBurger);
            Console.WriteLine(cheeseBurger.getDescription() + " Cost: " + cheeseBurger.getCost());

            // Add onions to the cheese burger
            BurgerSandwich cheeseOnionBurger = new OnionsDecorator(cheeseBurger);
            Console.WriteLine(cheeseOnionBurger.getDescription() + " Cost: " + cheeseOnionBurger.getCost());

            // Add turkey to the cheese and onion burger
            BurgerSandwich turkeyCheeseOnionBurger = new TurkeyDecorator(cheeseOnionBurger);
            Console.WriteLine(turkeyCheeseOnionBurger.getDescription() + " Cost: " + turkeyCheeseOnionBurger.getCost());
        }
    }
}
