public class Prototype {

    // Abstract Product class
    public abstract class Appliance {
        private String brand;
        private String model;
        private double price;

        // Constructor to initialize fields
        protected Appliance(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        // Constructor to copy fields from another appliance
        protected Appliance(Appliance appliance) {
            this.brand = appliance.brand;
            this.model = appliance.model;
            this.price = appliance.price;
        }

        // Abstract method to be implemented by concrete classes
        public abstract Appliance clone();

        @Override
        public String toString() {
            return "Appliance [brand=" + brand + ", model=" + model + ", price=" + price + "]";
        }
    }

    // Concrete Product class: TV
    public class TV extends Appliance {
        private String resolution;

        // Constructor to initialize fields
        public TV(String brand, String model, double price, String resolution) {
            super(brand, model, price);
            this.resolution = resolution;
        }

        // Constructor to copy fields from another TV
        public TV(TV tv) {
            super(tv);
            this.resolution = tv.resolution;
        }

        // Clone method to return a copy of this TV
        @Override
        public TV clone() {
            return new TV(this);
        }

        @Override
        public String toString() {
            return super.toString() + ", TV [resolution=" + resolution + "]";
        }
    }

    // Concrete Product class: Fan
    public class Fan extends Appliance {
        private double speed;

        // Constructor to initialize fields
        public Fan(String brand, String model, double price, double speed) {
            super(brand, model, price);
            this.speed = speed;
        }

        // Constructor to copy fields from another Fan
        public Fan(Fan fan) {
            super(fan);
            this.speed = fan.speed;
        }

        // Clone method to return a copy of this Fan
        @Override
        public Fan clone() {
            return new Fan(this);
        }

        @Override
        public String toString() {
            return super.toString() + ", Fan [speed=" + speed + "]";
        }
    }

    // Main method for testing the Prototype Pattern
    public static void main(String[] args) {
        Prototype prototypePattern = new Prototype();

        // Create and initialize a TV object
        TV originalTV = prototypePattern.new TV("Samsung", "QLED", 1500, "4K");

        // Clone the TV object
        TV clonedTV = originalTV.clone();
        System.out.println("Original TV: " + originalTV); // Output: Original TV: Appliance [brand=Samsung, model=QLED, price=1500.0], TV [resolution=4K]
        System.out.println("Cloned TV: " + clonedTV);     // Output: Cloned TV: Appliance [brand=Samsung, model=QLED, price=1500.0], TV [resolution=4K]

        // Create and initialize a Fan object
        Fan originalFan = prototypePattern.new Fan("Dyson", "Cool", 300, 3.5);

        // Clone the Fan object
        Fan clonedFan = originalFan.clone();
        System.out.println("Original Fan: " + originalFan); // Output: Original Fan: Appliance [brand=Dyson, model=Cool, price=300.0], Fan [speed=3.5]
        System.out.println("Cloned Fan: " + clonedFan);     // Output: Cloned Fan: Appliance [brand=Dyson, model=Cool, price=300.0], Fan [speed=3.5]
    }
}
