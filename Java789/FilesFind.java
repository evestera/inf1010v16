import java.util.stream.*;
import java.nio.file.*;

class FilesFind {
    public static void main(String[] args) throws Exception {
        Stream<Path> files = Files.find(
                Paths.get(".."),
                5,
                (path, attr) -> path.toString().endsWith(".java"));

        long count = files
                .flatMap(path -> {
                    try {
                        return Files.lines(path);
                    } catch (Exception ignored) {
                        return Stream.empty();
                    }
                })
                .filter(s -> !s.isEmpty())
                .count();

        System.out.println(count);
    }
}
