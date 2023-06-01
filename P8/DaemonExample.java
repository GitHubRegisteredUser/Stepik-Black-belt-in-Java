package P8;

public class DaemonExample {

    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread uT = new UserThread();
        uT.setName("user_thread");
        DaemonThread dT = new DaemonThread();
        dT.setName("daemon_thread");
        dT.setDaemon(true);
        uT.start();
        dT.start();
        System.out.println("Main thread ends");
    }

}

class UserThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is Daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class DaemonThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is Daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}