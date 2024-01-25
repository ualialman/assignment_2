import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));
        people.add(new Student("Ringo", "Starr", 2.5));
        people.add(new Student("Paul", "McCartney", 3.0));
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> iterable) {
        for (Person person : iterable) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}