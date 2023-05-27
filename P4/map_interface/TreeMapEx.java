package P4.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx {

    public static void main(String[] args) {
        TreeMap<Double, Student> tM = new TreeMap<>();
        TreeMap<Student, Double> tM2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return 0;
            }
        });

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Petr", "Sidorov", 2);
        Student st3 = new Student("Mariya", "Ivanova", 4);
        Student st4 = new Student("Sergey", "Petrov", 2);
        Student st5 = new Student("Ivan", "Sokolov", 1);
        Student st6 = new Student("Alexander", "Smirnov", 1);
        Student st7 = new Student("Elena", "Novikova", 3);
        tM.put(6.0, st6);
        tM.put(6.1, st4);
        tM.put(7.2, st3);
        tM.put(7.4, st7);
        tM.put(8.3, st5);
        tM.put(8.5, st2);
        tM.put(9.0, st1);
        System.out.println(tM);

//        System.out.println(treeMap.get(8.5));
//        treeMap.remove(9.0);
//        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());

//        System.out.println(treeMap.tailMap(7.4));
//        System.out.println(treeMap.headMap(7.4));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());
    }

}
