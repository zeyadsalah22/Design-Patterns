import java.util.HashMap;
import java.util.Map;

public class Proxy_pattern {

    // Class to represent user accounts
    public class Account {
        private String name;
        private String password;
        private int age;

        public Account(String name, String password, int age) {
            this.name = name;
            this.password = password;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    // Interface to define account retrieval
    public interface AccountRetriever {
        void getAccount(Account account);
    }

    // Class to retrieve real account details
    public class RealAccountRetriever implements AccountRetriever {
        @Override
        public void getAccount(Account account) {
            System.out.println("Name: " + account.getName() + " Password: " + account.getPassword() + " has age: " + account.getAge());
        }
    }

    // Class to handle permission checks and delegate to the next proxy if authorized
    public class PermissionProxyAccountRetriever implements AccountRetriever {
        private static Map<String, Account> authorizedPeople = new HashMap<>();
        private AccountRetriever nextProxy = new CacheProxyAccountRetriever();

        public void authorizePerson(Account account) {
            authorizedPeople.put(account.getName(), account);
        }

        @Override
        public void getAccount(Account account) {
            if (authorizedPeople.get(account.getName()) != null) {
                System.out.println("This account is authorized");
                nextProxy.getAccount(account);
            } else {
                System.out.println("This account is not authorized");
            }
        }
    }

    // Class to handle caching and delegate to the real account retriever if not in cache
    public class CacheProxyAccountRetriever implements AccountRetriever {
        private static Map<String, Account> cache = new HashMap<>();
        private AccountRetriever nextProxy = new RealAccountRetriever();

        @Override
        public void getAccount(Account account) {
            if (cache.get(account.getName()) == null) {
                System.out.println("Account not in cache");
                cache.put(account.getName(), account);
            }
            nextProxy.getAccount(cache.get(account.getName()));
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Proxy_pattern pattern = new Proxy_pattern();

        // Create accounts
        Account accountJohn = pattern.new Account("John", "john123", 30);
        Account accountJane = pattern.new Account("Jane", "jane456", 25);

        // Create proxies
        PermissionProxyAccountRetriever permissionProxy = pattern.new PermissionProxyAccountRetriever();
        CacheProxyAccountRetriever cacheProxy = pattern.new CacheProxyAccountRetriever();

        // Authorize an account
        permissionProxy.authorizePerson(accountJohn);

        // Attempt to retrieve accounts
        System.out.println("Attempting to retrieve John's account:");
        permissionProxy.getAccount(accountJohn);

        System.out.println("\nAttempting to retrieve John's account again:");
        permissionProxy.getAccount(accountJohn);

        System.out.println("\nAttempting to retrieve Jane's account:");
        permissionProxy.getAccount(accountJane);
    }
}
