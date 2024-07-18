import java.util.ArrayList;
import java.util.List;

public class Observer_pattern {

    // Observer Interface
    public interface Observer {
        void update(double grade);
    }

    // Subject Interface
    public interface Subject {
        void addObserver(Observer observer);
        void removeObserver(Observer observer);
        void notifyObservers();
    }

    // Concrete Subject
    public class Classroom implements Subject {
        private List<Observer> observers = new ArrayList<>();
        private double grade;

        @Override
        public void addObserver(Observer observer) {
            this.observers.add(observer);
        }

        @Override
        public void removeObserver(Observer observer) {
            this.observers.remove(observer);
        }

        @Override
        public void notifyObservers() {
            for (Observer observer : this.observers) {
                observer.update(this.grade);
            }
        }

        public void setGrade(double grade) {
            this.grade = grade;
            notifyObservers();
        }
    }

    // Concrete Observer 1
    public class SendEmail implements Observer {
        private double grade;

        @Override
        public void update(double grade) {
            this.grade = grade;
            System.out.println("Email: Grade updated: " + this.grade);
        }
    }

    // Concrete Observer 2
    public class PhoneNotification implements Observer {
        private double grade;

        @Override
        public void update(double grade) {
            this.grade = grade;
            System.out.println("Phone Notification: Grade updated: " + this.grade);
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        Observer_pattern observerPattern = new Observer_pattern();

        Classroom classroom = observerPattern.new Classroom();
        SendEmail emailObserver = observerPattern.new SendEmail();
        PhoneNotification phoneObserver = observerPattern.new PhoneNotification();

        classroom.addObserver(emailObserver);
        classroom.addObserver(phoneObserver);

        System.out.println("Setting grade to 95.5");
        classroom.setGrade(95.5);

        System.out.println("Setting grade to 89.0");
        classroom.setGrade(89.0);
    }
}
