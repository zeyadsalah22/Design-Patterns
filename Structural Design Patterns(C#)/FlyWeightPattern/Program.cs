using System.Collections;
using System.Collections.Generic;
using System.Data.Common;
using System.Xml;

namespace FlyWeightPattern
{
    // Context class: Person
    public class Person
    {
        private string name;
        private int age;
        private Nationality nationality;

        public Person(string name, int age, Nationality nationality)
        {
            this.Name = name;
            this.Age = age;
            this.Nationality = nationality;
        }

        public string Name { get => name; set => name = value; }
        public int Age { get => age; set => age = value; }
        public Nationality Nationality { get => nationality; set => nationality = value; }

        public void displayInfo()
        {
            Console.WriteLine("Name: " + Name + ", Age: " + Age + ", Nationality: " + Nationality._Nationality + ", Country: " + Nationality.Country + ", City: " + Nationality.City);

        }

    }

    // Flyweight class: Nationality
    public class Nationality
    {
        private string _nationality;
        private string country;
        private string city;

        public Nationality(string nationality, string country, string city)
        {
            this._Nationality = nationality;
            this.Country = country;
            this.City = city;
        }

        public string _Nationality { get => _nationality; set => _nationality = value; }
        public string Country { get => country; set => country = value; }
        public string City { get => city; set => city = value; }

    }

    // Flyweight Factory class: NationalityFactory
    public class NationalityFactory {
        private static Dictionary<string,Nationality> nationalities = new Dictionary<string, Nationality>();

        public static Nationality GetNationality(string nationality,string country,string city)
        {
            if(!nationalities.ContainsKey(nationality))
                nationalities.Add(nationality, new Nationality(nationality, country, city));
            return nationalities[nationality];
        }
        public static Dictionary<string, Nationality> Nationalities { get => nationalities; set => nationalities = value; }
    }

    // Main method for testing the Flyweight pattern
    internal class Program
    {
        static void Main(string[] args)
        {
            Nationality american = NationalityFactory.GetNationality("American", "USA", "New York");
            Nationality british = NationalityFactory.GetNationality("British", "UK", "London");
            Nationality indian = NationalityFactory.GetNationality("Indian", "India", "Delhi");

            Person person1 = new Person("John", 30, american);
            Person person2 = new Person("Alice", 25, british);
            Person person3 = new Person("Raj", 40, indian);
            Person person4 = new Person("Emily", 35, american);

            person1.displayInfo();
            person2.displayInfo();
            person3.displayInfo();
            person4.displayInfo();
        }
    }
}
