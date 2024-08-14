namespace MementoPattern
{

    // Originator class
    public class TextField
    {
        private string content;

        public TextField(string content)
        {
            this.Content = content;
        }

        public string Content { get => content; set => content = value; }

        public void write(string text)
        {
            content += text;
        }

        // Creates a memento containing a snapshot of the current state
        public TextMemento CreateMemento()
        {
            return new TextMemento(this.content);
        }

        // Restores the originator's state from the memento
        public void RestoreMemento(TextMemento memento)
        {
            this.content = memento.Content;
        }
    }

    // Memento class
    public class TextMemento
    {
        private string content;

        public TextMemento(string content)
        {
            this.Content = content;
        }

        public string Content { get => content; set => content = value; }
    }

    // Caretaker class
    public class History { 
        private List<TextMemento> mementos = new List<TextMemento>();

        // Adds a memento to the list
        public void AddMemento(TextMemento memento)
        {
            mementos.Add(memento);
        }

        // Retrieves a memento from the list
        public TextMemento GetMemento(int index)
        {
            return mementos[index];
        }
    }
    internal class Program
    {
        // Main function for testing
        static void Main(string[] args)
        {
            TextField textField = new TextField("Hello");
            History history = new History();

            // Write some text and save states
            textField.write(", World!");
            history.AddMemento(textField.CreateMemento());

            textField.write(" How are you?");
            history.AddMemento(textField.CreateMemento());

            // Print current content
            Console.WriteLine("Current Content: " + textField.Content);

            // Restore to the first saved state
            textField.RestoreMemento(history.GetMemento(0));
            Console.WriteLine("Restored to first state: " + textField.Content);

            // Restore to the second saved state
            textField.RestoreMemento(history.GetMemento(1));
            Console.WriteLine("Restored to second state: " + textField.Content);
        }
    }
}
