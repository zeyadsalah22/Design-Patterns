import java.util.ArrayList;
import java.util.List;

public class Composite_pattern {
    // Component interface: Book
    public interface Book {
        void setTitle(String title);
        String getTitle();
        void display();
    }

    // Leaf class: SimpleBook
    public class SimpleBook implements Book {
        private String title;

        public SimpleBook(String title) {
            this.title = title;
        }

        @Override
        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String getTitle() {
            return this.title;
        }

        @Override
        public void display() {
            System.out.println("Book's title: " + this.title);
        }
    }

    // Composite class: BookSeries
    public class BookSeries implements Book {
        private String title;
        private List<Book> bookList;

        public BookSeries(String title) {
            this.title = title;
            this.bookList = new ArrayList<>();
        }

        @Override
        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String getTitle() {
            return this.title;
        }

        public void addBook(Book book) {
            this.bookList.add(book);
        }

        @Override
        public void display() {
            System.out.println("Book Series: " + this.title);
            for (Book book : bookList) {
                book.display();
            }
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        Composite_pattern cp = new Composite_pattern();

        // Create individual books
        Book book1 = cp.new SimpleBook("The Hobbit");
        Book book2 = cp.new SimpleBook("The Fellowship of the Ring");
        Book book3 = cp.new SimpleBook("The Two Towers");
        Book book4 = cp.new SimpleBook("The Return of the King");

        // Create The Lord of the Rings series and add books to it
        BookSeries lotrSeries = cp.new BookSeries("The Lord of the Rings Series");
        lotrSeries.addBook(book2);
        lotrSeries.addBook(book3);
        lotrSeries.addBook(book4);

        // Create a book series containing The Lord of the Rings series and another individual book
        BookSeries middleEarthSeries = cp.new BookSeries("Middle-Earth Series");
        middleEarthSeries.addBook(book1);
        middleEarthSeries.addBook(lotrSeries);

        // Create a nested series for testing
        BookSeries ultimateSeries = cp.new BookSeries("Ultimate Fantasy Series");
        ultimateSeries.addBook(middleEarthSeries);

        // Display individual book
        System.out.println("Displaying an individual book:");
        book1.display();

        // Display book series
        System.out.println("Displaying The Lord of the Rings series:");
        lotrSeries.display();

        // Display nested book series
        System.out.println("Displaying Middle-Earth series:");
        middleEarthSeries.display();

        // Display ultimate series
        System.out.println("Displaying Ultimate Fantasy series:");
        ultimateSeries.display();
    }
}
