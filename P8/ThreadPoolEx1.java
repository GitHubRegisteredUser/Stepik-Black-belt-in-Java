package P8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {

    public static void main(String[] args) throws InterruptedException {
//        ExecutorService eS = new ThreadPoolExecutor();
//        ExecutorService eS = Executors.newSingleThreadExecutor();
        ExecutorService eS = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            eS.execute(new RunImpl100());
        }
        eS.shutdown();
        eS.awaitTermination(3, TimeUnit.SECONDS);
        System.out.println("Main ends");
    }

}

class RunImpl100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}