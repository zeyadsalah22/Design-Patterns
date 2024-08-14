namespace CommandPattern
{
    public interface Device
    {
        public void TurnOn();
        public void TurnOff();
    }

    public interface Command
    {
        public void Execute();
    }

    public class TurnOnCommand : Command
    {
        private Device device;

        public TurnOnCommand(Device device)
        {
            this.device = device;
        }

        public void Execute()
        {
            device.TurnOn();
        }
    }
    public class TurnOffCommand : Command
    {
        private Device device;

        public TurnOffCommand(Device device)
        {
            this.Device = device;
        }

        public Device Device { get => device; set => device = value; }

        public void Execute()
        {
            this.Device.TurnOff();
        }
    }

    public class Tv : Device
    {
        public void TurnOn()
        {
            Console.WriteLine("TV is turned on");
        }
        public void TurnOff()
        {
            Console.WriteLine("TV is turned off");
        }
    }

    public class Fan : Device
    {
        public void TurnOn()
        {
            Console.WriteLine("Fan is turned on");
        }
        public void TurnOff()
        {
            Console.WriteLine("Fan is turned off");
        }
    }

    public class Light : Device
    {
        public void TurnOn()
        {
            Console.WriteLine("Light is turned on");
        }
        public void TurnOff()
        {
            Console.WriteLine("Light is turned off");
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Device tv = new Tv();
            Device light = new Light();
            Device fan = new Fan();

            Command turnOnTV = new TurnOnCommand(tv);
            Command turnOffTV = new TurnOffCommand(tv);

            Command turnOnLight = new TurnOnCommand(light);
            Command turnOffLight = new TurnOffCommand(light);

            Command turnOnFan = new TurnOnCommand(fan);
            Command turnOffFan = new TurnOffCommand(fan);

            // Testing the commands
            Console.WriteLine("Testing TV commands:");
            turnOnTV.Execute();
            turnOffTV.Execute();

            Console.WriteLine("Testing Light commands:");
            turnOnLight.Execute();
            turnOffLight.Execute();

            Console.WriteLine("Testing Fan commands:");
            turnOnFan.Execute();
            turnOffFan.Execute();
        }
    }
}
