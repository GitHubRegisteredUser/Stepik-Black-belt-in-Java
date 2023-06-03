package P8;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {

    static CountDownLatch cDL = new CountDownLatch(3);

    private static void marketStaffIsReady() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Персонал на месте");
        cDL.countDown();
        System.out.println("countDownLatch = " + cDL.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Всё готово, пора открывать рынок");
        cDL.countDown();
        System.out.println("countDownLatch = " + cDL.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Рынок открылся");
        cDL.countDown();
        System.out.println("countDownLatch = " + cDL.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Zaur", cDL);
        new Friend("Elena", cDL);
        new Friend("Viktor", cDL);
        new Friend("Petr", cDL);
        new Friend("Mariya", cDL);

        marketStaffIsReady();
        everythingIsReady();
        openMarket();
    }

}

class Friend extends Thread {

    String name;
    private CountDownLatch cDL;

    public Friend(String name, CountDownLatch cDL) {
        this.name = name;
        this.cDL = cDL;
        this.start();
    }

    public void run() {
        try {
            cDL.await();
            System.out.println(name + " приступил(а) к закупкам");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}