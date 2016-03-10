import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Althalus");
        names.add("Zaphod");
        names.add("Kari");
        names.add("Knut");

        class ReverseComparator implements Comparator<String> {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        }

        names.sort(new ReverseComparator());

        System.out.println(names);
        //[Zaphod, Knut, Kari, Althalus]
    }
}
