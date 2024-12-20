package producerconsumer;

class SharedBuffer {
    private int data;
    private boolean isDataAvailable = false;

    public synchronized void produce(int value) {
        while (isDataAvailable) { try { wait(); } catch (InterruptedException e) {} }
        data = value;
        isDataAvailable = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() {
        while (!isDataAvailable) { try { wait(); } catch (InterruptedException e) {} }
        System.out.println("Consumed: " + data);
        isDataAvailable = false;
        notify();
    }
}

class Producer implements Runnable {
    private final SharedBuffer buffer;
    private final int limit;
    public Producer(SharedBuffer buffer, int limit) { this.buffer = buffer; this.limit = limit; new Thread(this).start(); }
    public void run() {
        for (int i = 0; i < limit; i++) { buffer.produce(i); try { Thread.sleep(1000); } catch (InterruptedException e) {} }
    }
}

class Consumer implements Runnable {
    private final SharedBuffer buffer;
    public Consumer(SharedBuffer buffer) { this.buffer = buffer; new Thread(this).start(); }
    public void run() {
        while (true) { buffer.consume(); try { Thread.sleep(1500); } catch (InterruptedException e) {} }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        new Producer(buffer, 10);
        new Consumer(buffer);
    }
}
