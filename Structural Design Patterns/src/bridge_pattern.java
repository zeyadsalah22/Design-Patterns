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
            System.out.println("Making Chicken Pizza the Italian way");
            italianWay.prepareDough("Chicken Pizza");
            italianWay.addSauce("Chicken Pizza");
            italianWay.addToppings("Chicken Pizza");
            italianWay.bake("Chicken Pizza");
            System.out.println("Chicken Pizza is ready");

            System.out.println("Making Chicken Pizza the Mexican way");
            mexicanWay.prepareDough("Chicken Pizza");
            mexicanWay.addSauce("Chicken Pizza");
            mexicanWay.addToppings("Chicken Pizza");
            mexicanWay.bake("Chicken Pizza");
            System.out.println("Chicken Pizza is ready");
        }
    }

    // Refined Abstraction: PepperoniPizza
    public class PepperoniPizza extends Pizza {
        public PepperoniPizza(ItalianWay italianWay, MexicanWay mexicanWay) {
            super(italianWay, mexicanWay);
        }

        @Override
        void Make() {
            System.out.println("Making Pepperoni Pizza the Italian way");
            italianWay.prepareDough("Pepperoni Pizza");
            italianWay.addSauce("Pepperoni Pizza");
            italianWay.addToppings("Pepperoni Pizza");
            italianWay.bake("Pepperoni Pizza");
            System.out.println("Pepperoni Pizza is ready");

            System.out.println("Making Pepperoni Pizza the Mexican way");
            mexicanWay.prepareDough("Pepperoni Pizza");
            mexicanWay.addSauce("Pepperoni Pizza");
            mexicanWay.addToppings("Pepperoni Pizza");
            mexicanWay.bake("Pepperoni Pizza");
            System.out.println("Pepperoni Pizza is ready");
        }
    }

    // Implementor interface: PizzaWay
    public interface PizzaWay {
        void prepareDough(String type);
        void addSauce(String type);
        void addToppings(String type);
        void bake(String type);
    }

    // Concrete Implementor: ItalianWay
    public class ItalianWay implements PizzaWay {
        @Override
        public void prepareDough(String type) {
            System.out.println("Preparing the dough for " + type + " the Italian way");
        }

        @Override
        public void addSauce(String type) {
            System.out.println("Adding sauce on " + type + " the Italian way");
        }

        @Override
        public void addToppings(String type) {
            System.out.println("Adding Toppings on " + type + " the Italian way");
        }

        @Override
        public void bake(String type) {
            System.out.println("Baking the " + type + " the Italian way");
        }
    }

    // Concrete Implementor: MexicanWay
    public class MexicanWay implements PizzaWay {
        @Override
        public void prepareDough(String type) {
            System.out.println("Preparing the dough for " + type + " the Mexican way");
        }

        @Override
        public void addSauce(String type) {
            System.out.println("Adding sauce on " + type + " the Mexican way");
        }

        @Override
        public void addToppings(String type) {
            System.out.println("Adding Toppings on " + type + " the Mexican way");
        }

        @Override
        public void bake(String type) {
            System.out.println("Baking the " + type + " the Mexican way");
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
