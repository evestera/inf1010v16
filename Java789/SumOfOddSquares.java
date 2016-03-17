import java.util.*;
import java.io.*;

class SumOfOddSquares {
    public static void main(String[] args) throws Exception {
        ArrayList<String> numbers = new ArrayList<>();

        new Scanner(new File("StreamExample.java"))
                .useDelimiter("\\D+")
                .forEachRemaining(numbers::add);

        int sumOfOddSquares = numbers.stream()
                .mapToInt(Integer::parseInt)
                .filter(x -> x % 2 != 0)
                .map(x -> x * x)
                .sum();

        System.out.println(sumOfOddSquares);
    }
}
