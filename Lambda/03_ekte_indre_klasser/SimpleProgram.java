public class SimpleProgram {
    private String message = "Hello";

    public static void main(String[] args) {
        SimpleProgram program = new SimpleProgram();
        HelloPrinter printer = program.new HelloPrinter();
        program.message = "Tada!";
        printer.run();
    }

    public class HelloPrinter implements Runnable {
        @Override
        public void run() {
            System.out.println(message);
        }
    }
}
