namespace Builder
{
    // Product class
    public class Car
    {
        // Car attributes
        private string brand;
        private string model;
        private int doors;
        private string color;

        // Properties for Car attributes
        public string Brand { get => brand; set => brand = value; }
        public string Model { get => model; set => model = value; }
        public int Doors { get => doors; set => doors = value; }
        public string Color { get => color; set => color = value; }

        // Overriding ToString method to display Car details
        public override string ToString()
        {
            return $"Brand: {Brand}, Model: {Model}, Doors: {Doors}, Color: {Color}";
        }
    }

    // Builder interface
    public interface Builder
    {
        // Methods for setting Car attributes
        void Brand(string brand);
        void Model(string model);
        void Doors(int doors);
        void Color(string color);

        // Method to build the Car
        Car Build();
    }

    // Concrete Builder class
    public class CarBuilder : Builder
    {
        // Instance of the Car being built
        private Car car = new Car();

        // Implementing methods to set Car attributes
        public void Brand(string brand)
        {
            car.Brand = brand;
        }

        public void Model(string model)
        {
            car.Model = model;
        }

        public void Doors(int doors)
        {
            car.Doors = doors;
        }

        public void Color(string color)
        {
            car.Color = color;
        }

        // Method to build and return the Car
        public Car Build()
        {
            return this.car;
        }
    }

    // Director class
    public class Director
    {
        // Method to construct a Ferrari Car
        public void ConstructFerrari(Builder builder)
        {
            builder.Brand("Ferrari");
            builder.Model("F8 Tributo");
            builder.Doors(2);
            builder.Color("Red");
        }

        // Method to construct a Bugatti Car
        public void ConstructBuggati(Builder builder)
        {
            builder.Brand("Bugatti");
            builder.Model("Chiron");
            builder.Doors(2);
            builder.Color("Blue");
        }
    }

    // Program class for testing the Builder Pattern
    internal class Program
    {
        static void Main(string[] args)
        {
            // Creating instances of the builder and director
            CarBuilder builder = new CarBuilder();
            Director director = new Director();

            // Constructing a Ferrari and displaying its details
            director.ConstructFerrari(builder);
            Car ferrari = builder.Build();
            Console.WriteLine(ferrari.ToString()); // Output: Brand: Ferrari, Model: F8 Tributo, Doors: 2, Color: Red

            // Constructing a Bugatti and displaying its details
            director.ConstructBuggati(builder);
            Car bugatti = builder.Build();
            Console.WriteLine(bugatti.ToString()); // Output: Brand: Bugatti, Model: Chiron, Doors: 2, Color: Blue
        }
    }
}
