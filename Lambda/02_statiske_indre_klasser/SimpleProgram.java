public class SimpleProgram {
    public static void main(String[] args) {
        HelloPrinter printer = new HelloPrinter();
        printer.run();
    }

    public static class HelloPrinter implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello");
        }
    }
}
