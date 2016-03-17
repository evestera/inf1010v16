import java.io.*;

class TryWithResources {
    public static void main(String[] args) throws FileNotFoundException {
        regularTry();
        regularTryForMoreComplicatedStuff();
        tryWithResources();
        tryWithResourcesNoCatch();
    }

    static void regularTry() {
        try {
            PrintWriter writer = new PrintWriter("out.txt");
            writer.println("Hello");
            writer.println("World!");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void regularTryForMoreComplicatedStuff() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("out.txt");
            writer.println("Hello");
            writer.println("World!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    static void tryWithResources() {
        try (PrintWriter writer = new PrintWriter("out.txt")) {
            writer.println("Hello");
            writer.println("World!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void tryWithResourcesNoCatch() throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter("out.txt")) {
            writer.println("Hello");
            writer.println("World!");
        }
    }
}
