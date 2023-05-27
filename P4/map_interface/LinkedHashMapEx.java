package P4.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lHM =
                new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Petr", "Sidorov", 2);
        Student st3 = new Student("Mariya", "Ivanova", 4);
        Student st4 = new Student("Sergey", "Petrov", 2);

        lHM.put(7.2, st2);
        lHM.put(6.0, st4);
        lHM.put(7.4, st1);
        lHM.put(6.1, st3);

        System.out.println(lHM);
        System.out.println(lHM.get(6.0));
        System.out.println(lHM.get(6.1));
        System.out.println(lHM.get(7.2));
        System.out.println(lHM.get(7.4));
        System.out.println(lHM);
    }

}
