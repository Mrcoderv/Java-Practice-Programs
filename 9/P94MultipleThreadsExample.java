class MyThread extends Thread {
    private int threadNumber;

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + threadNumber + ": " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class P94MultipleThreadsExample  {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            MyThread thread = new MyThread(i);
            thread.start(); // Start each thread
        }
    }
}