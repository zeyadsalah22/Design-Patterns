public class Chain_responsibility {
    public interface Handler {
        void setNextHandler(Handler next_handler);
        void handle(int severity);
    }

    public class Handler1 implements Handler {
        private Handler next_handler = null;

        public void handle(int severity) {
            if (severity == 1)
                System.out.println("first handler handled it");
            else if (next_handler != null)
                next_handler.handle(severity);
            else
                System.out.println("Can't be handled");
        }

        @Override
        public void setNextHandler(Handler next_handler) {
            this.next_handler = next_handler;
        }
    }

    public class Handler2 implements Handler {
        private Handler next_handler = null;

        public void handle(int severity) {
            if (severity == 2)
                System.out.println("second handler handled it");
            else if (next_handler != null)
                next_handler.handle(severity);
            else
                System.out.println("Can't be handled");
        }

        @Override
        public void setNextHandler(Handler next_handler) {
            this.next_handler = next_handler;
        }
    }

    public class Handler3 implements Handler {
        private Handler next_handler = null;

        public void handle(int severity) {
            if (severity == 3)
                System.out.println("third handler handled it");
            else if (next_handler != null)
                next_handler.handle(severity);
            else
                System.out.println("Can't be handled");
        }

        @Override
        public void setNextHandler(Handler next_handler) {
            this.next_handler = next_handler;
        }
    }

    public static void main(String[] args) {
        Chain_responsibility chain = new Chain_responsibility();

        Handler handler1 = chain.new Handler1();
        Handler handler2 = chain.new Handler2();
        Handler handler3 = chain.new Handler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        // Testing various severity levels
        System.out.println("Test severity level 1:");
        handler1.handle(1);  // Expected: "first handler handled it"

        System.out.println("Test severity level 2:");
        handler1.handle(2);  // Expected: "second handler handled it"

        System.out.println("Test severity level 3:");
        handler1.handle(3);  // Expected: "third handler handled it"

        System.out.println("Test severity level 4:");
        handler1.handle(4);  // Expected: "Can't be handled"
    }
}
