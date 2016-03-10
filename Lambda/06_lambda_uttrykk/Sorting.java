import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Althalus");
        names.add("Zaphod");
        names.add("Kari");
        names.add("Knut");

        names.sort((String a, String b) -> {
            return b.compareTo(a);
        });
        // eller:
        names.sort((a, b) -> b.compareTo(a));

        System.out.println(names);
        //[Zaphod, Knut, Kari, Althalus]
    }
}
