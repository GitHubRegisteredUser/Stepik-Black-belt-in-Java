package P8;

public class Ex3 implements Runnable {

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ex3());
        thread1.start();

        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }

//        Thread thr1 = new Thread((new MyThread3()));
//        Thread thr2 = new Thread((new MyThread4()));
//        thr1.start();
//        thr2.start();
    }

}

//class MyThread3 implements Runnable {
//
//    public void run() {
//        for (int i = 1; i <= 1000; i++) {
//            System.out.println(i);
//        }
//    }
//
//}

//class MyThread4 implements Runnable {
//
//    public void run() {
//        for (int i = 1000; i >= 1; i--) {
//            System.out.println(i);
//        }
//    }
//
//}