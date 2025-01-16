public class P95ThreadPriority {
    public static void main(String[] args) throws InterruptedException {
        Thread highPriorityThread = new Thread(() -> 
            System.out.println("High Priority Thread is running")
        );
        Thread lowPriorityThread = new Thread(() -> 
            System.out.println("Low Priority Thread is running")
        );
        Thread defaultPriorityThread = new Thread(() -> 
            System.out.println("Default Priority Thread is running")
        );

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        // Start threads
        highPriorityThread.start();
        highPriorityThread.join(); // Wait for high-priority thread to finish

        lowPriorityThread.start();
        lowPriorityThread.join(); // Wait for low-priority thread to finish

        defaultPriorityThread.start();
        defaultPriorityThread.join(); // Wait for default-priority thread to finish
    }
}
