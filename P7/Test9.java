package P7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {

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

//        List<Integer> courses = students.stream().
//                mapToInt(el -> el.getCourse()).
//                boxed().
//                collect(Collectors.toList());
//        System.out.println(courses);

//        int sum = students.stream().mapToInt(el -> el.getCourse()).sum();
//        System.out.println(sum);
//
//        double average = students.stream().mapToInt(el ->
//                el.getCourse()).average().getAsDouble();
//        System.out.println(average);
//
//        int min = students.stream().mapToInt(el ->
//                el.getCourse()).min().getAsInt();
//        System.out.println(min);
//
//        int max = students.stream().mapToInt(el ->
//                el.getCourse()).max().getAsInt();
//        System.out.println(max);

//        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(min);
//
//        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(max);

//        students.stream().filter(e -> e.getAge() > 20).forEach(System.out::println);
//        System.out.println("--------------------");
//        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);
//        System.out.println("--------------------");
//        students.stream().filter(e -> e.getAge() > 20).skip(2).forEach(System.out::println);
    }

}
