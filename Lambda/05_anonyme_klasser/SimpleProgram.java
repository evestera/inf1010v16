public class SimpleProgram {
    public static void main(String[] args) {
        String message = "Hello";

        Runnable printer = new Runnable() {
            @Override
            public void run() {
                System.out.println(message);
            }
        };

        //message = "Tada!"; <--- Fortsatt ikke lov
        printer.run();
    }
}
