package P8;

public class Ex12 {

    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    void whatsappCall() {
        synchronized (lock) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsApp call ends");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunImplMobile());
        Thread thread2 = new Thread(new RunImplWA());
        Thread thread3 = new Thread(new RunImplSkype());

        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class RunImplMobile implements Runnable {

    public void run() {
        new Ex12().mobileCall();
    }

}

class RunImplWA implements Runnable {

    public void run() {
        new Ex12().whatsappCall();
    }

}

class RunImplSkype implements Runnable {

    public void run() {
        new Ex12().skypeCall();
    }

}