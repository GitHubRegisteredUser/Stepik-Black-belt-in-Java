package P8;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> aBQ = new ArrayBlockingQueue<>(4);

        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    aBQ.put(++i);
                    System.out.println("Producer added: " + i + " " +
                            aBQ);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    Integer j = aBQ.take();
                    System.out.println("Producer took: " + j + " " +
                            aBQ);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
