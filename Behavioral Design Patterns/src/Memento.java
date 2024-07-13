import java.util.ArrayList;
import java.util.List;

public class Memento {

    // Originator class
    public class TextField {
        private String content;

        public TextField(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void write(String text) {
            this.content += text;
        }

        // Creates a memento containing a snapshot of the current state
        public TextMemento createMemento() {
            return new TextMemento(this.content);
        }

        // Restores the originator's state from the memento
        public void restoreMemento(TextMemento memento) {
            this.content = memento.getContent();
        }
    }

    // Memento class
    public class TextMemento {
        private String content;

        public TextMemento(String content) {
            this.content = content;
        }

        public String getContent() {
            return this.content;
        }
    }

    // Caretaker class
    public class History {
        private List<TextMemento> mementos;

        public History() {
            this.mementos = new ArrayList<>();
        }

        // Adds a memento to the list
        public void addMemento(TextMemento memento) {
            this.mementos.add(memento);
        }

        // Retrieves a memento from the list
        public TextMemento getMemento(int index) {
            return this.mementos.get(index);
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        Memento mementoPattern = new Memento();

        TextField textField = mementoPattern.new TextField("Hello");
        History history = mementoPattern.new History();

        // Write some text and save states
        textField.write(", World!");
        history.addMemento(textField.createMemento());

        textField.write(" How are you?");
        history.addMemento(textField.createMemento());

        // Print current content
        System.out.println("Current Content: " + textField.getContent());

        // Restore to the first saved state
        textField.restoreMemento(history.getMemento(0));
        System.out.println("Restored to first state: " + textField.getContent());

        // Restore to the second saved state
        textField.restoreMemento(history.getMemento(1));
        System.out.println("Restored to second state: " + textField.getContent());
    }
}
