package P8;

public class Ex10 {

    public static void main(String[] args) {
        MyRI runnable = new MyRI();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Counter {
    volatile static int count = 0;
}

class MyRI implements Runnable {

    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }

}
