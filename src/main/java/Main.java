import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 63));
        persons.add(new Person("Sanne", 35));
        persons.add(new Person("Anna", 22));
        persons.add(new Person("Victor", 19));

        Comparator personComparator = new PersonComparator();

        Collections.sort(persons, personComparator);
        System.out.println(persons);

        Collections.sort(persons, (x, y) -> y.getName().compareTo(x.getName()));
        System.out.println(persons);
    }
}
