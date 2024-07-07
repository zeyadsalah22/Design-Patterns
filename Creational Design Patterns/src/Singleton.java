public class Singleton {

    // The volatile keyword ensures that multiple threads handle the instance variable correctly
    private static volatile Singleton instance;
    private String data;

    // Private constructor prevents instantiation from other classes
    private Singleton(String data) {
        this.data = data;
    }

    // Public method to provide access to the singleton instance
    public static Singleton getInstance(String data) {
        // Local variable to increase performance by avoiding multiple reads of the volatile instance variable
        Singleton localInstance = instance;

        // First check if instance is null, this improves performance by avoiding synchronization overhead
        if (localInstance == null) {
            // Synchronize only the first time to ensure only one instance is created
            synchronized (Singleton.class) {
                // Second check to ensure instance is still null after the thread acquires the lock
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton(data);
                }
            }
        }
        return localInstance;
    }

    // Method to get the data
    public String getData() {
        return data;
    }

    // Method to set the data
    public void setData(String data) {
        this.data = data;
    }

    public static void main(String[] args) {
        // Create the first instance
        Singleton firstInstance = Singleton.getInstance("First Instance");
        System.out.println(firstInstance.getData()); // Output: First Instance

        // Try to create a second instance with different data
        Singleton secondInstance = Singleton.getInstance("Second Instance");
        System.out.println(secondInstance.getData()); // Output: First Instance

        // Verify both references point to the same instance
        System.out.println(firstInstance == secondInstance); // Output: true
    }
}
