namespace ProtoType
{
    // Abstract class representing an Appliance
    public abstract class Appliance
    {
        // Common attributes for all appliances
        protected string brand;
        protected string model;
        protected double price;

        // Constructor to initialize an Appliance
        protected Appliance(string brand, string model, double price)
        {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        // Copy constructor to create a copy of an Appliance
        protected Appliance(Appliance appliance)
        {
            this.brand = appliance.brand;
            this.model = appliance.model;
            this.price = appliance.price;
        }

        // Abstract method to be implemented by subclasses for cloning
        public abstract Appliance clone();

        // Overriding ToString method to display Appliance details
        public override string? ToString()
        {
            return "Appliance [brand=" + brand + ", model=" + model + ", price=" + price + "]";
        }
    }

    // Concrete class representing a TV
    public class TV : Appliance
    {
        // Additional attribute specific to TV
        private string resolution;

        // Constructor to initialize a TV
        public TV(string brand, string model, double price, string resolution)
            : base(brand, model, price)
        {
            this.resolution = resolution;
        }

        // Copy constructor to create a copy of a TV
        public TV(TV tv)
            : base(tv)
        {
            this.resolution = tv.resolution;
        }

        // Method to clone a TV object
        public override TV clone()
        {
            return new TV(this);
        }

        // Overriding ToString method to display TV details
        public override string ToString()
        {
            return base.ToString() + $", TV [resolution= {this.resolution} ]";
        }
    }

    // Concrete class representing a Fan
    public class Fan : Appliance
    {
        // Additional attribute specific to Fan
        private double speed;

        // Constructor to initialize a Fan
        public Fan(string brand, string model, double price, double speed)
            : base(brand, model, price)
        {
            this.speed = speed;
        }

        // Copy constructor to create a copy of a Fan
        public Fan(Fan fan)
            : base(fan)
        {
            this.speed = fan.speed;
        }

        // Method to clone a Fan object
        public override Fan clone()
        {
            return new Fan(this);
        }

        // Overriding ToString method to display Fan details
        public override string ToString()
        {
            return base.ToString() + $", Fan [speed= {this.speed} ]";
        }
    }

    // Program class for testing the Prototype Pattern
    internal class Program
    {
        static void Main(string[] args)
        {
            // Creating an original TV object
            TV originalTv = new TV("Samsung", "QLED", 1500, "4K");

            // Cloning the original TV object
            TV clonedTv = originalTv.clone();

            // Displaying details of the original and cloned TV
            Console.WriteLine("Original TV: " + originalTv.ToString());
            Console.WriteLine("Cloned TV: " + clonedTv.ToString());

            // Creating an original Fan object
            Fan originalFan = new Fan("Dyson", "Cool", 300, 3.5);

            // Cloning the original Fan object
            Fan clonedFan = originalFan.clone();

            // Displaying details of the original and cloned Fan
            Console.WriteLine("Original Fan: " + originalFan.ToString());
            Console.WriteLine("Cloned Fan: " + clonedFan.ToString());
        }
    }
}
