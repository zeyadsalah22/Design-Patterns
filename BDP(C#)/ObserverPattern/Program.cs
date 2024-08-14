using System.Runtime.CompilerServices;

namespace ObserverPattern
{

    // Observer Interface
    public interface Observer
    {
        public void Update(double grade);
    }

    // Subject Interface
    public interface Subject
    {
        public void AddObserver(Observer observer);
        public void RemoveObserver(Observer observer);
        public void NotifyObservers();
    }

    // Concrete Subject
    public class Classroom : Subject
    {
        private List<Observer> observers = new List<Observer>();
        private double grade;

        public void SetGrade(double grade)
        {
            this.grade = grade;
            NotifyObservers();
        }

        public void AddObserver(Observer observer)
        {
            observers.Add(observer);
        }
        public void RemoveObserver(Observer observer)
        {
            observers.Remove(observer);
        }
        public void NotifyObservers() {
            foreach (Observer observer in observers)
            {
                observer.Update(this.grade);
            }
        }
    }

    // Concrete Observer 1
    public class SendEmail: Observer
    {
        private double grade;
        public void Update(double grade)
        {
            this.grade = grade;
            this.Display();
        }
        public void Display()
        {
            Console.WriteLine("Sending email to student with grade: " + grade);
        }
    }

    // Concrete Observer 2
    public class PhoneNotification: Observer
    {
        private double grade;
        public void Update(double grade)
        {
            this.grade = grade;
            this.Display();
        }
        public void Display()
        {
            Console.WriteLine("Notifying grade on phone: " + grade);
        }
    }
    internal class Program
    {

        // Main function for testing
        static void Main(string[] args)
        {
            Classroom classroom = new Classroom();
            SendEmail emailObserver = new SendEmail();
            PhoneNotification phoneObserver = new PhoneNotification();

            classroom.AddObserver(emailObserver);
            classroom.AddObserver(phoneObserver);

            Console.WriteLine("Setting grade to 95.5");
            classroom.SetGrade(95.5);

            Console.WriteLine("Setting grade to 89.0");
            classroom.SetGrade(89.0);
        }
    }
}
