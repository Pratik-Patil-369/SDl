package numberPrinter;

public class NumberPrinter implements Runnable {

    public void run() {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        
        NumberPrinter numberPrinter = new NumberPrinter();

        Thread thread = new Thread(numberPrinter);

        thread.start();
    }
}