import java.util.Comparator;

public class PersonComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person a = (Person) o1;
        Person b = (Person) o2;
        return a.getAge()-b.getAge();
    }
}

