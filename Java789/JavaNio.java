import java.nio.file.*;
import java.util.*;

class JavaNio {
    public static void main(String[] args) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get("JavaNio.java"));
        // do something
        Files.write(Paths.get("out.txt"), lines);
    }
}
