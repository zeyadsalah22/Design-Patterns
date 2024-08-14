namespace AbstractFactory
{
    // Interface for Mobile products
    public interface Mobile
    {
        // Method to be implemented by all Mobile products
        void Develop();
    }

    // Concrete class representing a Samsung Mobile
    public class SamsungMobile : Mobile
    {
        public void Develop()
        {
            Console.WriteLine("This is a Samsung Mobile");
        }
    }

    // Concrete class representing an Apple Mobile
    public class AppleMobile : Mobile
    {
        public void Develop()
        {
            Console.WriteLine("This is an Apple Mobile");
        }
    }

    // Interface for AirPods products
    public interface AirPods
    {
        // Method to be implemented by all AirPods products
        void Develop();
    }

    // Concrete class representing Samsung AirPods
    public class SamsungAirPods : AirPods
    {
        public void Develop()
        {
            Console.WriteLine("This is a Samsung AirPods");
        }
    }

    // Concrete class representing Apple AirPods
    public class AppleAirPods : AirPods
    {
        public void Develop()
        {
            Console.WriteLine("This is an Apple AirPods");
        }
    }

    // Abstract class defining the factory method for creating families of products
    public abstract class Developer
    {
        // Method to create and develop a Mobile
        public Mobile GetMobile()
        {
            Mobile m = DevelopMobile();
            m.Develop();
            return m;
        }

        // Method to create and develop AirPods
        public AirPods GetAirPods()
        {
            AirPods a = DevelopAirPods();
            a.Develop();
            return a;
        }

        // Abstract method to be implemented by subclasses to create specific Mobiles
        protected abstract Mobile DevelopMobile();

        // Abstract method to be implemented by subclasses to create specific AirPods
        protected abstract AirPods DevelopAirPods();
    }

    // Concrete class representing a Samsung developer
    public class Samsung : Developer
    {
        protected override AirPods DevelopAirPods()
        {
            return new SamsungAirPods();
        }

        protected override Mobile DevelopMobile()
        {
            return new SamsungMobile();
        }
    }

    // Concrete class representing an Apple developer
    public class Apple : Developer
    {
        protected override AirPods DevelopAirPods()
        {
            return new AppleAirPods();
        }

        protected override Mobile DevelopMobile()
        {
            return new AppleMobile();
        }
    }

    // Program class to test the Abstract Factory pattern implementation
    internal class Program
    {
        static void Main(string[] args)
        {
            // Creating a Samsung developer and getting a Samsung Mobile and AirPods
            Developer sd = new Samsung();
            Mobile SamsungMobile = sd.GetMobile();
            AirPods SamsungAirPods = sd.GetAirPods();

            // Creating an Apple developer and getting an Apple Mobile and AirPods
            Developer ad = new Apple();
            Mobile AppleMobile = ad.GetMobile();
            AirPods AppleAirPods = ad.GetAirPods();
        }
    }
}
