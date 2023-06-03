package P8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService sES = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            sES.execute(new RunImpl200());
//        }
//        sES.schedule(new RunImpl200(), 3, TimeUnit.SECONDS);

//        sES.scheduleAtFixedRate(new RunImpl200(), 3, 1, TimeUnit.SECONDS);
        sES.scheduleWithFixedDelay(new RunImpl200(), 3, 1, TimeUnit.SECONDS);

        Thread.sleep(15000);
        sES.shutdown();

        ExecutorService eS = Executors.newCachedThreadPool();
    }

}

class RunImpl200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }

}
