public class SimpleProgram {
    public static void main(String[] args) {
        String message = "Hello";

        class HelloPrinter implements Runnable {
            @Override
            public void run() {
                System.out.println(message);
            }
        }
        HelloPrinter printer = new HelloPrinter();

        // message = "Tada!"; <--- Ikke lov
        printer.run();
    }
}
