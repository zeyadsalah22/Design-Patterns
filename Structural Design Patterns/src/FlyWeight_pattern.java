import java.util.HashMap;
import java.util.Map;

public class FlyWeight_pattern {

    // Context class: Person
    public class Person {
        private String name;
        private int age;
        private Nationality nationality;

        public Person(String name, int age, Nationality nationality) {
            this.name = name;
            this.age = age;
            this.nationality = nationality;
        }

        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", Nationality: " + nationality.getNationality() + ", Country: " + nationality.getCountry() + ", City: " + nationality.getCity());
        }
    }

    // Flyweight class: Nationality
    public static class Nationality {
        private String nationality;
        private String country;
        private String city;

        public Nationality(String nationality, String country, String city) {
            this.nationality = nationality;
            this.country = country;
            this.city = city;
        }

        public String getNationality() {
            return nationality;
        }

        public String getCountry() {
            return country;
        }

        public String getCity() {
            return city;
        }
    }

    // Flyweight Factory class: NationalityFactory
    public static class NationalityFactory {
        private static Map<String, Nationality> nationalities = new HashMap<>();

        public static Nationality getNationality(String nationality, String country, String city) {
            if (!nationalities.containsKey(nationality)) {
                nationalities.put(nationality, new Nationality(nationality, country, city));
            }
            return nationalities.get(nationality);
        }
    }

    // Main method for testing the Flyweight pattern
    public static void main(String[] args) {
        FlyWeight_pattern flyWeight_pattern = new FlyWeight_pattern();

        Nationality american = NationalityFactory.getNationality("American", "USA", "New York");
        Nationality british = NationalityFactory.getNationality("British", "UK", "London");
        Nationality indian = NationalityFactory.getNationality("Indian", "India", "Delhi");

        Person person1 = flyWeight_pattern.new Person("John", 30, american);
        Person person2 = flyWeight_pattern.new Person("Alice", 25, british);
        Person person3 = flyWeight_pattern.new Person("Raj", 40, indian);
        Person person4 = flyWeight_pattern.new Person("Emily", 35, american);

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
        person4.displayInfo();
    }
}
