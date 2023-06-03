package P8;

import java.util.concurrent.*;

public class RunnableFactorial {

    static int fResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService eS = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(6);
//        eS.execute(factorial);
        Future future = eS.submit(factorial);
        eS.shutdown();
        eS.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(future.get());
        System.out.println(future.isDone());
        System.out.println(fResult);
    }

}

class Factorial implements Runnable {

    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Вы ввели неверное число");
            return;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        RunnableFactorial.fResult = result;
    }

}