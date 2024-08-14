namespace StrategyPattern
{

    // Strategy interface
    public interface SortingStrategy
    {
        int[] Sort(int[] array);
    }

    // Context class that uses a SortingStrategy
    public class Context
    {
        private SortingStrategy sortingStrategy;
        private int[] array;

        public Context(SortingStrategy sortingStrategy, int[] array)
        {
            this.SortingStrategy = sortingStrategy;
            this.Array = array;
        }

        public SortingStrategy SortingStrategy { get => sortingStrategy; set => sortingStrategy = value; }
        public int[] Array { get => array; set => array = value; }

        public int[] SortArray()
        {
            return SortingStrategy.Sort(this.Array);
        }
    }

    // Concrete strategy: InsertionSort
    public class InsertionSort : SortingStrategy
    {
        public int[] Sort(int[] arr)
        {
            Console.WriteLine("Sorting using Instertion Sort");
            
            // Dummy Implementation
            return arr;
        }
    }

    // Concrete strategy: BubbleSort
    public class BubbleSort : SortingStrategy
    {
        public int[] Sort(int[] arr)
        {
            Console.WriteLine("Sorting using Bubble Sort");

            // Dummy Implementation
            return arr;
        }
    }
    internal class Program
    {
        // Main function for testing
        static void Main(string[] args)
        {
            int[] arr = { 5, 2, 9, 1, 5, 6 };

            // Test Bubble Sort
            Context context = new Context(new BubbleSort(), arr);
            Console.WriteLine("Original array: " + string.Join(", ", arr));
            context.SortArray();
            Console.WriteLine("Sorted array using Bubble sort: " + string.Join(", ", arr));

            // Test Insertion Sort
            context.SortingStrategy = new InsertionSort();
            context.Array = arr ; // reset array to original
            context.SortArray();
            Console.WriteLine("Sorted array using Insertion sort: " + string.Join(", ", arr));
        }
    }
}
