public class bridge_pattern {
    // Abstraction: Pizza
    public abstract class Pizza {
        protected ItalianWay italianWay; // Implementation 1
        protected MexicanWay mexicanWay; // Implementation 2

        public Pizza(ItalianWay italianWay, MexicanWay mexicanWay) {
            this.italianWay = italianWay;
            this.mexicanWay = mexicanWay;
        }

        abstract void Make(); // Abstract method to be implemented by subclasses
    }

    // Refined Abstraction: ChickenPizza
    public class ChickenPizza extends Pizza {
        public ChickenPizza(ItalianWay italianWay, MexicanWay mexicanWay) {
            super(italianWay, mexicanWay);
        }

        @Override
        void Make() {
            italianWay.make("Chicken Pizza");
            mexicanWay.make("Chicken Pizza");
        }
    }

    // Refined Abstraction: PepperoniPizza
    public class PepperoniPizza extends Pizza {
        public PepperoniPizza(ItalianWay italianWay, MexicanWay mexicanWay) {
            super(italianWay, mexicanWay);
        }

        @Override
        void Make() {
            italianWay.make("Pepperoni Pizza");
            mexicanWay.make("Pepperoni Pizza");
        }
    }

    // Implementor interface: PizzaWay
    public interface PizzaWay {
        void make(String type); // Method to be implemented by concrete implementors
    }

    // Concrete Implementor: ItalianWay
    public class ItalianWay implements PizzaWay {
        @Override
        public void make(String type) {
            System.out.println("Making " + type + " the Italian way");
        }
    }

    // Concrete Implementor: MexicanWay
    public class MexicanWay implements PizzaWay {
        @Override
        public void make(String type) {
            System.out.println("Making " + type + " the Mexican way");
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        bridge_pattern bp = new bridge_pattern();

        // Create instances of ItalianWay and MexicanWay
        ItalianWay italianWay = bp.new ItalianWay();
        MexicanWay mexicanWay = bp.new MexicanWay();

        // Create instances of ChickenPizza and PepperoniPizza
        Pizza chickenPizza = bp.new ChickenPizza(italianWay, mexicanWay);
        Pizza pepperoniPizza = bp.new PepperoniPizza(italianWay, mexicanWay);

        // Make pizzas using different ways
        System.out.println("Chicken Pizza:");
        chickenPizza.Make();

        System.out.println("Pepperoni Pizza:");
        pepperoniPizza.Make();
    }
}
