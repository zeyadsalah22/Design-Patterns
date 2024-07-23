public class Facade_pattern {

    // Subsystem class: Windows
    public class Windows {
        public void On() {
            System.out.println("Starting windows");
        }

        public void Off() {
            System.out.println("Shutting down windows");
        }
    }

    // Subsystem class: RAM
    public class RAM {
        public void On() {
            System.out.println("Using RAM");
        }

        public void Off() {
            System.out.println("RAM is empty");
        }
    }

    // Subsystem class: TaskManager
    public class TaskManager {
        public void On() {
            System.out.println("Starting Task Manager");
        }

        public void Off() {
            System.out.println("Closing Task Manager");
        }
    }

    // Facade class: PcFacade
    public class PcFacade {
        private Windows windows;
        private RAM ram;
        private TaskManager taskManager;

        public PcFacade(Windows windows, RAM ram, TaskManager taskManager) {
            this.windows = windows;
            this.ram = ram;
            this.taskManager = taskManager;
        }

        // Facade method to start the PC
        void openPc() {
            windows.On();
            ram.On();
            taskManager.On();
        }

        // Facade method to shut down the PC
        void closePc() {
            taskManager.Off();
            ram.Off();
            windows.Off();
        }
    }

    // Main method for testing the Facade pattern
    public static void main(String[] args) {
        Facade_pattern facade_pattern = new Facade_pattern();

        Windows windows = facade_pattern.new Windows();
        RAM ram = facade_pattern.new RAM();
        TaskManager taskManager = facade_pattern.new TaskManager();

        PcFacade pcFacade = facade_pattern.new PcFacade(windows, ram, taskManager);

        // Using the Facade to start the PC
        System.out.println("Starting the PC:");
        pcFacade.openPc();

        // Using the Facade to shut down the PC
        System.out.println("Shutting down the PC:");
        pcFacade.closePc();
    }
}
