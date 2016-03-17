import java.util.*;

class ComparatorExample {
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

        persons.sort(
            Comparator
                .comparing(Person::getName)
                .thenComparingInt(Person::getAge));

        persons.forEach(System.out::println);
    }
}
