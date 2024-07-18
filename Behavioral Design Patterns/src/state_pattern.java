public class state_pattern {

    // Context class
    public class Phone {
        private State state;

        public Phone(State state) {
            this.state = state;
        }

        public void setState(State state) {
            this.state = state;
        }

        public void displayHomeScreen() {
            System.out.println("On home screen");
        }

        public void displayLockScreen() {
            System.out.println("On lock screen");
        }

        public void displayOffScreen() {
            System.out.println("Phone is off");
        }

        public void pressHomeButton() {
            state.onHome();
        }

        public void pressPowerButton() {
            state.onOffon();
        }
    }

    // State abstract class
    public abstract class State {
        protected Phone phone;

        public State(Phone phone) {
            this.phone = phone;
        }

        public abstract void onHome();
        public abstract void onOffon();
    }

    // Concrete State: HomeState
    public class HomeState extends State {
        public HomeState(Phone phone) {
            super(phone);
        }

        @Override
        public void onHome() {
            // Already in home state, no state transition
            phone.displayHomeScreen();
        }

        @Override
        public void onOffon() {
            phone.setState(new OffState(phone));
            phone.displayOffScreen();
        }
    }

    // Concrete State: LockState
    public class LockState extends State {
        public LockState(Phone phone) {
            super(phone);
        }

        @Override
        public void onHome() {
            phone.setState(new HomeState(phone));
            phone.displayHomeScreen();
        }

        @Override
        public void onOffon() {
            phone.setState(new OffState(phone));
            phone.displayOffScreen();
        }
    }

    // Concrete State: OffState
    public class OffState extends State {
        public OffState(Phone phone) {
            super(phone);
        }

        @Override
        public void onHome() {
            phone.setState(new LockState(phone));
            phone.displayLockScreen();
        }

        @Override
        public void onOffon() {
            phone.setState(new LockState(phone));
            phone.displayLockScreen();
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        state_pattern sp = new state_pattern();
        Phone phone = sp.new Phone(sp.new OffState(sp.new Phone(null)));

        System.out.println("Turning phone on (from off to lock):");
        phone.pressHomeButton(); // Expect: On lock screen

        System.out.println("Unlocking phone (from lock to home):");
        phone.pressHomeButton(); // Expect: On home screen

        System.out.println("Locking phone (from home to off):");
        phone.pressPowerButton(); // Expect: Phone is off

        System.out.println("Turning phone back on (from off to lock):");
        phone.pressHomeButton(); // Expect: On lock screen

        System.out.println("Locking phone (from lock to off):");
        phone.pressPowerButton(); // Expect: Phone is off
    }
}
