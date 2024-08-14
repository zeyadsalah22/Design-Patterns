namespace Singleton
{
    // Singleton class to ensure only one instance is created
    public class Singleton
    {
        // Volatile instance variable to ensure visibility of changes across threads
        private static volatile Singleton instance;

        // Private data field to hold instance-specific data
        private string data;

        // Private constructor to prevent instantiation from other classes
        private Singleton(string data)
        {
            this.Data = data;
        }

        // Public property to access the data field
        public string Data { get => data; set => data = value; }

        // Public method to get the singleton instance
        public static Singleton GetInstance(string data)
        {
            // Note: The multithreading part should be implemented here
            Singleton localInstance = instance;
            if (localInstance == null)
            {
                instance = new Singleton(data);
            }
            return instance;
        }
    }

    // Program class to test the Singleton implementation
    internal class Program
    {
        static void Main(string[] args)
        {
            // Creating the first instance of Singleton
            Singleton s1 = Singleton.GetInstance("first instance");
            Console.WriteLine(s1.Data); // Output: first instance

            // Trying to create a second instance of Singleton
            Singleton s2 = Singleton.GetInstance("second instance");
            Console.WriteLine(s2.Data); // Output: first instance

            // Checking if both instances are the same
            Console.WriteLine(s1 == s2); // Output: True
        }
    }
}
