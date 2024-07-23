public class adapter_pattern {

    // Target interface: Citizen
    public interface Citizen {
        void Speak();
    }

    // Concrete implementation of Citizen: American
    public class American implements Citizen {
        @Override
        public void Speak() {
            System.out.println("I speak English");
        }
    }

    // Concrete implementation of Citizen: Arabian
    public class Arabian implements Citizen {
        @Override
        public void Speak() {
            System.out.println("I speak Arabic");
        }
    }

    // Adapter class: Adapter
    // It adapts the interface of American to be compatible with Arabian
    public class Adapter extends American {
        private Arabian arabian;

        public Adapter(Arabian arabian) {
            this.arabian = arabian;
        }

        @Override
        public void Speak() {
            System.out.println("Translating into Arabic");
            arabian.Speak();
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        adapter_pattern ap = new adapter_pattern();

        // Create instances of American and Arabian
        Citizen american = ap.new American();
        Citizen arabian = ap.new Arabian();

        // Test American speaking
        System.out.println("American:");
        american.Speak();

        // Test Arabian speaking
        System.out.println("Arabian:");
        arabian.Speak();

        // Use adapter to let American "speak" Arabic
        Citizen adapter = ap.new Adapter(ap.new Arabian());
        System.out.println("Adapter:");
        adapter.Speak();
    }
}
