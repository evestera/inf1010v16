class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new Thread(ThreadExample::doWork);
        thread.start();
    }

    public static void doWork() {
        System.out.println("Work");
        System.out.println("Workwork");
    }
}
