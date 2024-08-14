namespace ChainResponsibilityPattern
{
    public interface Handler
    {
        public void SetNext(Handler nexthandler);
        public void Handle(int severity);
    }

    public class Handler1 : Handler
    {
        private Handler nexthandler;

        public void SetNext(Handler nexthandler)
        {
            this.nexthandler = nexthandler;
        }

        public void Handle(int severity)
        {
            if (severity == 1)
            {
                Console.WriteLine("First handler is handling the request");
            }
            else if(nexthandler != null)
            {
                nexthandler.Handle(severity);
            }
            else {
                Console.WriteLine("Can't handle it");
            }
        }
    }
    public class Handler2 : Handler
    {
        private Handler nexthandler;

        public void SetNext(Handler nexthandler)
        {
            this.nexthandler = nexthandler;
        }

        public void Handle(int severity)
        {
            if (severity == 2)
            {
                Console.WriteLine("Second handler is handling the request");
            }
            else if (nexthandler != null)
            {
                nexthandler.Handle(severity);
            }
            else
            {
                Console.WriteLine("Can't handle it");
            }
        }
    }

    public class Handler3 : Handler
    {
        private Handler nexthandler;

        public void SetNext(Handler nexthandler)
        {
            this.nexthandler = nexthandler;
        }

        public void Handle(int severity)
        {
            if (severity == 3)
            {
                Console.WriteLine("Third handler is handling the request");
            }
            else if (nexthandler != null)
            {
                nexthandler.Handle(severity);
            }
            else
            {
                Console.WriteLine("Can't handle it");
            }
        }
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            Handler handler1 = new Handler1();
            Handler handler2 = new Handler2();
            Handler handler3 = new Handler3();

            handler1.SetNext(handler2);
            handler2.SetNext(handler3);

            // Testing various severity levels
            Console.WriteLine("Test severity level 1:");
            handler1.Handle(1);  // Expected: "first handler handled it"

            Console.WriteLine("Test severity level 2:");
            handler1.Handle(2);  // Expected: "second handler handled it"

            Console.WriteLine("Test severity level 3:");
            handler1.Handle(3);  // Expected: "third handler handled it"

            Console.WriteLine("Test severity level 4:");
            handler1.Handle(4);  // Expected: "Can't be handled"
        }
    }
}
