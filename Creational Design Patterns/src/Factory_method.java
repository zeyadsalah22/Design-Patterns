public class Factory_method{

    // Product interface
    public interface Mobile {
        void develop();
    }
    // ConcreteProduct: Samsung_mobile
    public class SamsungMobile implements Mobile {
        @Override
        public void develop() {
            System.out.println("This is a Samsung Mobile");
        }
    }

    // ConcreteProduct: Apple_mobile
    public class AppleMobile implements Mobile {
        @Override
        public void develop() {
            System.out.println("This is an Apple Mobile");
        }
    }

    // Creator class
    public abstract class Developer {
        // Factory method
        public Mobile getMobile() {
            Mobile m = developMobile();
            m.develop();
            return m;
        }

        // Abstract method to be implemented by ConcreteCreators
        public abstract Mobile developMobile();
    }

    // ConcreteCreator: Samsung
    public class Samsung extends Developer {
        @Override
        public Mobile developMobile() {
            return new SamsungMobile();
        }
    }

    // ConcreteCreator: Apple
    public class Apple extends Developer {
        @Override
        public Mobile developMobile() {
            return new AppleMobile();
        }
    }

    // Main method for testing the Factory Method Pattern
    public static void main(String[] args) {
        Factory_method factoryMethod = new Factory_method();

        Developer samsungDeveloper = factoryMethod.new Samsung();
        Mobile samsungMobile = samsungDeveloper.getMobile(); // Output: This is a Samsung Mobile

        Developer appleDeveloper = factoryMethod.new Apple();
        Mobile appleMobile = appleDeveloper.getMobile(); // Output: This is an Apple Mobile
    }
}
