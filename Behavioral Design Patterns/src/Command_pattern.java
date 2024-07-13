public class Command_pattern {
    public interface Device {
        void TurnOn();
        void TurnOff();
    }

    public interface Command {
        void execute();
    }

    public class TurnON implements Command {
        private Device device;

        public TurnON(Device device) {
            this.device = device;
        }

        @Override
        public void execute() {
            this.device.TurnOn();
        }
    }

    public class TurnOFF implements Command {
        private Device device;

        public TurnOFF(Device device) {
            this.device = device;
        }

        @Override
        public void execute() {
            this.device.TurnOff();
        }
    }

    public class TV implements Device {
        @Override
        public void TurnOn() {
            System.out.println("TV is now ON");
        }

        @Override
        public void TurnOff() {
            System.out.println("TV is now OFF");
        }
    }

    public class Light implements Device {
        @Override
        public void TurnOn() {
            System.out.println("Light is now ON");
        }

        @Override
        public void TurnOff() {
            System.out.println("Light is now OFF");
        }
    }

    public class Fan implements Device {
        @Override
        public void TurnOn() {
            System.out.println("Fan is now ON");
        }

        @Override
        public void TurnOff() {
            System.out.println("Fan is now OFF");
        }
    }

    public static void main(String[] args) {
        Command_pattern commandPattern = new Command_pattern();

        Device tv = commandPattern.new TV();
        Device light = commandPattern.new Light();
        Device fan = commandPattern.new Fan();

        Command turnOnTV = commandPattern.new TurnON(tv);
        Command turnOffTV = commandPattern.new TurnOFF(tv);

        Command turnOnLight = commandPattern.new TurnON(light);
        Command turnOffLight = commandPattern.new TurnOFF(light);

        Command turnOnFan = commandPattern.new TurnON(fan);
        Command turnOffFan = commandPattern.new TurnOFF(fan);

        // Testing the commands
        System.out.println("Testing TV commands:");
        turnOnTV.execute();
        turnOffTV.execute();

        System.out.println("Testing Light commands:");
        turnOnLight.execute();
        turnOffLight.execute();

        System.out.println("Testing Fan commands:");
        turnOnFan.execute();
        turnOffFan.execute();
    }
}
