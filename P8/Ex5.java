package P8;

public class Ex5 {

    public static void main(String[] args) {
        MyThread5 mT5 = new MyThread5();
        mT5.setName("My thread");
        mT5.setPriority(10);
        System.out.println("Name of mT5: " + mT5.getName() +
                "; Priority of mT5: " + mT5.getPriority());

//        MyThread5 mT6 = new MyThread5();
//        System.out.println("Name of mT6: " + mT6.getName() +
//                "; Priority of mT6: " + mT6.getPriority());
    }

}

class MyThread5 extends Thread {

    public void run() {
        System.out.println("Hi");
    }

}
