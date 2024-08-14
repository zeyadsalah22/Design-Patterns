namespace FactoryMethod
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

    // Abstract class defining the factory method
    public abstract class Developer
    {
        // Method to create and develop a Mobile
        public Mobile GetMobile()
        {
            Mobile m = DevelopMobile();
            m.Develop();
            return m;
        }

        // Abstract method to be implemented by subclasses to create specific Mobiles
        protected abstract Mobile DevelopMobile();
    }

    // Concrete developer class for creating Samsung Mobiles
    public class Samsung : Developer
    {
        protected override Mobile DevelopMobile()
        {
            return new SamsungMobile();
        }
    }

    // Concrete developer class for creating Apple Mobiles
    public class Apple : Developer
    {
        protected override Mobile DevelopMobile()
        {
            return new AppleMobile();
        }
    }

    // Program class to test the Factory Method pattern implementation
    internal class Program
    {
        static void Main(string[] args)
        {
            // Creating a Samsung developer and getting a Samsung Mobile
            Developer sd = new Samsung();
            Mobile SamsungMobile = sd.GetMobile();

            // Creating an Apple developer and getting an Apple Mobile
            Developer ad = new Apple();
            Mobile AppleMobile = ad.GetMobile();
        }
    }
}
