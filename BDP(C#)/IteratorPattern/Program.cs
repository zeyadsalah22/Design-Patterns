using IteratorPattern;
using System;

namespace IteratorPattern
{
    public interface Iterator
    {
        public void iterate();
    }

    // Iterable collection interface
    public interface IteratorsCollection
    {
        Iterator createDFS();
        Iterator createBFS();
    }

    // Concrete Iterator: DFSIterator
    public class DFSIterator : Iterator
    {
        public void iterate()
        {
            Console.WriteLine("Iterating the collection using DFS");
            // Implementation of DFS traversal (out of scope)
        }
    }


    // Concrete Iterator: BFSIterator
    public class BFSIterator : Iterator
    {
        public void iterate()
        {
            Console.WriteLine("Iterating the collection using BFS");
            // Implementation of BFS traversal (out of scope)
        }
    }

    // Concrete Iterable Collection: GraphIteratorCollection
    public class GraphIteratorCollection : IteratorsCollection
    {
        public Iterator createDFS()
        {
            return new DFSIterator();
        }

        public Iterator createBFS()
        {
            return new BFSIterator();
        }
    }

    // Main function for testing
    internal class Program
    {
        static void Main(string[] args)
        {
            // Create a collection of iterators (GraphIteratorCollection)
            IteratorsCollection collection = new GraphIteratorCollection();

            // Create a DFS iterator and iterate through the collection
            Iterator dfsIterator = collection.createDFS();
            Console.WriteLine("Using DFS iterator:");
            dfsIterator.iterate();

            // Create a BFS iterator and iterate through the collection
            Iterator bfsIterator = collection.createBFS();
            Console.WriteLine("Using BFS iterator:");
            bfsIterator.iterate();
        }
    }
}
