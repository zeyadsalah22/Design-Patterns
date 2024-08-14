namespace ProxyPattern
{
    // Class to represent user accounts
    public class Account
    {
        private string name;
        private string password;
        private int age;

        public Account(string name, string password, int age)
        {
            this.Name = name;
            this.Password = password;
            this.Age = age;
        }

        public string Name { get => name; set => name = value; }
        public string Password { get => password; set => password = value; }
        public int Age { get => age; set => age = value; }
    }

    // Interface to define account retrieval
    public interface AccountRetriever
    {
        public void GetAccount(Account account);
    }

    // Class to retrieve real account details
    public class RealAccountRetriever : AccountRetriever
    {
        public void GetAccount(Account account)
        {
            Console.WriteLine("Retrieving account...");
            Console.WriteLine($"Name: {account.Name} Password: {account.Password} Age: {account.Age}");
        }
    }

    // Class to handle permission checks and delegate to the next proxy if authorized
    public class PermissionProxyAccountRetriever : AccountRetriever
    {
        private Dictionary<string, Account> authorizedPeople = new Dictionary<string, Account>();
        private AccountRetriever nextProxy = new CacheProxyAccountRetriever();

        public void AuthorizePerson(Account account) {
            authorizedPeople.Add(account.Name, account);
        }
        public void GetAccount(Account account)
        {
            if (authorizedPeople.ContainsKey(account.Name))
            {
                Console.WriteLine("Your are authorized");
                nextProxy.GetAccount(account);
            }
            else
            {
                Console.WriteLine("You are not authorized to view this account.");
            }
        }
    }

    // Class to handle caching and delegate to the real account retriever if not in cache
    public class CacheProxyAccountRetriever : AccountRetriever
    {
        private Dictionary<string, Account> cache = new Dictionary<string, Account>();
        private AccountRetriever nextProxy = new RealAccountRetriever();

        public void GetAccount(Account account) {
            if (!cache.ContainsKey(account.Name)) {
                Console.WriteLine("Adding account to cache");
                cache.Add(account.Name, account);
            }
            nextProxy.GetAccount(account);
        }
    }

    internal class Program
    {
        // Main method for testing
        static void Main(string[] args)
        {
            // Create accounts
            Account accountJohn = new Account("John", "john123", 30);
            Account accountJane = new Account("Jane", "jane456", 25);

            // Create proxies
            PermissionProxyAccountRetriever permissionProxy = new PermissionProxyAccountRetriever();
            CacheProxyAccountRetriever cacheProxy = new CacheProxyAccountRetriever();

            // Authorize an account
            permissionProxy.AuthorizePerson(accountJohn);

            // Attempt to retrieve accounts
            Console.WriteLine("Attempting to retrieve John's account:");
            permissionProxy.GetAccount(accountJohn);

            Console.WriteLine("\nAttempting to retrieve John's account again:");
            permissionProxy.GetAccount(accountJohn);

            Console.WriteLine("\nAttempting to retrieve Jane's account:");
            permissionProxy.GetAccount(accountJane);
        }
    }
}
