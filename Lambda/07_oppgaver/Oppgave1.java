import java.util.*;

class Oppgave1 {
    public static void main(String[] args) {
        List<String> code = new LinkedList<>();
        code.add("Alfa");
        code.add("Bravo");
        code.add("Charlie");
        code.add("Delta");

        // 1a. Konverter denne klassen til en anonym klasse.
        // 1b. Konverter deretter den anonyme klassen til et lambda-uttrykk.
        class FirstLetterRemover implements UnaryOperator<String> {
            @Override
            public String apply(String s) {
                return s.substring(1);
            }
        }
        code.replaceAll(new FirstLetterRemover());

        System.out.println(code);
        // [lfa, ravo, harlie, elta]
    }
}

// Dette grensesnittet finnes også i java.util.function
interface UnaryOperator<T> {
    T apply(T t);
}
