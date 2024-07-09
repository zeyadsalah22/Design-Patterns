public class Builder {

    // Product class
    public class Car {
        private String brand;
        private String model;
        private String color;
        private int doors;

        // Private constructor to prevent direct instantiation
        private Car(CarBuilder builder) {
            this.brand = builder.brand;
            this.model = builder.model;
            this.color = builder.color;
            this.doors = builder.doors;
        }

        @Override
        public String toString() {
            return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", doors=" + doors + "]";
        }
    }

    // Builder interface
    public interface Builderr {
        void brand(String brand);
        void model(String model);
        void color(String color);
        void doors(int doors);
        Car build();
    }

    // Concrete Builder class
    public class CarBuilder implements Builderr {
        private String brand;
        private String model;
        private String color;
        private int doors;

        @Override
        public void brand(String brand) {
            this.brand = brand;
        }

        @Override
        public void model(String model) {
            this.model = model;
        }

        @Override
        public void color(String color) {
            this.color = color;
        }

        @Override
        public void doors(int doors) {
            this.doors = doors;
        }

        @Override
        public Car build() {
            return new Car(this);
        }
    }

    // Director class
    public class CarDirector {
        public void constructFerrari(Builderr builder) {
            builder.brand("Ferrari");
            builder.model("2022");
            builder.color("Red");
            builder.doors(2);
        }

        public void constructBugatti(Builderr builder) {
            builder.brand("Bugatti");
            builder.model("2024");
            builder.color("Black");
            builder.doors(2);
        }
    }

    // Main method for testing the Builder Pattern
    public static void main(String[] args) {
        Builder pattern = new Builder();
        CarDirector director = pattern.new CarDirector();
        CarBuilder builder = pattern.new CarBuilder();

        director.constructFerrari(builder);
        Car ferrari = builder.build();
        System.out.println(ferrari); // Output: Car [brand=Ferrari, model=2022, color=Red, doors=2]

        builder = pattern.new CarBuilder(); // Reset builder for new car
        director.constructBugatti(builder);
        Car bugatti = builder.build();
        System.out.println(bugatti); // Output: Car [brand=Bugatti, model=2024, color=Black, doors=2]
    }
}
