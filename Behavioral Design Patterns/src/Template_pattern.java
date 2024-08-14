public class Template_pattern {

    // Abstract class defining the template method and abstract steps
    public abstract class DrinkMaker {
        // Template method defining the sequence of steps
        public final void MakeDrink() {
            PrepareIce();
            AddFruit();
            AddCondiments();
            Steer();
        }

        // Abstract methods to be implemented by subclasses
        abstract void AddFruit();
        abstract void AddCondiments();

        // Concrete methods
        void PrepareIce() {
            System.out.println("Adding Ice");
        }

        void Steer() {
            System.out.println("Steering juice");
        }
    }

    // Concrete class implementing the abstract methods
    public class Lemon extends DrinkMaker {
        @Override
        public void AddFruit() {
            System.out.println("Adding Lemon");
        }

        @Override
        public void AddCondiments() {
            System.out.println("Adding sugar and Mints");
        }
    }

    // Another concrete class implementing the abstract methods
    public class Banana extends DrinkMaker {
        @Override
        public void AddFruit() {
            System.out.println("Adding Banana");
        }

        @Override
        public void AddCondiments() {
            System.out.println("Adding sugar and Milk");
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        Template_pattern templatePattern = new Template_pattern();

        DrinkMaker lemonDrink = templatePattern.new Lemon();
        DrinkMaker bananaDrink = templatePattern.new Banana();

        System.out.println("Making Lemon Drink:");
        lemonDrink.MakeDrink();

        System.out.println("\nMaking Banana Drink:");
        bananaDrink.MakeDrink();
    }
}
