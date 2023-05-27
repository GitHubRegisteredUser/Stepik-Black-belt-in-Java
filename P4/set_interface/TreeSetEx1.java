package P4.set_interface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {

    public static void main(String[] args) {
        Set<Integer> tS = new TreeSet<>();
        tS.add(5);
        tS.add(8);
        tS.add(2);
        tS.add(1);
        tS.add(10);
//        tS.add(null);
        tS.remove(2);
        System.out.println(tS);
        System.out.println(tS.contains(2));
    }

}
