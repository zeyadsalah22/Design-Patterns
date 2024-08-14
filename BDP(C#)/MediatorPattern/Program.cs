namespace MediatorPattern
{

    // Colleague interface
    public interface Airplane
    {
        public void RequestTakeOff();
        public void RequestLanding();
        public void NotifyControlTower(string message);
    }

    // Mediator interface
    public interface ControlTower
    {
        public void RequestTakeOff(Airplane airplane);
        public void RequestLanding(Airplane airplane);
    }

    // Concrete Colleague
    public class  EnterprisePlane : Airplane
    {
        private ControlTower mediator;

        public EnterprisePlane(ControlTower mediator)
        {
            this.Mediator = mediator;
        }

        public ControlTower Mediator { get => mediator; set => mediator = value; }

        public void RequestTakeOff()
        {
            mediator.RequestTakeOff(this);
        }

        public void RequestLanding() {
            mediator.RequestLanding(this);
        }
        public void NotifyControlTower(string message)
        {
            Console.WriteLine("EnterprisePlane says: " + message);
        }
    }

    // Concrete Colleague
    public class CommercialPlane : Airplane
    {
        private ControlTower mediator;

        public CommercialPlane(ControlTower mediator)
        {
            this.Mediator = mediator;
        }

        public ControlTower Mediator { get => mediator; set => mediator = value; }

        public void RequestTakeOff()
        {
            mediator.RequestTakeOff(this);
        }

        public void RequestLanding()
        {
            mediator.RequestLanding(this);
        }
        public void NotifyControlTower(string message)
        {
            Console.WriteLine("CommercialPlane says: " + message);
        }
    }

    // Concrete Mediator
    public class AirportControlTower : ControlTower
    {
        public void RequestTakeOff(Airplane airplane)
        {
            airplane.NotifyControlTower("Requesting takeoff");
        }
        public void RequestLanding(Airplane airplane)
        {
            airplane.NotifyControlTower("Requesting landing");
        }
    }
    internal class Program
    {
        // Main function for testing
        static void Main(string[] args)
        {
            ControlTower controlTower = new AirportControlTower();

            Airplane enterprisePlane = new EnterprisePlane(controlTower);
            Airplane commercialPlane = new CommercialPlane(controlTower);

            enterprisePlane.RequestTakeOff();
            commercialPlane.RequestLanding();
        }
    }
}
