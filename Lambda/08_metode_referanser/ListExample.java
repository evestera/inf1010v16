import java.util.*;
import java.nio.file.*;

class ListExample {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();

        Files.lines(Paths.get("ListExample.java")).forEach(list::add);
        list.replaceAll(String::trim);
        list.removeIf(String::isEmpty);

        list.forEach(System.out::println);
    }
}
