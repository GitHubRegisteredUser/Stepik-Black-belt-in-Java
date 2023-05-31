package P7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 2, 6.5);
        Student st2 = new Student("Petr", 'm', 24, 3, 8.4);
        Student st3 = new Student("Mariya", 'f', 25, 3, 7.9);
        Student st4 = new Student("Vasiliy", 'm', 28, 4, 7.5);
        Student st5 = new Student("Anna", 'f', 20, 1, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Map<Integer, List<Student>> map = students.stream().map(el ->
//                {
//                    el.setName(el.getName().toUpperCase());
//                    return el;
//                }).
//                collect(Collectors.groupingBy(el -> el.getCourse()));
//
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue().toString());

        Map<Boolean, List<Student>> map = students.stream().
                collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 8));

        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }

}
