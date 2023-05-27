package P4.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Zaur"); //add
        queue.offer("Oleg");
        queue.offer("Ivan");
        queue.offer("Mariya");
        queue.offer("Anna");
        System.out.println(queue);

        System.out.println(queue.peek()); //element
        System.out.println(queue.poll()); //remove
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
    }

}
