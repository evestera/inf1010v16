import java.util.*;
import java.util.function.*;
import java.io.*;

class Oppgave4 {
    public static void main(String[] args) {
        try (PrintWriter file = new PrintWriter("out.txt")) {
            // Skriv ut tallene fra 10 til 20 til terminal

            // Skriv ut tallene fra 200 til 220 til fil

            // Legg tallene fra 40 til 50 inn i lista:
            List<Integer> numbers = new LinkedList<>();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void range(int start, int stop, Consumer<? super Integer> consumer) {
        for (int i = start; i < stop; i++) {
            consumer.accept(i);
        }
    }
}
