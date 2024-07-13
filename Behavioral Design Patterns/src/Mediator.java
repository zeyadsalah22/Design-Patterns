public class Mediator {

    // Colleague interface
    public interface Airplane {
        void requestTakeOff();
        void requestLanding();
        void notifyControlTower(String message);
    }

    // Mediator interface
    public interface ControlTower {
        void requestTakeOff(Airplane airplane);
        void requestLanding(Airplane airplane);
    }

    // Concrete Colleague
    public class EnterprisePlane implements Airplane {
        private ControlTower mediator;

        public EnterprisePlane(ControlTower mediator) {
            this.mediator = mediator;
        }

        @Override
        public void requestTakeOff() {
            mediator.requestTakeOff(this);
        }

        @Override
        public void requestLanding() {
            mediator.requestLanding(this);
        }

        @Override
        public void notifyControlTower(String message) {
            System.out.println("Enterprise Plane: " + message);
        }
    }

    // Concrete Colleague
    public class CommercialPlane implements Airplane {
        private ControlTower mediator;

        public CommercialPlane(ControlTower mediator) {
            this.mediator = mediator;
        }

        @Override
        public void requestTakeOff() {
            mediator.requestTakeOff(this);
        }

        @Override
        public void requestLanding() {
            mediator.requestLanding(this);
        }

        @Override
        public void notifyControlTower(String message) {
            System.out.println("Commercial Plane: " + message);
        }
    }

    // Concrete Mediator
    public class AirportControlTower implements ControlTower {
        @Override
        public void requestTakeOff(Airplane airplane) {
            airplane.notifyControlTower("requesting take off");
        }

        @Override
        public void requestLanding(Airplane airplane) {
            airplane.notifyControlTower("requesting landing");
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        Mediator mediatorPattern = new Mediator();
        ControlTower controlTower = mediatorPattern.new AirportControlTower();

        Airplane enterprisePlane = mediatorPattern.new EnterprisePlane(controlTower);
        Airplane commercialPlane = mediatorPattern.new CommercialPlane(controlTower);

        enterprisePlane.requestTakeOff();
        commercialPlane.requestLanding();
    }
}
