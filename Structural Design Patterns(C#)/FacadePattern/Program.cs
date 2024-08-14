namespace FacadePattern
{
    // Subsystem class: Windows
    public class Windows
    {
        public void On()
        {
            Console.WriteLine("Starting windows");
        }

        public void Off()
        {
            Console.WriteLine("Shutting down windows");
        }
    }

    // Subsystem class: RAM
    public class RAM
    {
        public void On()
        {
            Console.WriteLine("Using RAM");
        }

        public void Off()
        {
            Console.WriteLine("RAM is empty");
        }
    }

    // Subsystem class: TaskManager
    public class TaskManager
    {
        public void On()
        {
            Console.WriteLine("Starting Task Manager");
        }

        public void Off()
        {
            Console.WriteLine("Closing Task Manager");
        }
    }

    // Facade class: PcFacade
    public class PcFacade
    {
        private Windows windows;
        private RAM ram;
        private TaskManager taskManager;

        public PcFacade(Windows windows, RAM ram, TaskManager taskManager)
        {
            this.windows = windows;
            this.ram = ram;
            this.taskManager = taskManager;
        }

        // Facade method to start the PC
        public void openPc()
        {
            windows.On();
            ram.On();
            taskManager.On();
        }

        // Facade method to shut down the PC
        public void closePc()
        {
            taskManager.Off();
            ram.Off();
            windows.Off();
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Windows windows = new Windows();
            RAM ram = new RAM();
            TaskManager taskManager = new TaskManager();

            PcFacade pcFacade = new PcFacade(windows, ram, taskManager);

            // Using the Facade to start the PC
            Console.WriteLine("Starting the PC:");
            pcFacade.openPc();

            // Using the Facade to shut down the PC
            Console.WriteLine("Shutting down the PC:");
            pcFacade.closePc();
        }
    }
}
