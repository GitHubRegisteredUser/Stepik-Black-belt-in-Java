package P8;

public class Ex2 extends Thread {

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Ex2 thread1 = new Ex2();
        thread1.start();

        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }

//        MyThread1 mT1 = new MyThread1();
//        MyThread2 mT2 = new MyThread2();
//        mT1.start();
//        mT2.start();
    }

}

//class MyThread1 extends Thread {
//
//    public void run() {
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//    }
//
//}

//class MyThread2 extends Thread {
//
//    public void run() {
//        for (int i = 1000; i >= 1; i--) {
//            System.out.println(i);
//        }
//    }
//
//}