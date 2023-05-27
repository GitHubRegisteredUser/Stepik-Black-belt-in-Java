package P4.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        pQ.add(4);
        pQ.add(1);
        pQ.add(7);
        pQ.add(10);
        pQ.add(8);
        System.out.println(pQ);

        System.out.println(pQ.remove());
        System.out.println(pQ.remove());
        System.out.println(pQ.remove());
        System.out.println(pQ.remove());
        System.out.println(pQ.remove());
    }

}
