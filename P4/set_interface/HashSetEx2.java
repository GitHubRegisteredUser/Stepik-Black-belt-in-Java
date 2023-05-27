package P4.set_interface;

import java.util.HashSet;

public class HashSetEx2 {

    public static void main(String[] args) {
        HashSet<Integer> hS1 = new HashSet<>();
        hS1.add(5);
        hS1.add(2);
        hS1.add(3);
        hS1.add(1);
        hS1.add(8);

        HashSet<Integer> hS2 = new HashSet<>();
        hS2.add(7);
        hS2.add(4);
        hS2.add(3);
        hS2.add(5);
        hS2.add(8);

        HashSet<Integer> union = new HashSet<>(hS1);
        union.addAll(hS2);
        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(hS1);
        intersect.retainAll(hS2);
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(hS1);
        subtract.removeAll(hS2);
        System.out.println(subtract);
    }

}
