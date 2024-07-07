public class Abstract_Factory {

    // Product interface for Mobile
    public interface Mobile {
        void develop();
    }

    // ConcreteProduct: SamsungMobile
    public class SamsungMobile implements Mobile {
        @Override
        public void develop() {
            System.out.println("This is a Samsung Mobile");
        }
    }

    // ConcreteProduct: AppleMobile
    public class AppleMobile implements Mobile {
        @Override
        public void develop() {
            System.out.println("This is an Apple Mobile");
        }
    }

    // Product interface for Airpods
    public interface Airpods {
        void develop();
    }

    // ConcreteProduct: AppleAirpods
    public class AppleAirpods implements Airpods {
        @Override
        public void develop() {
            System.out.println("This is Apple Airpods");
        }
    }

    // ConcreteProduct: SamsungAirpods
    public class SamsungAirpods implements Airpods {
        @Override
        public void develop() {
            System.out.println("This is Samsung Airpods");
        }
    }

    // Creator class
    public abstract class Developer {
        // Factory method for Mobile
        public Mobile getMobile() {
            Mobile m = developMobile();
            m.develop();
            return m;
        }

        // Factory method for Airpods
        public Airpods getAirpods() {
            Airpods a = developAirpods();
            a.develop();
            return a;
        }

        // Abstract methods to be implemented by ConcreteCreators
        public abstract Mobile developMobile();
        public abstract Airpods developAirpods();
    }

    // ConcreteCreator: Samsung
    public class Samsung extends Developer {
        @Override
        public Mobile developMobile() {
            return new SamsungMobile();
        }

        @Override
        public Airpods developAirpods() {
            return new SamsungAirpods();
        }
    }

    // ConcreteCreator: Apple
    public class Apple extends Developer {
        @Override
        public Mobile developMobile() {
            return new AppleMobile();
        }

        @Override
        public Airpods developAirpods() {
            return new AppleAirpods();
        }
    }

    // Main method for testing the Abstract Factory Pattern
    public static void main(String[] args) {
        Abstract_Factory abstractFactory = new Abstract_Factory();

        Developer samsungDeveloper = abstractFactory.new Samsung();
        Mobile samsungMobile = samsungDeveloper.getMobile(); // Output: This is a Samsung Mobile
        Airpods samsungAirpods = samsungDeveloper.getAirpods(); // Output: This is Samsung Airpods

        Developer appleDeveloper = abstractFactory.new Apple();
        Mobile appleMobile = appleDeveloper.getMobile(); // Output: This is an Apple Mobile
        Airpods appleAirpods = appleDeveloper.getAirpods(); // Output: This is Apple Airpods
    }
}
