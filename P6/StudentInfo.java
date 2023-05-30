package P6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }

//    void printStOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }

}

class Test {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 1, 6.5);
        Student st2 = new Student("Petr", 'm', 24, 3, 8.4);
        Student st3 = new Student("Mariya", 'f', 25, 3, 7.9);
        Student st4 = new Student("Vasiliy", 'm', 28, 4, 7.5);
        Student st5 = new Student("Anna", 'f', 20, 1, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });
//        Collections.sort(students, (s1, s2) -> s1.course - s2.course);
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("--------------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 25;
//            }
//        });
//        info.testStudents(students, s -> s.avgGrade > 7.5);
//        StudentChecks sc = s -> s.avgGrade > 7.5;
//        info.testStudents(students, sc);
//        System.out.println("--------------------");
//        info.testStudents(students, (Student s) -> {
//            return s.age < 25;
//        });
//        System.out.println("--------------------");
//        info.testStudents(students, (Student s) -> {
//            return s.age > 22 && s.avgGrade < 8.5 && s.sex == 'f';
//        });
//        info.printStOverGrade(students, 7.5);
//        System.out.println("--------------------");
//        info.printStUnderAge(students, 25);
//        System.out.println("--------------------");
//        info.printStMixCondition(students, 22, 9.5, 'f');
//        Predicate<Student> p1 = student -> student.avgGrade > 8.0;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//        info.testStudents(students, p1.negate());
//        info.testStudents(students, p1.and(p2));
//        System.out.println("--------------------");
//        info.testStudents(students, p1.or(p2));
        Function<Student, Double> f = student -> student.avgGrade;
        double res = avgOfSmth(students, stud -> (double) stud.age);
        System.out.println(res);
    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student st : list) {
            result += f.apply(st);
        }
        result = result / list.size();
        return result;
    }

}

//interface StudentChecks {
//    boolean check(Student s);
//}
//
//class CheckOverGrade implements StudentChecks {
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 7.5;
//    }
//
//}

