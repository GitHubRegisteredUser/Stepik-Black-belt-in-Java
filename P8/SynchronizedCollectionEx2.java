package P8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionEx2 {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> aL = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            aL.add(i);
        }
        List<Integer> sL = Collections.synchronizedList(aL);
        Runnable runnable1 = () -> {
            synchronized (sL) {
                Iterator<Integer> iterator = sL.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable2 = () ->
                sL.remove(10);
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(sL);
    }

}
