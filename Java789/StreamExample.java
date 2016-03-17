import java.util.*;

class StreamExample {
    public static void main(String[] args) {
        List<Person> persons = new LinkedList<>();
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

        long nameCount = persons.stream()
                .map(Person::getName)
                .distinct()
                .count();

        System.out.println("There are " + nameCount + " different names");

        int totalAge = persons.stream()
                .mapToInt(Person::getAge)
                .sum();

        System.out.println("The total age is " + totalAge);

        System.out.println("The following persons are of age:");
        persons.stream()
                .filter(p -> p.getAge() >= 18)
                .forEach(p -> {
                    System.out.println("- " + p.getName());
                });
    }
}
