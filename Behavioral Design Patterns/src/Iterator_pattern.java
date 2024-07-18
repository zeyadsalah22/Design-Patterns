public class Iterator_pattern {

    // Iterator interface
    public interface Iterator {
        void iterate();
    }

    // Iterable collection interface
    public interface IteratorsCollection {
        Iterator createDFS();
        Iterator createBFS();
    }

    // Concrete Iterator: DFSIterator
    public class DFSIterator implements Iterator {
        @Override
        public void iterate() {
            System.out.println("Iterating the collection using DFS");
            // Implementation of DFS traversal (out of scope)
        }
    }

    // Concrete Iterator: BFSIterator
    public class BFSIterator implements Iterator {
        @Override
        public void iterate() {
            System.out.println("Iterating the collection using BFS");
            // Implementation of BFS traversal (out of scope)
        }
    }

    // Concrete Iterable Collection: GraphIteratorCollection
    public class GraphIteratorCollection implements IteratorsCollection {
        @Override
        public Iterator createDFS() {
            return new DFSIterator();
        }

        @Override
        public Iterator createBFS() {
            return new BFSIterator();
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        Iterator_pattern ip = new Iterator_pattern();

        // Create a collection of iterators (GraphIteratorCollection)
        IteratorsCollection collection = ip.new GraphIteratorCollection();

        // Create a DFS iterator and iterate through the collection
        Iterator dfsIterator = collection.createDFS();
        System.out.println("Using DFS iterator:");
        dfsIterator.iterate();

        // Create a BFS iterator and iterate through the collection
        Iterator bfsIterator = collection.createBFS();
        System.out.println("Using BFS iterator:");
        bfsIterator.iterate();
    }
}
