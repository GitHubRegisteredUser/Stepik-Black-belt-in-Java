package P4.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {

    public static void main(String[] args) {
        TreeSet<Student> tS = new TreeSet<>();
        Student st1 = new Student("Zaur", 3);
        Student st2 = new Student("Marina", 2);
        Student st3 = new Student("Mikhail", 1);
        Student st4 = new Student("Olga", 4);
        Student st5 = new Student("Igor", 5);
        tS.add(st1);
        tS.add(st2);
        tS.add(st3);
        tS.add(st4);
        tS.add(st5);
        Student st6 = new Student("Viktor", 3);
        System.out.println(tS);
        System.out.println(tS.first());
        System.out.println(tS.last());
        System.out.println(tS.headSet(st1));
        System.out.println(tS.tailSet(st1));
        System.out.println(tS.subSet(st2, st4));
        System.out.println(st1.equals(st6));
        System.out.println(st1.hashCode() == st6.hashCode());
    }

}

class Student implements Comparable<Student> {

    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

}
