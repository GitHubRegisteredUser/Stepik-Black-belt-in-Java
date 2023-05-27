package P4.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {

    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 3);
        Student st2 = new Student("Marina", 2);
        Student st3 = new Student("Mikhail", 1);
        Student st4 = new Student("Olga", 4);
        Student st5 = new Student("Igor", 5);

        PriorityQueue<Student> pQ = new PriorityQueue<>();
        pQ.add(st1);
        pQ.add(st2);
        pQ.add(st3);
        pQ.add(st4);
        pQ.add(st5);
        System.out.println(pQ.poll());
        System.out.println(pQ.poll());
        System.out.println(pQ.poll());
        System.out.println(pQ.poll());
        System.out.println(pQ.poll());
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