package P4;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        ArrayList<String> aL1 = new ArrayList<>();
        aL1.add("Zaur");
        aL1.add("Ivan");
        aL1.add("Mariya");
        aL1.add("Nikolay");
        aL1.add("Elena");

        Iterator<String> iterator = aL1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

}
