    class MyRunnable implements Runnable {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class P92RunnableExample {
        public static void main(String[] args) {
            Thread thread = new Thread(new MyRunnable());
            thread.start(); // Start the thread
            try {
                thread.join(); // Wait for the thread to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runnable thread has finished execution.");
        }
    }
