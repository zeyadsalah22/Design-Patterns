public class Decorator_pattern {

    // Component interface: BurgerSandwich
    public interface BurgerSandwich {
        String getDescription();
        double getCost();
    }

    // Concrete Component: PlainBurgerSandwich
    public class PlainBurgerSandwich implements BurgerSandwich {
        @Override
        public String getDescription() {
            return "Burger Sandwich";
        }

        @Override
        public double getCost() {
            return 50;
        }
    }

    // Decorator abstract class implementing the same interface
    public abstract class BurgerDecorator implements BurgerSandwich {
        private BurgerSandwich decoratedBurger;

        public BurgerDecorator(BurgerSandwich decoratedBurger) {
            this.decoratedBurger = decoratedBurger;
        }

        @Override
        public String getDescription() {
            return decoratedBurger.getDescription();
        }

        @Override
        public double getCost() {
            return decoratedBurger.getCost();
        }
    }

    // Concrete Decorator: CheeseDecorator
    public class CheeseDecorator extends BurgerDecorator {
        public CheeseDecorator(BurgerSandwich decoratedBurger) {
            super(decoratedBurger);
        }

        @Override
        public String getDescription() {
            return super.getDescription() + " + Cheese";
        }

        @Override
        public double getCost() {
            return super.getCost() + 10;
        }
    }

    // Concrete Decorator: OnionsDecorator
    public class OnionsDecorator extends BurgerDecorator {
        public OnionsDecorator(BurgerSandwich decoratedBurger) {
            super(decoratedBurger);
        }

        @Override
        public String getDescription() {
            return super.getDescription() + " + Onions";
        }

        @Override
        public double getCost() {
            return super.getCost() + 3;
        }
    }

    // Concrete Decorator: TurkeyDecorator
    public class TurkeyDecorator extends BurgerDecorator {
        public TurkeyDecorator(BurgerSandwich decoratedBurger) {
            super(decoratedBurger);
        }

        @Override
        public String getDescription() {
            return super.getDescription() + " + Turkey";
        }

        @Override
        public double getCost() {
            return super.getCost() + 13;
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        Decorator_pattern dp = new Decorator_pattern();

        // Create a plain burger sandwich
        BurgerSandwich plainBurger = dp.new PlainBurgerSandwich();
        System.out.println(plainBurger.getDescription() + " Cost: " + plainBurger.getCost());

        // Add cheese to the plain burger
        BurgerSandwich cheeseBurger = dp.new CheeseDecorator(plainBurger);
        System.out.println(cheeseBurger.getDescription() + " Cost: " + cheeseBurger.getCost());

        // Add onions to the cheese burger
        BurgerSandwich cheeseOnionBurger = dp.new OnionsDecorator(cheeseBurger);
        System.out.println(cheeseOnionBurger.getDescription() + " Cost: " + cheeseOnionBurger.getCost());

        // Add turkey to the cheese and onion burger
        BurgerSandwich turkeyCheeseOnionBurger = dp.new TurkeyDecorator(cheeseOnionBurger);
        System.out.println(turkeyCheeseOnionBurger.getDescription() + " Cost: " + turkeyCheeseOnionBurger.getCost());
    }
}
