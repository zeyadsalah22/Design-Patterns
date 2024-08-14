namespace CompositePattern
{
    // Interface for book components
    public interface Book
    {
        void Display(); 
    }

    // Concrete implementation of a simple book
    public class SimpleBook : Book
    {
        private string title; 
        public string Title { get => title; set => title = value; } 

        public SimpleBook(string title)
        {
            this.title = title;
        }

        // Method to display the title of the simple book
        public void Display()
        {
            Console.WriteLine("Book's Title: " + this.title);
        }
    }

    // Concrete implementation of a book series (composite)
    public class BookSeries : Book
    {
        private string title; 
        public string Title { get => title; set => title = value; } 
        private List<Book> books = new List<Book>(); 

        public BookSeries(string title)
        {
            this.title = title;
        }

        // Method to add a book to the series
        public void AddBook(Book book)
        {
            books.Add(book);
        }

        // Method to display the title of the series and the titles of all books within it
        public void Display()
        {
            Console.WriteLine("Book Series Title: " + this.title);
            foreach (Book book in books)
            {
                book.Display(); // Recursively display each book in the series
            }
        }
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            // Create individual books
            Book book1 = new SimpleBook("The Hobbit");
            Book book2 = new SimpleBook("The Fellowship of the Ring");
            Book book3 = new SimpleBook("The Two Towers");
            Book book4 = new SimpleBook("The Return of the King");

            // Create The Lord of the Rings series and add books to it
            BookSeries lotrSeries = new BookSeries("The Lord of the Rings Series");
            lotrSeries.AddBook(book2);
            lotrSeries.AddBook(book3);
            lotrSeries.AddBook(book4);

            // Create a book series containing The Lord of the Rings series and another individual book
            BookSeries middleEarthSeries = new BookSeries("Middle-Earth Series");
            middleEarthSeries.AddBook(book1);
            middleEarthSeries.AddBook(lotrSeries);

            // Create a nested series for testing
            BookSeries ultimateSeries = new BookSeries("Ultimate Fantasy Series");
            ultimateSeries.AddBook(middleEarthSeries);

            // Display individual book
            Console.WriteLine("Displaying an individual book:");
            book1.Display();

            // Display book series
            Console.WriteLine("\nDisplaying The Lord of the Rings series:");
            lotrSeries.Display();

            // Display nested book series
            Console.WriteLine("\nDisplaying Middle-Earth series:");
            middleEarthSeries.Display();

            // Display ultimate series
            Console.WriteLine("\nDisplaying Ultimate Fantasy series:");
            ultimateSeries.Display();
        }
    }
}
