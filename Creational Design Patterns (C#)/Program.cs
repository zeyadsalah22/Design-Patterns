namespace Creational_Design_Patterns__C__
{
    public class Singleton
    {
        private static volatile Singleton instance;
        private string data;

        private Singleton(string data)
        {
            this.Data = data;
        }

        public string Data { get => data; set => data = value; }

        public static Singleton getInstance(string data)
        {
            Singleton localInstance = instance;
            if (localInstance == null)
            {
                lock (typeof(Singleton)) {
                    localInstance = instance;
                    if (localInstance == null) {
                        instance = localInstance = new Singleton(data);
                    }
                }
            }
            return localInstance;
        }

    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Singleton s1 = Singleton.getInstance("Hello");
            Singleton s2 = Singleton.getInstance("World");
            Console.WriteLine(s1.Data);
            Console.WriteLine(s2.Data);
            Console.WriteLine(s1==s2);
        }
    }
}
