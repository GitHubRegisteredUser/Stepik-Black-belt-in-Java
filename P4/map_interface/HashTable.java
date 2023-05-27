package P4.map_interface;

import java.util.Hashtable;

public class HashTable {

    public static void main(String[] args) {
        Hashtable<Double, Student> hT = new Hashtable<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Petr", "Sidorov", 2);
        Student st3 = new Student("Mariya", "Ivanova", 4);
        Student st4 = new Student("Sergey", "Petrov", 2);

        hT.put(7.2, st2);
        hT.put(6.0, st4);
        hT.put(7.4, st1);
//        hT.put(null, st3);
//        hT.put(8.0, null);
        System.out.println(hT);
    }

}
