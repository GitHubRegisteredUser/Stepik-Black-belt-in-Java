package P8;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {

    public static void main(String[] args) {
        Semaphore phoneBox = new Semaphore(2);

        new Person("Zaur", phoneBox);
        new Person("Elena", phoneBox);
        new Person("Viktor", phoneBox);
        new Person("Petr", phoneBox);
        new Person("Mariya", phoneBox);
    }

}

class Person extends Thread {

    String name;
    private Semaphore phoneBox;

    public Person(String name, Semaphore phoneBox) {
        this.name = name;
        this.phoneBox = phoneBox;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " ждёт...");
            phoneBox.acquire();
            System.out.println(name + " пользуется телефоном");
            sleep(2000);
            System.out.println(name + " завершил(а) звонок");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            phoneBox.release();
        }
    }

}