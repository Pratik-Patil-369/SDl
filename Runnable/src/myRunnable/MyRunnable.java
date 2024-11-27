package myRunnable;

public class MyRunnable implements Runnable {
    public static void main(String[] args) {
        
        new Thread(new MyRunnable()).start();
        
        System.out.println("Main thread continues execution.");
    }

    public void run() {
       
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
