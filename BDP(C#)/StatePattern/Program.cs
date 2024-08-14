namespace StatePattern
{
    // Context class
    public class Phone
    {
        private State state;

        public Phone() {}
        public Phone(State state)
        {
            this.State = state;
        }
        public State State { get => state; set => state = value; }

        public void DisplayHomeScreen()
        {
            Console.WriteLine("On home screen");
        }

        public void DisplayLockScreen()
        {
            Console.WriteLine("On lock screen");
        }

        public void DisplayOffScreen()
        {
            Console.WriteLine("On off screen");
        }

        public void PressHomeButton()
        {
            this.State.HomeButton();
        }

        public void PressPowerButton()
        {
            this.State.PowerButton();
        }
    }

    // State Abtract class
    public abstract class State
    {
        protected Phone phone;
        public State(Phone phone)
        {
            this.phone = phone;
        }
        public abstract void HomeButton();
        public abstract void PowerButton();
    }

    // Concrete state : HomeState
    public class HomeState : State
    {
        public HomeState(Phone phone) : base(phone) { }

        public override void HomeButton()
        {
            // Already in home state, no state transition
            this.phone.DisplayHomeScreen();
        }

        public override void PowerButton()
        {
            this.phone.State = new OffState(this.phone);
            this.phone.DisplayOffScreen();
        }
    }

    // Concrete state : OffState
    public class OffState : State
    {
        public OffState(Phone phone) : base(phone) { }

        public override void HomeButton()
        {
            this.phone.State = new LockState(this.phone);
            this.phone.DisplayLockScreen();
        }

        public override void PowerButton()
        {
            this.phone.State = new LockState(this.phone);
            this.phone.DisplayLockScreen();
        }
    }

    // Concrete State : LockState
    public class LockState : State
    {
        public LockState(Phone phone) : base(phone) { }

        public override void HomeButton()
        {
            this.phone.State = new HomeState(this.phone);
            this.phone.DisplayHomeScreen();
        }

        public override void PowerButton()
        {
            this.phone.State = new OffState(this.phone);
            this.phone.DisplayOffScreen();
        }
    }
    internal class Program
    {
        // Main function for testing
        static void Main(string[] args)
        {
            Phone phone = new Phone();
            phone.State = new OffState(phone);

            Console.WriteLine("Turning phone on (from off to lock):");
            phone.PressHomeButton(); // Expect: On lock screen

            Console.WriteLine("Unlocking phone (from lock to home):");
            phone.PressHomeButton(); // Expect: On home screen

            Console.WriteLine("Locking phone (from home to off):");
            phone.PressPowerButton(); // Expect: Phone is off

            Console.WriteLine("Turning phone back on (from off to lock):");
            phone.PressHomeButton(); // Expect: On lock screen

            Console.WriteLine("Locking phone (from lock to off):");
            phone.PressPowerButton(); // Expect: Phone is off
        }
    }
}
