public class Builder {

    // Product class
    public class Car {
        private String brand;
        private String model;
        private String color;
        private int doors;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setDoors(int doors) {
            this.doors = doors;
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
        Car car = new Car();

        @Override
        public void brand(String brand) {
            car.setBrand(brand);
        }

        @Override
        public void model(String model) {
            car.setModel(model);
        }

        @Override
        public void color(String color) {
            car.setColor(color);
        }

        @Override
        public void doors(int doors) {
            car.setDoors(doors);
        }

        @Override
        public Car build() {
            return this.car;
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
