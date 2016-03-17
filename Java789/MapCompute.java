import java.util.*;

public class MapCompute {
    public static void main(String[] args) {
        List<Person> persons = new LinkedList<Person>();
        persons.add(new Person("Bob", 19));
        persons.add(new Person("Bob", 65));
        persons.add(new Person("Arne", 32));
        persons.add(new Person("Arne", 10));
        persons.add(new Person("Arne", 40));
        persons.add(new Person("Kari", 27));
        persons.add(new Person("Gunvor", 90));
        persons.add(new Person("Kjell", 90));
        persons.add(new Person("Bob", 5));
        persons.add(new Person("Bob", 15));

        Map<String,Integer> nameCount = new HashMap<>();
        for (Person p : persons) {
            nameCount.compute(p.getName(), (k, v) -> {
                if (v == null) return 1;
                return v + 1;
            });
        }

        nameCount.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
