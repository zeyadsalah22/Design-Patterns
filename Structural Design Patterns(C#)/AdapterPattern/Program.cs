namespace AdapterPattern
{
    // Interface representing a Citizen
    public interface Citizen
    {
        // Method that all citizens must implement to speak
        void Speak();
    }

    // Class representing an Arabian citizen
    public class Arabian : Citizen
    {
        // Method implementation for Arabian to speak Arabic
        public virtual void Speak()
        {
            Console.WriteLine("I speak Arabic");
        }
    }

    // Class representing an American citizen
    public class American : Citizen
    {
        // Method implementation for American to speak English
        public virtual void Speak()
        {
            Console.WriteLine("I speak English");
        }
    }

    // Adapter class that allows Arabian to be understood as an American
    public class Adapter : American
    {
        // Instance of Arabian to adapt
        private Arabian arabian;

        // Constructor to initialize the adapter with an Arabian instance
        public Adapter(Arabian arabian)
        {
            this.arabian = arabian;
        }

        // Override the Speak method to include translation
        public override void Speak()
        {
            // Call the original American speak method
            base.Speak();
            // Add translation logic
            Console.WriteLine("Translating into Arabic");
            // Arabian speaks after translation
            arabian.Speak();
        }
    }

    // Main program to demonstrate the Adapter Pattern
    internal class Program
    {
        static void Main(string[] args)
        {
            // Creating an Arabian citizen and demonstrating their speech
            Arabian arabian = new Arabian();
            Console.WriteLine("Arabian:");
            arabian.Speak();

            // Creating an American citizen and demonstrating their speech
            American american = new American();
            Console.WriteLine("American:");
            american.Speak();

            // Using the Adapter to allow the Arabian to communicate through the American interface
            Adapter adapter = new Adapter(arabian);
            Console.WriteLine("Adapter:");
            adapter.Speak();
        }
    }
}
