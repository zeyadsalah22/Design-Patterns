public class Strategy_pattern {

    // Strategy interface
    public interface SortingStrategy {
        int[] sort(int[] arr);
    }

    // Context class that uses a SortingStrategy
    public class Context {
        private SortingStrategy sorting;
        private int[] arr;

        public Context(SortingStrategy sorting, int[] arr) {
            this.sorting = sorting;
            this.arr = arr;
        }

        // Set a different sorting strategy
        public void setSorting(SortingStrategy sorting) {
            this.sorting = sorting;
        }

        // Set a different array to be sorted
        public void setArr(int[] arr) {
            this.arr = arr;
        }

        // Perform the sort using the current strategy
        public void sortArr() {
            this.arr = sorting.sort(this.arr);
        }

        // Get the sorted array
        public int[] getArr() {
            return this.arr;
        }
    }

    // Concrete strategy: BubbleSort
    public class BubbleSort implements SortingStrategy {
        @Override
        public int[] sort(int[] arr) {
            System.out.println("Sorting using Bubble sort");
            return arr; // Dummy implementation
        }
    }

    // Concrete strategy: InsertionSort
    public class InsertionSort implements SortingStrategy {
        @Override
        public int[] sort(int[] arr) {
            System.out.println("Sorting using Insertion sort");
            return arr; // Dummy implementation
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        Strategy_pattern sp = new Strategy_pattern();

        int[] arr = {5, 2, 9, 1, 5, 6};

        // Test Bubble Sort
        Context context = sp.new Context(sp.new BubbleSort(), arr);
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        context.sortArr();
        System.out.println("Sorted array using Bubble Sort: " + java.util.Arrays.toString(context.getArr()));

        // Test Insertion Sort
        context.setSorting(sp.new InsertionSort());
        context.setArr(arr); // reset array to original
        context.sortArr();
        System.out.println("Sorted array using Insertion Sort: " + java.util.Arrays.toString(context.getArr()));
    }
}
